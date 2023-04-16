package org.example.services;

import java.util.stream.Stream;

/**
 * Create stream by factory method
 */
public class StreamByFactory {

    public Stream<Integer> createStreamOfInteger() {
        return Stream.of(1, 2, 3);
    }
}
