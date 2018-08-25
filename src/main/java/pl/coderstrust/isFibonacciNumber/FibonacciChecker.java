package pl.coderstrust.isFibonacciNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by Adam on 2018-03-21.
 */
public class FibonacciChecker {

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> System.out.println(i + "->" + new FibonacciChecker()
                .isFibonacciNumber
                        (i)));
    }

    private Set<Long> fibonacciNumbers = calculateFibonacci(99);

    boolean isFibonacciNumber(long number) {
        return fibonacciNumbers.contains(number);
    }

    public HashSet<Long> calculateFibonacci(long fibonacciNumberInOrder) {
        long number = 0;
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(1l);

        for (int i = 1; i <= fibonacciNumberInOrder; i++) {
            number = list.get(i) + list.get(i - 1);
            list.add(number);
        }
        HashSet<Long> set = new HashSet<Long>(list);
        return set;
    }
}



