package org.fasttrackit.homework;

import java.util.*;

public class PassportService {
    private final List<Person> waitingList = new ArrayList<>();

    public void addPerson(Person person) {
        waitingList.add(person);
    }

    public List<String> getPersonsName() {
        List<String> result = new ArrayList<>();
        for (Person person : waitingList) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, List<String>> getHairColourToNameMap() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : waitingList) {
            result.putIfAbsent(person.getHairColour(), new ArrayList<>());
            result.get(person.getHairColour()).add(person.getName());
        }
        return result;
    }


    public Map<String, List<String>> getHairColourToNameMap2() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : waitingList) {
            List<String> personList = result.getOrDefault(person.getHairColour(), new ArrayList<>());
            personList.add(person.getName());
            result.putIfAbsent(person.getHairColour(), personList);
        }
        return result;
    }

}
