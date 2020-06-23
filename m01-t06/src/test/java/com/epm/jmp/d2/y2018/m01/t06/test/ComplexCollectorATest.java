package com.epm.jmp.d2.y2018.m01.t06.test;

import static org.junit.Assert.assertTrue;

import com.epm.jmp.d2.y2018.m01.t06.ComplexClassA;
import com.epm.jmp.d2.y2018.m01.t06.ComplexCollectorA;
import org.junit.Test;

import java.util.Hashtable;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class ComplexCollectorATest {

    @Test
    public void test4Z() {

        ComplexClassA a1 = new ComplexClassA(4, false, 'Z');
        Stream<ComplexClassA> stream = Stream.of(a1);

        Collector<ComplexClassA, Hashtable<Integer, Character>, Hashtable<Integer, Character>> collector =
                new ComplexCollectorA();
        Hashtable<Integer, Character> result = stream.collect(collector);

        assertTrue(result.containsKey(4));
        assertTrue(result.containsValue('Z'));
    }

}
