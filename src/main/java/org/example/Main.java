package org.example;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class Main {
    public static void main(String[] args) {

        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> troisPremierNombrePairAuCarre =
                nombres.stream()
                        .filter(n -> {
                            log.info("filter " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            log.info("map " + n);
                            return n * n;
                        }).limit(2)
                        .toList();
        System.out.println("");
        troisPremierNombrePairAuCarre.forEach(System.out::println);
    }
}