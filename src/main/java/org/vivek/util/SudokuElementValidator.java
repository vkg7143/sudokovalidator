package org.vivek.util;

public class SudokuElementValidator {
static final int N=9;
    // Function to check if all elements
// of the board[][] array store
// value in the range[1, 9]
  public  static boolean isinRange(int[][] board)
    {

        // Traverse board[][] array
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {

                // Check if board[i][j]
                // lies in the range
                if (board[i][j] <= 0 ||
                        board[i][j] > 9)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
