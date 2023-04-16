package org.example.services;

import org.example.entity.Person;
import org.example.utils.EntityGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PersonServiceTest {

    PersonService personService;
    List<Person> personList;
    Pattern pattern;
    Matcher matcher;

    @BeforeEach
    void setUp() {
        personService = new PersonService();
        //it's difficult to do the correct verification with aleatory data, so it's can be incorrect
        personList = EntityGenerator.generatePerson(50);
        pattern = Pattern.compile("(?:yao|aya|alex|alexandra)?[0-9]+");
    }

    @Test
    void selectPersonWhichAreUnder25YearsOld() {
        //when
        var result = personService.selectPersonWhichAreUnder25YearsOld(personList);
        //then
        Assertions.assertTrue(result.size() > 0);
    }

    @Test
    void selectTheOldestPersonWhichAreUnder25YearsOld() {
        var firstResult = personService.selectPersonWhichAreUnder25YearsOld(personList);
        //when
        var result = personService.selectTheOldestPersonWhichAreUnder25YearsOld(firstResult);
        //then
        Assertions.assertTrue(pattern.matcher(result.getFirstName()).find());
    }

    @Test
    void selectTheOldestPersonWhichAreUnder25YearsOldLikeMapOfNameAndAge() {
        //when
        var result = personService.selectTheOldestPersonWhichAreUnder25YearsOldLikeMapOfNameAndAge(personList);
        //then
        Assertions.assertInstanceOf(Map.class, result);
        //pattern allows us to verify that each entry contains the values with expected
        Assertions.assertTrue(pattern.matcher(result.keySet().stream().findFirst().orElseThrow()).find());
        Assertions.assertTrue(pattern.matcher(result.values().stream().findFirst().orElseThrow()).find());
    }
}