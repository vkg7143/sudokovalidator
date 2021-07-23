package org.vivek.sudokuValidatorTool;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.vivek.util.FileReader;
import org.vivek.util.SudokuValidator;

public class DriverProgram {
    private static final Logger LOG = LogManager.getLogger(DriverProgram.class);

    public static void main(String[] args) {

        try {
            if (args.length<1)
                LOG.error("Enter file name ");
            }
        catch (IllegalArgumentException e)
        {
            LOG.error(e.getMessage());
        }
        String fileName=args[0];
        int[][] board;
        FileReader fileReader=new FileReader();
        SudokuValidator sudokuValidator =new SudokuValidator();
        board=  fileReader.fileTo2D(fileName);
        if(sudokuValidator.isValidSudoku(board)) {
            LOG.info("Sudoko is valid"); }
        else{
            LOG.info("Sudoko is invalid");
        }

    }
}
