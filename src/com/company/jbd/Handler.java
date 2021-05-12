package com.company.jbd;

import java.util.Arrays;

public class Handler {
    final String[] ROMANNUMBERS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    final Integer[] ARABNUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Integer number1;
    private Integer number2;
    boolean romanTrigger;
    private String operation;
    Calculator calculator = new Calculator();

    public Handler(String numbers) throws Exception {
        String[] splitNumbers = numbers.split("\\s");
        if (indicatorChisel(splitNumbers[0]) == indicatorChisel(splitNumbers[2])) {
            this.number1 = filterChisel(splitNumbers[0]);
            this.number2 = filterChisel(splitNumbers[2]);
        }
        else throw new Exception("Числа должны быть одного типа");
        this.operation = splitNumbers[1];
    }


    public int filterChisel(String number) {
        if (Arrays.asList(ROMANNUMBERS).contains(number.toUpperCase())) {
            return ARABNUMBERS[Arrays.asList(ROMANNUMBERS).indexOf(number.toUpperCase())];
        }
        else return Integer.parseInt(number);
    }

    public boolean indicatorChisel(String number) throws Exception {
        try {
            if(Arrays.asList(ROMANNUMBERS).contains(number.toUpperCase())){
                this.romanTrigger = true;
                return true;
            }else if (Arrays.asList(ARABNUMBERS).contains(Integer.parseInt(number))) {
                this.romanTrigger = false;
                return false;
            }else throw new Exception(number + "число от 0 до 10");
        }catch (Exception exception) {
            throw new Exception(number + "-Неправильное число");
        }
    }


    public String reshenie() {
        float otvet;
        switch (operation) {
            case "/":
                otvet = calculator.division(this.number1, this.number2);
                break;
            case "+":
                otvet = calculator.addition(this.number1, this.number2);
                break;
            case "-":
                otvet = calculator.subtraction(this.number1, this.number2);
                break;
            case "*":
                otvet = calculator.multiplication(this.number1, this.number2);
                break;
            default:
                throw new IllegalStateException("Такую операцию я не умею делать " + operation);
        }
        if (!romanTrigger) {
            return Float.toString(otvet);
        } else return Converter.toString((int) otvet);
    }

}