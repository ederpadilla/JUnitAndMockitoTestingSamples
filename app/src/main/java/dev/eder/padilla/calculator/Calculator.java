package dev.eder.padilla.calculator;

public class Calculator {

    private int result;

    public int add(int numberOne, int numberTwo){
        result = numberOne + numberTwo;
        return result;
    }

    public int substract(int numberOne, int numberTwo){
        result = numberOne - numberTwo;
        return result;
    }

    public int divide(int numberOne, int numberTwo){
        result = numberOne / numberTwo;
        return result;
    }

    public int divieByZero(int numberOne, int numberTwo){
        if (numberTwo==0){
            throw new ArithmeticException("Hey dude take it easy you can´t divide by zero 😢");
        }
        result = numberOne / numberTwo;
        return result;
    }

    public void longDurationTest(){
        try {
            Thread.sleep(1000);

        }catch (Exception e){

        }
    }

}
