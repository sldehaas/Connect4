/**
 * Description for Connect4TextConsole
 *
 * @author Shane deHaas
 * @version 1.001
 *
 */
package ui;

public class Connect4TextConsole{

    /**
     * Description: does nothing but print the board after it's updated in Connect4Logic
     * @param board
     */
    public static void printBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X'){
                    System.out.print("| X ");
                }
                else if(board[i][j] == 'O'){
                    System.out.print("| O ");
                }
                else{
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  1   2   3   4   5   6   7");
    }






}
