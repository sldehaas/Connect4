/**
 * Description: A simple AI logic for computer player. The computer first looks
 * for possible win options then looks for possible block options. If neither
 * are possible, it chooses an available column at random.
 *
 * @author Shane deHaas
 * @version 1.005
 * @param board
 * @returns int compMove for dropPieceO method
 *
 */

package core;
import java.util.Random;
public class Connect4ComputerPlayer {
    public static int connect4ComputerPlayer(char[][] board){
        int compMove;
        compMove = (int)(((Math.random() * 100)) % 7)+1;

        //checking for horizontal wins
        for(int i = 5;i>=0;i--){
            for(int j = 0;j<7;j++){
                if(board[i][j] == ' '){
                    if(j==0){
                        if((board[i][j+1] == 'O')&&(board[i][j+2] == 'O') && (board[i][j+3] == 'O')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==1){
                        if(((board[i][j+1] == 'O')&&(board[i][j+2] == 'O') && (board[i][j+3] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-1] == 'O')&&(board[i][j+2] == 'O') && (board[i][j+3] == 'O')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==2){
                        if(((board[i][j+1] == 'O')&&(board[i][j+2] == 'O') && (board[i][j+3] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'O')&&(board[i][j-1] == 'O') && (board[i][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==3){
                        if(((board[i][j+1] == 'O')&&(board[i][j+2] == 'O') && (board[i][j+3] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'O')&&(board[i][j-1] == 'O') && (board[i][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-3] == 'O')&&(board[i][j-2] == 'O') && (board[i][j-1] == 'O')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==4){
                        if(((board[i][j-1] == 'O')&&(board[i][j-2] == 'O') && (board[i][j-3] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'O')&&(board[i][j-1] == 'O') && (board[i][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-1] == 'O')&&(board[i][j+2] == 'O') && (board[i][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==5){
                        if(((board[i][j-1] == 'O')&&(board[i][j-2] == 'O') && (board[i][j-3] == 'O')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'O')&&(board[i][j-1] == 'O') && (board[i][j+1] == 'O'))  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==6){
                        if(((board[i][j-1] == 'O')&&(board[i][j-2] == 'O') && (board[i][j-3] == 'O'))  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;

                        }
                    }
                }
            }
        }
        //checking for vertical wins
        for(int i = 2;i>=0;i--){
            for(int j = 0;j<7;j++){
                if(board[i][j] == ' '){
                    if(j==0){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==1){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==2){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==3){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==4){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==5){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==6){
                        if((board[i+3][j] == 'O')&&(board[i+2][j] == 'O') && (board[i+1][j] == 'O')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;

                        }
                    }
                }
            }
        }
        //checking for diagonal wins
        for(int i = 2;i>=0;i--){
            for(int j = 0;j<7;j++){
                if(board[i][j] == ' '){
                    if(j==0){
                        if((board[i+3][j+3] == 'O')&&(board[i+2][j+2] == 'O') && (board[i+1][j+1] == 'O') && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==1){
                        if((board[i+3][j+3] == 'O')&&(board[i+2][j+2] == 'O') && (board[i+1][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==2){
                        if((board[i+3][j+3] == 'O')&&(board[i+2][j+2] == 'O') && (board[i+1][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==3){
                        if(((board[i+3][j+3] == 'O')&&(board[i+2][j+2] == 'O') && (board[i+1][j+1] == 'O')  && ((i==5)||board[i+1][j] != ' '))||((board[i+3][j-3] == 'O')&&(board[i+2][j-2] == 'O') && (board[i+1][j-1] == 'O'))  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==4){
                        if((board[i+3][j-3] == 'O')&&(board[i+2][j-2] == 'O') && (board[i+1][j-1] == 'O')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==5){
                        if((board[i+3][j-3] == 'O')&&(board[i+2][j-2] == 'O') && (board[i+1][j-1] == 'O')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;
                        }
                    }
                    if(j==6){
                        if((board[i+3][j-3] == 'O')&&(board[i+2][j-2] == 'O') && (board[i+1][j-1] == 'O') && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Computer wins!");
                            return compMove;

                        }
                    }
                }
            }

        }
        //checking for horizontal blocks
        for(int i = 5;i>=0;i--){
            for(int j = 0;j<7;j++){
                if(board[i][j] == ' '){
                    if(j==0){
                        if((board[i][j+1] == 'X')&&(board[i][j+2] == 'X') && (board[i][j+3] == 'X')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==1){
                        if(((board[i][j+1] == 'X')&&(board[i][j+2] == 'X') && (board[i][j+3] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-1] == 'X')&&(board[i][j+2] == 'X') && (board[i][j+3] == 'X')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==2){
                        if(((board[i][j+1] == 'X')&&(board[i][j+2] == 'X') && (board[i][j+3] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'X')&&(board[i][j-1] == 'X') && (board[i][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==3){
                        if(((board[i][j+1] == 'X')&&(board[i][j+2] == 'X') && (board[i][j+3] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'X')&&(board[i][j-1] == 'X') && (board[i][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-3] == 'X')&&(board[i][j-2] == 'X') && (board[i][j-1] == 'X')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==4){
                        if(((board[i][j-1] == 'X')&&(board[i][j-2] == 'X') && (board[i][j-3] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'X')&&(board[i][j-1] == 'X') && (board[i][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-1] == 'X')&&(board[i][j+2] == 'X') && (board[i][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' '))){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==5){
                        if(((board[i][j-1] == 'X')&&(board[i][j-2] == 'X') && (board[i][j-3] == 'X')  && ((i==5)||board[i+1][j] != ' ')) || ((board[i][j-2] == 'X')&&(board[i][j-1] == 'X') && (board[i][j+1] == 'X'))  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==6){
                        if(((board[i][j-1] == 'X')&&(board[i][j-2] == 'X') && (board[i][j-3] == 'X'))  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;

                        }
                    }
                }
            }
        }
        //checking for vertical blocks
        for(int i = 2;i>=0;i--){
            for(int j = 0;j<7;j++){
                if(board[i][j] == ' '){
                    if(j==0){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==1){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==2){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==3){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==4){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==5){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==6){
                        if((board[i+3][j] == 'X')&&(board[i+2][j] == 'X') && (board[i+1][j] == 'X')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;

                        }
                    }
                }
            }
        }
        //checking for diagonal blocks
        for(int i = 2;i>=0;i--){
            for(int j = 0;j<7;j++){
                if(board[i][j] == ' '){
                    if(j==0){
                        if((board[i+3][j+3] == 'X')&&(board[i+2][j+2] == 'X') && (board[i+1][j+1] == 'X') && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==1){
                        if((board[i+3][j+3] == 'X')&&(board[i+2][j+2] == 'X') && (board[i+1][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==2){
                        if((board[i+3][j+3] == 'X')&&(board[i+2][j+2] == 'X') && (board[i+1][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==3){
                        if(((board[i+3][j+3] == 'X')&&(board[i+2][j+2] == 'X') && (board[i+1][j+1] == 'X')  && ((i==5)||board[i+1][j] != ' '))||((board[i+3][j-3] == 'X')&&(board[i+2][j-2] == 'X') && (board[i+1][j-1] == 'X'))  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==4){
                        if((board[i+3][j-3] == 'X')&&(board[i+2][j-2] == 'X') && (board[i+1][j-1] == 'X')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==5){
                        if((board[i+3][j-3] == 'X')&&(board[i+2][j-2] == 'X') && (board[i+1][j-1] == 'X')  && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;
                        }
                    }
                    if(j==6){
                        if((board[i+3][j-3] == 'X')&&(board[i+2][j-2] == 'X') && (board[i+1][j-1] == 'X') && ((i==5)||board[i+1][j] != ' ')){
                            compMove = j+1;
                            System.out.println("Blocked!");
                            return compMove;

                        }
                    }
                }
            }

        }

        while(board[0][compMove-1] != ' '){
            compMove = (int)(((Math.random() * 100)) % 7)+1;
        }
        return compMove;
    }
}

