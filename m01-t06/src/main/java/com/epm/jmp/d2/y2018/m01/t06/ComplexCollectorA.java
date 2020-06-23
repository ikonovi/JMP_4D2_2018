package com.epm.jmp.d2.y2018.m01.t06;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 *
 * Collects fields field1 and field3 of objects of type ComplexClassA into map.
 *
 */
public class ComplexCollectorA implements
        Collector<ComplexClassA, Hashtable<Integer, Character>, Hashtable<Integer, Character>> {

    @Override
    public Supplier<Hashtable<Integer, Character>> supplier() {
        return Hashtable::new;
    }

    @Override
    public BiConsumer<Hashtable<Integer, Character>, ComplexClassA> accumulator() {
        return (map, classA) -> map.put(classA.getField1(), classA.getField3());  // !!
    }

    @Override
    public BinaryOperator<Hashtable<Integer, Character>> combiner() {
        return (map1, map2) -> {
            map1.putAll(map2);
            return map1;
        };
    }

    @Override
    public Function<Hashtable<Integer, Character>, Hashtable<Integer, Character>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        Set<Characteristics> characteristics = new HashSet<>();
        characteristics.add(Characteristics.IDENTITY_FINISH);
        characteristics.add(Characteristics.UNORDERED);
        characteristics.add(Characteristics.CONCURRENT);
        return characteristics;
    }
}
