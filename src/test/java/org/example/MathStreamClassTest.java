package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathStreamClassTest {

    MathStreamClass streamClass;
    MathStreamClass2 streamClass2;

    @BeforeEach
    void setUp() {
        streamClass = new MathStreamClass();
        streamClass2 = new MathStreamClass2();
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
    void sumNumber_foreach_3_test() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass.sumNumber_foreach_3(numberList);
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
        res = streamClass2.getAverageofListNumber(numberList);
        res = streamClass2.getAverageByCollecting(numberList);
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

    @Test
    void get_multiple_minimum() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3, 4.5);
        //when
        Number res = streamClass2.getMinMultipleNumber(numberList);
        //then
        assertEquals(2, res);
    }

    @Test
    void get_list_of_map_with_stream_map_operation() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3);
        //when
        var res = streamClass2.getListOfMapWithStreamMapOperation(numberList);
        //then
        assertEquals(List.of(List.of(1, 1), List.of(2, 2), List.of(3, 3)), res);
    }

    @Test
    void get_list_of_map_with_stream_flatmap_operation() {
        //given
        List<Number> numberList = Arrays.asList(1, 2, 3);
        //when
        var res = streamClass2.getListOfMapWithStreamFlatMapOperation(numberList);
        //then
        assertEquals(List.of(1, 1, 2, 2, 3, 3), res);
    }
}