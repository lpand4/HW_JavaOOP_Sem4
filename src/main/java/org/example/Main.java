package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> calc1 = new Calculator<>();
        //Сумма массива
        System.out.println(calc1.sum(new ArrayList<>(Arrays.asList(1,2,3))));
        //Сумма чисел
        System.out.println(calc1.sum(1, 2.5));
        //Умножение массива
        System.out.println(calc1.mult(new ArrayList<>(Arrays.asList(1,2,3,4))));
        //Умножение чисел
        System.out.println(calc1.mult(2,61.3));
        //Деление чисел
        System.out.println(calc1.div(15,3));
        //Деление массива, но звучит странно
        System.out.println(calc1.div(new ArrayList<>(Arrays.asList(1,2.3,3.1))));
        //Число в двоичный код
        System.out.println(calc1.toBinary(8.0));
        //Двоичный код в число
        System.out.println(calc1.binaryToInt(10001));
        System.out.println(calc1.binaryToInt("10001"));



    }
}