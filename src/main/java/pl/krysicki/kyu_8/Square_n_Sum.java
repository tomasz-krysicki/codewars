package pl.krysicki.kyu_8;

import java.util.Arrays;

public class Square_n_Sum {

    public static void main(String[] args) {

        int[] test1 = {1, 2, 2};
        System.out.println(squareSum(test1));
        int[] test2 = {1, 2};
        System.out.println(squareSum(test2));
        int[] test3 = {5, -3, 4};
        System.out.println(squareSum(test3));
        int[] test4 = {};
        System.out.println(squareSum(test4));
    }

    public static int squareSum(int[] n) {


//  3rd attempt (clever solution learned)

        return Arrays.stream(n).map(i -> i*i).sum();

//  2nd attempt (cleaner code)
/*      int sum = 0;
        for (int i : n) {
            sum += i * i;
        }
        return sum;*/


//  1st attempt
/*      int squarePower = 0;
        int totalSum = 0;

        for (int i : n) {
            squarePower = (int) Math.pow(i, 2);
            totalSum += squarePower;
        }
        return totalSum;*/
    }
}
