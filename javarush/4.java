public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(94, 0.5));
        System.out.println(Solution.convertEurToUsd(75, 0.5));
        Test test1 = new Test();

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double usaMoney = eur * exchangeRate;
        return usaMoney;

    }
}
