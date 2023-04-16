package org.example.services;

import org.example.entity.Person;

import java.util.List;
import java.util.Map;

public class PersonService {

    public List<Person> selectPersonWhichAreUnder25YearsOld(List<Person> personList) {
        return personList.stream()
                .filter(p -> p.getAge() <= 25)
                .toList();
    }

    public Person selectTheOldestPersonWhichAreUnder25YearsOld(List<Person> personList) {
        try {
            return personList.stream()
                    .filter(p -> p.getAge() <= 25)
                    .max((p1, p2) -> p1.getAge().compareTo(p2.getAge()))
                    .orElseThrow(() -> new Exception("Comparaison d'âge impossible"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, String> selectTheOldestPersonWhichAreUnder25YearsOldLikeMapOfNameAndAge(List<Person> personList) {
        try {
            return personList.stream()
                    .filter(p -> p.getAge() <= 25)
                    .max((p1, p2) -> p1.getAge().compareTo(p2.getAge()))
                    .map(p -> Map.of(p.getFirstName(), p.getAge().toString()))
                    .orElseThrow(() -> new Exception("Transformation en map impossible"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Person> applyReduceOnPersonList(List<Person> personList) {
        /*personList.stream()
                .reduce((p1, p2) -> p1 == p2)*/
        return personList;
    }
}
