/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        return i * 1.1;
        //return i + (i * 0.1);

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
