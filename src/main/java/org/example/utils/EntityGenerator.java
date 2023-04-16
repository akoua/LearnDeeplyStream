package org.example.utils;

import org.example.entity.Person;
import org.example.enums.Sexe;
import org.example.enums.SituationMarital;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EntityGenerator {

    public static List<Person> generatePerson(int numberOfPerson) {

        AtomicInteger atomicInteger = new AtomicInteger(0);

        return Stream.generate(() -> {
                    boolean part = new Random().nextBoolean();
                    var person = new Person(part ? "yao" + atomicInteger : "aya" + atomicInteger, part ?
                            "alex" + atomicInteger : "alexendra" + atomicInteger,
                            part ? Sexe.MAN : Sexe.WOMAN,
                            (int) (Math.random() * 100), SituationMarital.SINGLE);
                    atomicInteger.getAndIncrement();
                    return person;
                })
                .limit(numberOfPerson)
                .collect(Collectors.toList());
    }
}
