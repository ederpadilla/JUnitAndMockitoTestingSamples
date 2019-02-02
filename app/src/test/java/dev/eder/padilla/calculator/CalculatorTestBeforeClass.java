package dev.eder.padilla.calculator;

import org.junit.*;

public class CalculatorTestBeforeClass {

    private static Calculator calculatorBefore;

    private static Calculator calculatorBeforeClass;

    private static int numberBefore;

    private static int numberBeforeClass;

    @BeforeClass
    public static void beforeClass(){
        calculatorBeforeClass = new Calculator();
        numberBeforeClass = 3;
        System.out.println("Finish the before class()");
    }

    @Before
    public void beforeTest(){
        calculatorBefore = new Calculator();
        numberBefore = 3;
        System.out.println("Finish the before()");
    }

    @Test
    public void testBeforeVsBeforeClass(){
        numberBeforeClass = numberBeforeClass + 3;
        numberBefore = numberBefore + 3;
        Assert.assertEquals("number before class",9,numberBeforeClass);
        Assert.assertEquals("number before ",6,numberBefore);
        System.out.println("Finish test before vd before ");
    }

    @Test
    public void testBeforeVsBeforeClass2(){
        numberBeforeClass = numberBeforeClass + 3;
        numberBefore = numberBefore + 3;
        Assert.assertEquals("number before class",6,numberBeforeClass);
        Assert.assertEquals("number before ",6,numberBefore);
        System.out.println("Finish test before vd before 2");
    }

    @AfterClass
    public static void afterClass(){
        calculatorBeforeClass = null;
        numberBeforeClass = 0;
        System.out.println("After class bye bye");
    }

    @After
    public void after(){
        calculatorBefore = null;
        numberBefore = 0;
        System.out.println("After");
    }
}
