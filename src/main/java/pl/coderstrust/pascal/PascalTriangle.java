package pl.coderstrust.pascal;

/**
 * Created by Adam on 2018-02-05.
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static void main(String[] args) {
        int rows = 5;
        List<String> result = pascalTriangle(rows);
        for (String line : result) {
            System.out.println(line);
        }
    }

    public static List<String> pascalTriangle(int rows) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            String line = "";
            for (int k = 0; k < rows - i; k++) {
                line += " ";
            }
            for (int j = 0; j <= i; j++) {
                line += (pascal(i, j) + " ");
            }
            result.add(line);

        }
        return result;
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}