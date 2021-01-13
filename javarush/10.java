package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String name = bufferedReader.readLine();
        String firstAge = bufferedReader.readLine();
        int fAge = Integer.parseInt(firstAge);
        String secondAge = bufferedReader.readLine();
        int sAge = Integer.parseInt(secondAge);
        
        System.out.println(name + " получает " + fAge + " через " + sAge + " лет.");
        
        

    }
}