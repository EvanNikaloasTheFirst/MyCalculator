package com.example.mycalculator;

public class Calculator {


    private String numberOne;
    private String numberTwo;

    public String convertNumber(String num1, String num2) {
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '.') {
                float numberOne = Float.parseFloat(num1);
            }
            else if (!(num1.charAt(i) == '.') && num1.length() < 2)  {
                Double numberOne = Double.parseDouble(num1);
            }
            else{
                int numberOne = Integer.parseInt(num1);
            }
        }

        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) == '.') {
                float numberTwo = Float.parseFloat(num2);
            }
            else if (!(num2.charAt(i) == '.') && num2.length() < 2) {
                Double numberTwo = Double.parseDouble(num2);
            }
            else{
                int numberTwo = Integer.parseInt(num2);
            }
        }
        return numberOne;
    }



}
