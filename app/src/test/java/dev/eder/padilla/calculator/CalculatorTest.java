package dev.eder.padilla.calculator;

import android.util.Log;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    public Calculator calculatorNull;

    public Calculator calculator;

    private final String TAG = CalculatorTest.class.getSimpleName();

    @Before
    public void setUp(){
        calculator = new Calculator();
        System.out.println("Execute test setUp Before");
    }

    @After
    public void tearDown(){
        calculator = null;
        System.out.println("After test");
    }

    @Test
    public void calculatorNotNullTest(){
        Assert.assertNotNull("Calculator debe ser not null",calculator);
        System.out.println("Execute test not null");
    }


    @Test
    public void calculatorNullTest(){
        Assert.assertNull("Calculator debe ser null",calculatorNull);
        System.out.println("Execute test ");
    }

    @Test
    public void addTestExplained(){
        //Set up
        Calculator calculatorTest = new Calculator();
        int resultExpected = 30;
        //Set Assert
        Assert.assertEquals(resultExpected,calculatorTest.add(10,20));
        System.out.println(" addTestExplained()");

    }

    @Test
    public void sampleAssert(){
        Assert.assertTrue(1==1);
        Assert.assertFalse(1==2);
        //Assert.assertNull(calculator);
        Assert.assertNotNull(calculator);
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator calculator3 = calculator1;
        Assert.assertSame(calculator1,calculator3);
        //Assert.assertSame(calculator1,calculator2);
        Assert.assertNotSame(calculator1,calculator2);
        Assert.assertEquals("a","a");

        Assert.assertEquals("Este es un mensaje del assert","hola mundo","hola mundo");
        //Assert.assertEquals("Este es un mensaje del assert con ::error::","hola mundo","hola andorids");

        //If result its between one and one point five
        Assert.assertEquals(1,1.4,0.5);

        //Assert.fail("Fail detect manually");
    }

    @Test
    public void addTest(){
        Assert.assertEquals(30,calculator.add(20,10));
        System.out.println("Execute addTest");
    }

    @Test
    public void add() throws Exception {
        //Setup
        int numOne = 10;
        int numTwo = 20;
        int expected = 30;
        int actual;
        //Action
        actual = calculator.add(numOne,numTwo);
        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_Valid_Input_Test(){

        Assert.assertEquals(11,calculator.add(7,4));
        System.out.println("Execute with validations");
    }

    @Test
    public void substract_valid_inputs_valid_expected_test() throws Exception {
        Assert.assertEquals(3,calculator.substract(7,4));
    }

    @Test
    public void substract_valid_Inputs_Valid_Negative_Expected_test() throws Exception {
        Assert.assertEquals(3,calculator.substract(7,4));
    }

    @Ignore("Unready Method sorry for disturbs")
    @Test
    public void partition_Valid_Input_Test(){
        //Assert.assertEquals(2,calculator.divide(4,0));
        Assert.assertEquals(2,calculator.divide(5,0));
        System.out.println("Execute partition_Valid_Input_Test()");
        Assert.fail("FAllo detectado manualmente no se puede dividir por Cero");
    }

    @Test(expected = ArithmeticException.class)
    public void partition_By_zero_not_Valid_Input_Test(){
        //Assert.assertEquals(2,calculator.divide(4,0));
        Assert.assertEquals(2,calculator.divieByZero(5,0));
        System.out.println("Execute partition_Valid_Input_Test()");
        Assert.fail("::::::::::Fallo detectado manualmente no se puede dividir por Cero::::::");
    }

    @Test(timeout = 600)
    public void big_Time_Duration_Test(){
        calculator.longDurationTest();
    }
}