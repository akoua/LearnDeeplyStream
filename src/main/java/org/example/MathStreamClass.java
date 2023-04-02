package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class MathStreamClass {

    /**
     * Allow to sum all numbers
     */
    public Number sumNumber(List<Number> numbers){
        return numbers.stream()
                .collect(Collectors.summingDouble(r -> r.doubleValue()));
    }

    /**
     * Allow to sum all numbers
     */
    public Number sumNumber_2(List<Number> numbers){
        return numbers.stream()
                .mapToDouble(r -> r.doubleValue()).sum();
    }

    /**
     * Allow to minus all numbers
     */
    public Number minusNumber_1(List<Number> numbers){
        return numbers.stream()
                .collect(Collectors.reducing((number, number2) -> number.doubleValue() - number2.doubleValue())).orElseThrow(() -> new RuntimeException("Minus is impossible"));
    }

    /**
     * Allow to minus all numbers, with identity
     * NB: identity is use like the first number
     */
    public Number minusNumber_1_with_identity(List<Number> numbers){
        return numbers.stream()
                .collect(Collectors.reducing(0, (number, number2) -> number.doubleValue() - number2.doubleValue()));
    }

    /**
     * Allow to minus another way
     */
    public Number minusNumber_2(List<Number> numbers){
        return numbers.stream()
                .mapToDouble(r -> r.doubleValue()).reduce((val1, val2) -> val1 -val2).orElseThrow( () -> new RuntimeException("Minus is impossible"));
    }

    /**
     * Allow to get average by collector
     */
    public Number averageNumber_1(List<Number> numbers){
        return numbers.stream()
                .collect(Collectors.averagingDouble(d -> d.doubleValue()));
    }

    /**
     * Allow to get average by other method
     */
    public Number averageNumber_2(List<Number> numbers){
        return numbers.stream()
                .mapToDouble(r -> r.doubleValue()).average().orElse(0.0);
    }
}
