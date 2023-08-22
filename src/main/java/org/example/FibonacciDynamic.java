package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic implements Fibonacci{
    private static final Map<Integer, Long> NUMBER = new HashMap<>();

    @Override
    public long fibonacci(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid number entered!");
        } else if (number <= 1) {
            return number;
        }

        if (NUMBER.containsKey(number)) {
            return NUMBER.get(number);
        }

        long fib = fibonacci(number - 1) + fibonacci(number - 2);
        NUMBER.put(number, fib);
        return fib;
    }
}



