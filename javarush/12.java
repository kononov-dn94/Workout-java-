package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String n = bufferedReader.readLine(); //читаем строку с клавиатуры
        int N = Integer.parseInt(n);
        
        System.out.println("Я буду зарабатывать $" + N + " в час");

    }
}
