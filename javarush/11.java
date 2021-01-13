package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String firstName = bufferedReader.readLine();
        String secondName = bufferedReader.readLine();
        String thirdName = bufferedReader.readLine();
        
        System.out.println(firstName + " + " + secondName + " + " + thirdName + " = Чистая любовь, да-да!");

    }
}