package com.company.jbd;


public class Calculator implements ArithmeticFunctions{

    @Override
    public float addition(int number1,int number2) {
        return number1+number2;
    }

    @Override
    public float subtraction(int number1,int number2) {
        return number1-number2;
    }

    @Override
    public float multiplication(int number1,int number2) {
        return number1*number2;
    }

    @Override
    public float division(int number1,int number2) {
        return number1 / number2;
    }
}
