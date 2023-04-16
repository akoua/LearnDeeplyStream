package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathStreamClass2 {

    public Number getAverageofListNumber(List<Number> numbers) {
        try {
            return numbers.stream()
                    .mapToDouble(Number::doubleValue).average().orElseThrow(() -> new Exception("Moyenne pas possible à calculer"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Number getAverageByCollecting(List<Number> numbers) {
        return numbers.stream()
                .collect(Collectors.averagingDouble(n -> n.doubleValue()));
    }

    public Number getMinMultipleNumber(List<Number> numbers) {
        return numbers.stream()
                .mapToInt(n -> n.intValue() * 2).min().orElseThrow();
    }

    public List<List<Integer>> getListOfMapWithStreamMapOperation(List<Number> numbers) {
        return numbers.stream()
                .map(n -> Arrays.asList(n.intValue(), n.intValue()))
                .toList();
    }

    public List<Integer> getListOfMapWithStreamFlatMapOperation(List<Number> numbers) {
        return numbers.stream()
                .flatMap(n -> Arrays.asList(n.intValue(), n.intValue()).stream())
                .toList();
    }
}
