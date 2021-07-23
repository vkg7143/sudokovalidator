package org.vivek.sudokuValidator.Test;

import org.junit.Assert;
import org.junit.Test;
import org.vivek.util.FileReader;
import org.vivek.util.SudokuValidator;

public class FileReaderTest {
    @Test
    public void fileto2DTest()
    {
        int[][] board;
        FileReader fileReader=new FileReader();
        SudokuValidator sudokuValidator=new SudokuValidator();
        String fileName="src\\main\\resources\\sudoku.txt";
        board= fileReader.fileTo2D(fileName);
        Assert.assertEquals(board.length,9);
    }
}
