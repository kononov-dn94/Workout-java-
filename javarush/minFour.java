package com.javarush.task.task02.task0217;
import java.util.Collections;

/* 
Минимум четырех чисел
*/

public class minFour {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int[] result = {a, b, c, d};
        for(int i = 0; i < result.length; i++) {
            if(result[i] < 1)
            System.out.println(result[i]);
        }
        
        return 0;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int result;
        if(a < b) {
            result = a;
        } else {
            result = b;
        }
        return result;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
