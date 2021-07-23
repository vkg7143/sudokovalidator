package org.vivek.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * File reader reads the file and emits the 2D array.
 * @parm fileName fileName is to get the file name.
 * @return return the 2D array.
 */
public class FileReader {

    public  int [][] fileTo2D(String fileName)
    {
        int[][] board = null;
        File file = new File(fileName);
        try {
            Scanner sizeScanner = new Scanner(file);
            String[] temp = sizeScanner.nextLine().split(",");
            sizeScanner.close();
            int nMatrix = temp.length;

            Scanner scanner = new Scanner(file);
            board = new int[nMatrix][nMatrix];
            for (int i = 0; i < nMatrix; i++) {
                String[] numbers = scanner.nextLine().split(",");
                for (int j = 0; j < nMatrix; j++) {
                    board[i][j] = Integer.parseInt(numbers[j]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return board;
    }
}
