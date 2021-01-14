package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number / 100; //получаем единицу а-сот
        int b = number / 10 - (a * 10); //сначала получаем n-десяток и единиц, а с  вычитанием n-десяток, остаются только единицы
        int c = number % 10; //ну а здесь остаток - единицы

        int s = a + b + c;
        return s;
    }
}