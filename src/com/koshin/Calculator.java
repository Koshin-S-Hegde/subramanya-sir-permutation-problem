package com.koshin;

public class Calculator {
    private boolean isConditionMet(int number) {

        for (int previousDigit = number % 100; number > 0; number /= 10) {  // Iterating through it backwards
            int currentDigit = number % 10;
            if (
                    currentDigit > 6 ||
                    currentDigit < 1 ||
                    previousDigit == currentDigit + 1
            )
                return false;
            previousDigit = currentDigit;
        }

        return true;
    }

    private Calculator() {
        int answer = 0;
        for (int i = 111111; i < 666666; i++)
            answer += isConditionMet(i) ? 1 : 0;
        System.out.println(answer);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
