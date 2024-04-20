/**
 * Description for Connect4Logic
 *
 * @author Shane deHaas
 * @version 3.001
 *
 */

package core;


import static ui.Connect4TextConsole.printBoard;
import java.util.Scanner;
import ui.Connect4GUI;



import core.Connect4ComputerPlayer;





public class Connect4Logic{
    public static void main(String[] args) {



        boolean useGUI = false;

        String guiChoice = "";

        System.out.println("Begin game. Enter 'T' if you want a text interface or 'G' if you want a graphics interface.");



        while(!guiChoice.equals("G") && !guiChoice.equals("g") && !guiChoice.equals("T") && !guiChoice.equals("t")) {

            Scanner inputGUI = new Scanner(System.in);
            guiChoice = inputGUI.nextLine();
            if (guiChoice.equals("G") || guiChoice.equals("g")) {
                useGUI = true;
                Connect4GUI.main(args);
                break;
            }
            if (guiChoice.equals("T")|| guiChoice.equals("t")){
                useGUI = false;
                playGameText();
                break;
            }
            System.out.println("Invalid input. Enter 'T' if you want a text interface or 'G' if you want a graphics interface.");

        }





    }

    public static void playGameText(){
        boolean compPlayer = false;
        String playerChoice = "";
        boolean gameOver = false;
        System.out.println("Enter 'P' if you want to play against a player, 'C' if you want to play against the computer");



        while(!playerChoice.equals("C") && !playerChoice.equals("c") && !playerChoice.equals("P") && !playerChoice.equals("p")) {

            Scanner input = new Scanner(System.in);
            playerChoice = input.nextLine();
            if (playerChoice.equals("C") || playerChoice.equals("c")) {
                compPlayer = true;
                break;
            }
            if (playerChoice.equals("P")|| playerChoice.equals("p")){
                compPlayer = false;
                break;
            }
            System.out.println("Invalid input. Enter 'P' if you want to play against a player, 'C' if you want to play against the computer");

        }



        char[][] board = new char[6][7];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = ' ';
            }
        }


        for(int i = 0; i<=42; i++){

            printBoard(board);




            gameOver = checkWinX(board);
            if(gameOver==true){
                System.out.println("Player X won the game");
                break;
            }
            gameOver = checkWinO(board);
            if(gameOver==true){

                System.out.println("Player O won the game");
                break;
            }
            if(i == 42){
                System.out.println("The game is a draw");
                break;
            }

            if(i%2==0){
                board = dropPieceX(board);
            }

            else{
                board = dropPieceO(board, compPlayer);
            }
        }
    }

    /**
     * Description: checking if player X has won.
     *
     * @param board
     * @return bool
     */
    public static boolean checkWinX(char[][] board){

        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length - 3; j++){
                if (board[i][j] == 'X' && board[i][j+1] == 'X' && board[i][j+2] == 'X' && board[i][j+3] == 'X'){
                    return true;
                }
            }
        }

        for(int i = 0; i < board.length - 3; i++){
            for(int j = 0; j < board[0].length; j++){
                if (board[i][j] == 'X' && board[i+1][j] == 'X' && board[i+2][j] == 'X' && board[i+3][j] == 'X'){
                    return true;
                }
            }
        }
        /**
         * Description: initial logic for diag check didn't work, tired of fighting it.
         * I know it's a long mess but I'm hardcoding every possible diag combination, fix later
         */
        if(board[5][0] == 'X' && board[4][1] == 'X' && board[3][2] == 'X' && board[2][3] == 'X'){
            return true;
        }
        if(board[5][1] == 'X' && board[4][2] == 'X' && board[3][3] == 'X' && board[2][4] == 'X'){
            return true;
        }
        if(board[5][2] == 'X' && board[4][3] == 'X' && board[3][4] == 'X' && board[2][5] == 'X'){
            return true;
        }
        if(board[5][3] == 'X' && board[4][4] == 'X' && board[3][5] == 'X' && board[2][6] == 'X'){
            return true;
        }
        if(board[4][0] == 'X' && board[3][1] == 'X' && board[2][2] == 'X' && board[1][3] == 'X'){
            return true;
        }
        if(board[4][0] == 'X' && board[3][2] == 'X' && board[2][3] == 'X' && board[1][4] == 'X'){
            return true;
        }
        if(board[4][0] == 'X' && board[3][3] == 'X' && board[2][4] == 'X' && board[1][5] == 'X'){
            return true;
        }
        if(board[4][0] == 'X' && board[3][4] == 'X' && board[2][5] == 'X' && board[1][6] == 'X'){
            return true;
        }
        if(board[3][0] == 'X' && board[2][1] == 'X' && board[1][2] == 'X' && board[0][3] == 'X'){
            return true;
        }
        if(board[3][0] == 'X' && board[2][1] == 'X' && board[1][3] == 'X' && board[0][4] == 'X'){
            return true;
        }
        if(board[3][0] == 'X' && board[2][1] == 'X' && board[1][4] == 'X' && board[0][5] == 'X'){
            return true;
        }
        if(board[3][0] == 'X' && board[2][1] == 'X' && board[1][5] == 'X' && board[0][6] == 'X'){
            return true;
        }
        if(board[5][6] == 'X' && board[4][5] == 'X' && board[3][4] == 'X' && board[2][3] == 'X'){
            return true;
        }
        if(board[5][5] == 'X' && board[4][4] == 'X' && board[3][3] == 'X' && board[2][2] == 'X'){
            return true;
        }
        if(board[5][4] == 'X' && board[4][3] == 'X' && board[3][2] == 'X' && board[2][1] == 'X'){
            return true;
        }
        if(board[5][3] == 'X' && board[4][2] == 'X' && board[3][1] == 'X' && board[2][0] == 'X'){
            return true;
        }
        if(board[4][6] == 'X' && board[3][5] == 'X' && board[2][4] == 'X' && board[1][3] == 'X'){
            return true;
        }
        if(board[4][5] == 'X' && board[3][4] == 'X' && board[2][3] == 'X' && board[1][2] == 'X'){
            return true;
        }
        if(board[4][4] == 'X' && board[3][3] == 'X' && board[2][2] == 'X' && board[1][1] == 'X'){
            return true;
        }
        if(board[4][3] == 'X' && board[3][2] == 'X' && board[2][1] == 'X' && board[1][0] == 'X'){
            return true;
        }
        if(board[3][6] == 'X' && board[2][5] == 'X' && board[1][4] == 'X' && board[0][3] == 'X'){
            return true;
        }
        if(board[3][5] == 'X' && board[2][4] == 'X' && board[1][3] == 'X' && board[0][2] == 'X'){
            return true;
        }
        if(board[3][4] == 'X' && board[2][3] == 'X' && board[1][2] == 'X' && board[0][1] == 'X'){
            return true;
        }
        if(board[3][3] == 'X' && board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == 'X'){
            return true;
        }
        return false;
    }


    /**
     * Description: checking if player O has won
     *
     * @param board
     * @return bool
     */
    public static boolean checkWinO(char[][] board){

        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length - 3; j++){
                if (board[i][j] == 'O' && board[i][j+1] == 'O' && board[i][j+2] == 'O' && board[i][j+3] == 'O'){
                    return true;
                }
            }
        }

        for(int i = 0; i < board.length - 3; i++){
            for(int j = 0; j < board[0].length; j++){
                if (board[i][j] == 'O' && board[i+1][j] == 'O' && board[i+2][j] == 'O' && board[i+3][j] == 'O'){
                    return true;
                }
            }
        }

        /**
         * Description: initial logic for diag check didn't work, tired of fighting it.
         * I know it's a long mess but I'm hardcoding every possible diag combination, fix later
         */
        if(board[5][0] == 'O' && board[4][1] == 'O' && board[3][2] == 'O' && board[2][3] == 'O'){
            return true;
        }
        if(board[5][1] == 'O' && board[4][2] == 'O' && board[3][3] == 'O' && board[2][4] == 'O'){
            return true;
        }
        if(board[5][2] == 'O' && board[4][3] == 'O' && board[3][4] == 'O' && board[2][5] == 'O'){
            return true;
        }
        if(board[5][3] == 'O' && board[4][4] == 'O' && board[3][5] == 'O' && board[2][6] == 'O'){
            return true;
        }
        if(board[4][0] == 'O' && board[3][1] == 'O' && board[2][2] == 'O' && board[1][3] == 'O'){
            return true;
        }
        if(board[4][0] == 'O' && board[3][2] == 'O' && board[2][3] == 'O' && board[1][4] == 'O'){
            return true;
        }
        if(board[4][0] == 'O' && board[3][3] == 'O' && board[2][4] == 'O' && board[1][5] == 'O'){
            return true;
        }
        if(board[4][0] == 'O' && board[3][4] == 'O' && board[2][5] == 'O' && board[1][6] == 'O'){
            return true;
        }
        if(board[3][0] == 'O' && board[2][1] == 'O' && board[1][2] == 'O' && board[0][3] == 'O'){
            return true;
        }
        if(board[3][0] == 'O' && board[2][1] == 'O' && board[1][3] == 'O' && board[0][4] == 'O'){
            return true;
        }
        if(board[3][0] == 'O' && board[2][1] == 'O' && board[1][4] == 'O' && board[0][5] == 'O'){
            return true;
        }
        if(board[3][0] == 'O' && board[2][1] == 'O' && board[1][5] == 'O' && board[0][6] == 'O'){
            return true;
        }
        if(board[5][6] == 'O' && board[4][5] == 'O' && board[3][4] == 'O' && board[2][3] == 'O'){
            return true;
        }
        if(board[5][5] == 'O' && board[4][4] == 'O' && board[3][3] == 'O' && board[2][2] == 'O'){
            return true;
        }
        if(board[5][4] == 'O' && board[4][3] == 'O' && board[3][2] == 'O' && board[2][1] == 'O'){
            return true;
        }
        if(board[5][3] == 'O' && board[4][2] == 'O' && board[3][1] == 'O' && board[2][0] == 'O'){
            return true;
        }
        if(board[4][6] == 'O' && board[3][5] == 'O' && board[2][4] == 'O' && board[1][3] == 'O'){
            return true;
        }
        if(board[4][5] == 'O' && board[3][4] == 'O' && board[2][3] == 'O' && board[1][2] == 'O'){
            return true;
        }
        if(board[4][4] == 'O' && board[3][3] == 'O' && board[2][2] == 'O' && board[1][1] == 'O'){
            return true;
        }
        if(board[4][3] == 'O' && board[3][2] == 'O' && board[2][1] == 'O' && board[1][0] == 'O'){
            return true;
        }
        if(board[3][6] == 'O' && board[2][5] == 'O' && board[1][4] == 'O' && board[0][3] == 'O'){
            return true;
        }
        if(board[3][5] == 'O' && board[2][4] == 'O' && board[1][3] == 'O' && board[0][2] == 'O'){
            return true;
        }
        if(board[3][4] == 'O' && board[2][3] == 'O' && board[1][2] == 'O' && board[0][1] == 'O'){
            return true;
        }
        if(board[3][3] == 'O' && board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == 'O'){
            return true;
        }


        return false;
    }

    /**
     * Description: getting input from player X for move, testing for valid move, then updating board and returning.
     * @param board
     * @return board
     */
    public static char[][] dropPieceX(char[][] board){

        Scanner sc = new Scanner(System.in);
        System.out.println("Player X, please enter a column number (1-7): ");
        int col = sc.nextInt();
        while(col < 1 || col > 7 || board[0][col-1] == 'X' || board[0][col-1] == 'O'){
            System.out.println("Invalid column number. Please enter a column number (1-7): ");
            col = sc.nextInt();
        }
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][col-1] == ' '){
                board[i][col-1] = 'X';
                break;
            }
        }

        return board;
    }

    /**
     * Description: getting input from player O for move, testing for valid move, then updating board and returning.
     * @param board
     * @return board
     */
    public static char[][] dropPieceO(char[][] board, boolean compPlayer){
        int col = 0;
        if(compPlayer == false){
            Scanner sc = new Scanner(System.in);
            System.out.println("Player 0, please enter a column number (1-7): ");
            col = sc.nextInt();

        }
        else{
            col = Connect4ComputerPlayer.connect4ComputerPlayer(board);
            System.out.println(col);
        }

        while(col < 1 || col > 7 || board[0][col-1] == 'X' || board[0][col-1] == 'O'){
            System.out.println("Invalid column number. Please enter a column number (1-7): ");
            Scanner sc = new Scanner(System.in);
            col = sc.nextInt();
        }
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][col-1] == ' '){
                board[i][col-1] = 'O';
                break;
            }
        }

        return board;
    }

}