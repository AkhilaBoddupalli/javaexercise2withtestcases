package com.stackroute.javape2;

public class Factorial {
    public int calculateFactorial(int number)
    {
        int fact=1;
        if(number<=12) {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
        }
        return fact;


    }
    public long calculateFactorialOfNumber(int number)
    {
        int fact=1;
        if(number<=20) {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
        }
        return fact;


    }

}
