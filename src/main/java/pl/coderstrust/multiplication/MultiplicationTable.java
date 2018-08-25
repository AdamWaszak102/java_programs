package pl.coderstrust.multiplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2018-02-04.
 */
//public class MultiplicationTable {
//    public static void main(String[] args) {
//        int tableSize = 4;
//
//        MultiplicationTable(tableSize);
//    }
//
//    public static void MultiplicationTable(int tableSize) {
//        // ( góra)
//        System.out.format("     ");
//        for (int i = 1; i <= tableSize; i++) {
//            System.out.format("%4d", i);
//        }
//        System.out.println();
//        System.out.println(" ");
//        for (int i = 1; i <= tableSize; i++) {
//            //(lewo)
//            System.out.format("%4d ", i);
//            for (int j = 1; j <= tableSize; j++) {
//                System.out.format("%4d", i * j);
//            }
//            System.out.println();
//        }
//    }
//}

public class MultiplicationTable {
    public static void main(String[] args) {
        pressMultiplicationTable(32);
    }

    public static String pressMultiplicationTable(int size) {

        List<String> result = new ArrayList<>();
        String tableShown = "";
        System.out.println("Loaded number = " + size);
        if (size > 32) {
            result.add("We're sorry, we can not display the multiplication table; (Too large number. Please select something from the range up to 32. Have a nice day.");
            tableShown = result.toString().replace("[", "").replace("]", "");
            return tableShown;
        }
        int score = 0;
        String space = "     ";
        String line = space + "     ";
        String table = "   ";

        for (int n = 1; n <= size - 1; n++) {
            if (n >= 9) space = "    ";
            line = line + n + space;
        }

        line = line + size;
        result.add(line);
        result.add("\n");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                score = i * j;
                if (score < 10) {
                    space = "     ";
                } else if (score < 100) {
                    space = "    ";
                } else {
                    space = "   ";
                }
                table = table + space + score;
            }
            result.add(i + table);
            result.add("\n");
            if (i < 9) {
                table = "   ";
            } else if (i < 100) {
                table = "  ";
            }
        }
        tableShown = result.toString().replace("[", "").replace("]", "").replace(",", "");
        System.out.println(tableShown);
        return tableShown;
    }
}