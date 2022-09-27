package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_ReturnTrue_When_DietRecommended() {
        double weight = 90.0;
        double height = 1.70;

        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        assertTrue(recommended);
    }

    @Test
    void should_ReturnFalse_When_DietNotRecommended() {
        double weight = 50.0;
        double height = 1.90;

        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        assertFalse(recommended);
    }

    @Test
    void should_ThrowArithmeticExeption_When_HeighZero() {
        double weight = 50.0;
        double height = 0.0;

        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

        assertThrows(ArithmeticException.class, executable);
    }

    @Test
    void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty() {
        // given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));

        // when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        //then

        assertAll(
                () -> assertEquals(1.82, coderWorstBMI.getWeight()),
                () -> assertEquals(98.0 , coderWorstBMI.getHeight())
        );
    }
}