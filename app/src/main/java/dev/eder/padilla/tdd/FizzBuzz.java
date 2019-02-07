package dev.eder.padilla.tdd;

public class FizzBuzz {

    public String of(int number) {
        if (number == 0){
            return "0";
        }
        String text = "";

        if (number % 3 == 0){
            text += "Fizz";
        }
        if (number % 5 == 0){
            text += "Buzz";
        }
        return text.isEmpty() ? String.valueOf(number) : text;
    }
}
