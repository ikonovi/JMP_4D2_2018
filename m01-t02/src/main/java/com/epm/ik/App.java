package com.epm.ik;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person person0 = new Person("Alex", 12);
        Person person1 = new Person("Bobby", 22);
        Person person2 = new Person("Romeo", 30);
        Person person3 = new Person("Baraded", 76);
        Person person4 = new Person("Julietta", 14);
        Person person5 = new Person("Zorro", 33);

        List<Person> persons = new ArrayList<>();
        persons.add(person0);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        Comparator<Person> byName = (Person p1, Person p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Person> byAge =
                (onePerson, anotherPerson) -> onePerson.getAge() - anotherPerson.getAge();

       System.out.println(" Sorted by Name:");
       persons.sort(byName);
       persons.forEach(System.out::println);

       System.out.println(" Sorted by Age:");
       persons.sort(byAge);
       persons.forEach(System.out::println);

    }

}
