package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathStreamClassTest {

    MathStreamClass streamClass;

    @BeforeEach
    void setUp() {
        streamClass = new MathStreamClass();
    }

    @Test
    void sum_number() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.sumNumber(numberList);
        //then
        assertEquals(10.5, res);
    }

    @Test
    void sum_number_2() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.sumNumber_2(numberList);
        //then
        assertEquals(10.5, res);
    }

    @Test
    void minus_number_1() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.minusNumber_1(numberList);
        //then
        assertEquals(-8.5, res);
    }

    @Test
    void minusNumber_1_with_identity() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.minusNumber_1_with_identity(numberList);
        //then
        assertEquals(-10.5, res);
    }

    @Test
    void minus_number_2() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.minusNumber_2(numberList);
        //then
        assertEquals(-8.5, res);
    }

    @Test
    void average_number_1() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.averageNumber_1(numberList);
        //then
        assertEquals(2.625, res);
    }

    @Test
    void average_number_2() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.averageNumber_2(numberList);
        //then
        assertEquals(2.625, res);
    }
}