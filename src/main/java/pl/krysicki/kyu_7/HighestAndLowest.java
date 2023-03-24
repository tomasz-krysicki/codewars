package pl.krysicki.kyu_7;

import java.util.Arrays;

public class HighestAndLowest {

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3"));
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {

//  1st attempt (submitted)
        String max = String.valueOf(Arrays.stream(numbers.split("\\s"))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt());

        String min = String.valueOf(Arrays.stream(numbers.split("\\s"))
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt());

        return max + " " + min;
    }


}
