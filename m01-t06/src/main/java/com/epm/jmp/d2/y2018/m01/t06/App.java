package com.epm.jmp.d2.y2018.m01.t06;

import java.util.Hashtable;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class App {


    public static void main(String[] args) {

        Stream<ComplexClassA> objectsOfATypeStream = Stream
                .generate(() ->
                        new ComplexClassA(1 + new Random().nextInt(26),
                        new Random().nextBoolean(),
                        (char) ('A' + new Random().nextInt(26))))
                .limit(200)
                .peek(System.out::println);

        Collector<ComplexClassA, Hashtable<Integer, Character>, Hashtable<Integer, Character>> myCollector =
                new ComplexCollectorA();

        Hashtable<Integer, Character> result = objectsOfATypeStream.parallel().collect(myCollector);

        result.forEach((k, v) -> System.out.format("%s - %s \n", k, v));
    }
}
