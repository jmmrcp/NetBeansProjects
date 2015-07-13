/*******************************************************************************
 * SudoKiller.java - A Graphical Java Sudoku solver                            *
 *                                                                             *
 * Source code is made up of multiple files (one for each class) that are      *
 * shown, here, sequentially.                                                  *
 *                                                                             *
 * Download sources                                                            *
 *******************************************************************************/

/*******************************************************************************
 * Main.java                                                                   *
 *******************************************************************************/
package sudoku;

/**
 * Sudoku game solver.
 * It creates a GUI with a default puzzle; you can replace it with the puzzle
 * you want to solve. Then click the 'Start' button (or type 'ALT-s') to get the
 * solution.
 *
 * @author Daniele Mazzocchio
 * @version 1.0
 */
public class Main {
    
    /**
     * Creates the GUI with a default puzzle.
     * @param args
     * @params args Command-line arguments (unused)
     */
    public static void main(String[] args) {
        int[][] board = {{0, 7, 0, 0, 0, 0, 1, 0, 0},
                         {5, 0, 0, 0, 2, 0, 0, 6, 0},
                         {0, 0, 6, 1, 0, 9, 0, 7, 0},
                         {3, 0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 4, 0, 0, 1, 5, 2, 3},
                         {0, 1, 0, 4, 6, 0, 0, 0, 0},
                         {1, 6, 3, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 8, 3, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 2, 0, 0, 9}};
        
        new SwingSudoKiller(new SwingSudokuBoard(board));
    }   
}
