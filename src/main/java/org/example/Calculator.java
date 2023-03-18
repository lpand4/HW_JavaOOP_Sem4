package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Calculator<T> {

    List<T> mass = new ArrayList<>();

    public Double sum(List<? extends Number> mass) {
        double sum = 0;
        for (Number i : mass) {
            sum += i.doubleValue();
        }
        return sum;
    }
    public Double sum(Number el1, Number el2) {
        return el2.doubleValue() + el1.doubleValue();
    }

    //1)расширить класс калькулятор на умножение
    public Double mult(List<? extends Number> mass) {
        double res = 1;
        for (Number i : mass) {
            res *= i.doubleValue();
        }
        return res;
    }

    //Умножение двух чисел
    public Double mult(Number el1, Number el2) {
        return el1.doubleValue() * el2.doubleValue();
    }
    //Деление числа на число
    public Double div(Number el1, Number el2) {
        if(el2.intValue() != 0)
            return el1.doubleValue() / el2.doubleValue();
        else{
            System.out.println("Делитель не должен быть нулем");
            return -1.0;
        }

    }
    //Деление массива? -_-
    public Double div(List<? extends Number> mass){
        Number res = mass.get(0);
        for (int i = 1; i < mass.size(); i++) {
            res = res.doubleValue() / mass.get(i).doubleValue();
        }
        return (Double) res;
    }
    //Бинарный перевод
    public String toBinary(Number input ){
        String res;
        if(!(input instanceof Integer)){
            Integer firstPart = input.intValue();
            res = intToBinary(firstPart);
            return res;
        }else{
            Integer in = input.intValue();
            res = intToBinary(in);
            return res;
        }
    }
    public String intToBinary(Integer in){
        StringBuilder res = new StringBuilder();
        while (in > 1){
            res.append(in % 2);
            in /= 2;
        }
        res.append(in);
        return res.reverse().toString();
    }
    //Из кода в число
    public Double binaryToInt(Object in){
        String inStr = in.toString();
        double res = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if(inStr.charAt(i) == '1')
                res += Math.pow(2, inStr.length() - i - 1);
        }
        return res;
    }
}

