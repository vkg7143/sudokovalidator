package org.vivek.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.vivek.sudokuValidatorTool.DriverProgram;

import java.util.Arrays;

public class SudokuValidator {
    private static final Logger LOG = LogManager.getLogger(DriverProgram.class);
    static final int N=9;
    public boolean isValidSudoku(int[][] board)
    {

         // Check if all elements of board[][]
        // stores value in the range[1, 9]
        if (!SudokuElementValidator.isinRange(board))
        {
            return false;
        }

        // Stores unique value
        // from 1 to N
        boolean[] unique = new boolean[N + 1];

        // Traverse each row of
        // the given array
        for(int i = 0; i < N; i++)
        {

            // Initialize unique[]
            // array to false
            Arrays.fill(unique, false);

            // Traverse each column
            // of current row
            for(int j = 0; j < N; j++)
            {

                // Stores the value
                // of board[i][j]
                int Z = board[i][j];

                // Check if current row
                // stores duplicate value
                if (unique[Z])
                {   int t1,t2;
                t1=i;
                t2=j;
                t1=t1+1;t2=t2+1;
                    LOG.error("Error :"+ "Row:"+t1+"  "+"Column:"+t2);
                        return false;

                }
                unique[Z] = true;
            }
        }

        // Traverse each column of
        // the given array
        for(int i = 0; i < N; i++)
        {

            // Initialize unique[]
            // array to false
            Arrays.fill(unique, false);

            // Traverse each row
            // of current column
            for(int j = 0; j < N; j++)
            {

                // Stores the value
                // of board[j][i]
                int Z = board[j][i];

                // Check if current column
                // stores duplicate value
                if (unique[Z])
                {
                    int t1,t2;
                    t1=i;
                    t2=j;
                    t1=t1+1;t2=t2+1;
                    LOG.error("Error :"+ "Row:"+t1+"  "+"Column:"+t2);
                    return false;
                }
                unique[Z] = true;
            }
        }

        // Traverse each block of
        // size 3 * 3 in board[][] array
        for(int i = 0; i < N - 2; i += 3)
        {

            // j stores first column of
            // each 3 * 3 block
            for(int j = 0; j < N - 2; j += 3)
            {

                // Initialize unique[]
                // array to false
                Arrays.fill(unique, false);

                // Traverse current block
                for(int k = 0; k < 3; k++)
                {
                    for(int l = 0; l < 3; l++)
                    {

                        // Stores row number
                        // of current block
                        int X = i + k;

                        // Stores column number
                        // of current block
                        int Y = j + l;

                        // Stores the value
                        // of board[X][Y]
                        int Z = board[X][Y];

                        // Check if current block
                        // stores duplicate value
                        if (unique[Z])
                        {
                            int t1,t2;
                            t1=i;
                            t2=j;
                            t1=t1+1;t2=t2+1;
                            LOG.error("Error :"+ "Row:"+t1+"  "+"Column:"+t2);
                            return false;
                        }
                        unique[Z] = true;
                    }
                }
            }
        }

        // If all conditions satisfied
        return true;
    }
    }

