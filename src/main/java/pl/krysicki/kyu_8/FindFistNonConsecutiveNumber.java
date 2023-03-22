package pl.krysicki.kyu_8;

import java.util.stream.IntStream;

public class FindFistNonConsecutiveNumber {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 6, 7, 8}, array2 = {1, 2, 3, 4, 5, 6, 7, 8}, array3 = {31, 32}, array4 = {-3, -2, 0, 1}, array5 = {-5, -4, -3, -1};

        System.out.println("6 -> " + find(array1));
        System.out.println("null -> " + find(array2));
        System.out.println("null -> " + find(array3));
        System.out.println("0 -> " + find(array4));
        System.out.println("-1 -> " + find(array5));
    }


    static Integer find(final int[] array) {

//  learned solution using Streams (import java.util.stream.IntStream needed)
        return IntStream.range(1, array.length)
                .filter(i -> array[i - 1] != array[i] - 1)
                .mapToObj(i -> array[i])
                .findFirst()
                .orElse(null);


//  most voted as best practices and clever
/*      for (int i = 1; i < array.length; i++) {

            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }
        return null;*/

//  1st attempt (submitted)
/*      boolean isFirstNonConsecutivePresent = false;
        int firstNonConsecutive = 0;

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - array[i - 1]) != 1) {
                firstNonConsecutive = array[i];
                isFirstNonConsecutivePresent = !isFirstNonConsecutivePresent;
                break;
            }
        }

        if (isFirstNonConsecutivePresent) return firstNonConsecutive;

        else return null;*/
    }
}
