package com.company;

public class Main {

    public static void main(String[] args) {
        double[] whiteCup = {-1.5, 2.5, 3.5, -4.5, 5.5, -2.7, 6.5, -7.5, 3.3, -8.5, 9.5, -4.7, 5.8, -6.6, 7.9};

        double number = 0;
        double sum = 0;

        for (double green : whiteCup){
            if (green < 0) continue;
            if (green > 0) {
                number = green + number;
            }

        }
        System.out.println("Сумма всех положительных чисел: " + number);
    }
}
