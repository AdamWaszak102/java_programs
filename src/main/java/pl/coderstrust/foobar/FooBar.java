package pl.coderstrust.foobar;

/**
 * Created by Adam on 2018-02-04.
 */

import java.util.ArrayList;
import java.util.List;


public class FooBar {


//    public static void main(String[] args) {
//
//        FooBar myObject = new FooBar();
//        String[] result = myObject.fooBar(100);
//
//        for (int i = 1; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//    }
//
//    public String[] fooBar(int n) {
//        String[] fooBarTable = new String[n + 1];
//        for (int i = 1; i < fooBarTable.length; i++) {
//            if (i % 15 == 0) {
//                fooBarTable[i] = i + " FooBar";
//            } else if (i % 5 == 0) {
//                fooBarTable[i] = i + " Bar";
//            } else if (i % 3 == 0) {
//                fooBarTable[i] = i + " Foo";
//            } else
//                fooBarTable[i] = i + "";
//        }
//        return fooBarTable;
//    }


    public static void main(String[] args) {

        List<String> result = pressFoobar();
        System.out.println(result);
    }

    public static List<String> pressFoobar() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                result.add(i + " FooBar");
            } else if (i % 5 == 0) {
                result.add(i + " Bar");
            } else if (i % 3 == 0) {
                result.add(i + " Foo");
            } else
                result.add(Integer.toString(i));
        }
        return result;
    }
}


