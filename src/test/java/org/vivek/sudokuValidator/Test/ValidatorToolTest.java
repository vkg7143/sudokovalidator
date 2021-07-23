package org.vivek.sudokuValidator.Test;

import org.junit.Assert;
import org.junit.Test;
import org.vivek.util.SudokuElementValidator;


public class ValidatorToolTest {
    int[][] board={{7, 9, 2, 1, 5, 4, 3, 8, 6},
            {6, 4, 3, 8, 2, 7, 1, 5, 9},
            {8, 5, 1, 3, 9, 6, 7, 2, 4},
            {2, 6, 5, 9, 7, 3, 8, 4, 1},
            {4, 8, 9, 5, 6, 1, 2, 7, 3},
            {3, 1, 7, 4, 8, 2, 9, 6, 5},
            {1, 3, 6, 7, 4, 8, 5, 9, 2},
            {9, 7, 4, 2, 1, 5, 6, 3, 8},
            {5, 2, 8, 6, 3, 9, 4, 1, 7}};
    @Test
    public void sudokuRangeValidatorTest() {
        Assert.assertTrue(SudokuElementValidator.isinRange(board));
    }
    @Test
    public void sudokuValidator() {
        Assert.assertTrue(SudokuElementValidator.isinRange(board));
    }

}
