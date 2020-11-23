/*	package com.company;
import java.sql.SQLOutput;*/

public class Pool {
    public static void main(String[] args) {
        //Сравнение двух Integer
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 10;
        System.out.println("Result i1 == i2: " + (i1 == i2));
        System.out.println("Result i1 == i3: " + (i1 == i3));
        System.out.println();

        //Сравнение двух String
        String s1 = "pool";
        String s2 = "pool";
        String s3 = new String("pool");
        System.out.println("Result s1 == s2: " + (s1 == s2));
        System.out.println("Result s1 == s3: " + (s1 == s3));

    }
}
