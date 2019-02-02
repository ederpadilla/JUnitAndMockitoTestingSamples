package dev.eder.padilla.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalculatorParameterized {

    private int numOne;
    private int numTwo;
    private int expected;
    private Calculator calculator;


    @Parameterized.Parameters
    public static Iterable<Object[]> getDataTest(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{6,2,3});
        list.add(new Object[]{6,-2,-3});
        list.add(new Object[]{-6,2,-3});
        list.add(new Object[]{-6,-2,3});
        list.add(new Object[]{6,0,3});
        return list;
    }

    public CalculatorParameterized(int numberOne, int numberTwo, int numberThree) {
        this.numOne = numberOne;
        this.numTwo = numberTwo;
        expected = numberThree;
    }

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void partition_Test(){
        Assert.assertEquals(expected,calculator.divide(numOne,numTwo));
    }
}