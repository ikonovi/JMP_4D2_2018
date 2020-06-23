package com.epm.jmp.d2.y2018.m06.t02.test.junit5;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorTest_fibonacci {

    private static Calcable calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testFibonacci() {
        int numCount = 20;
        int[] fibs = calc.fibonacci(numCount);

        // print out
        List<Integer> list =
                (ArrayList<Integer>) Arrays.stream(fibs).boxed().collect(Collectors.toList());
        list.forEach(d -> System.out.print(d + ", "));

        assertThat(list, allOf(hasItems(3, 5, 8, 13),
                            not(hasItem(Integer.valueOf(-1)))));
    }
}
