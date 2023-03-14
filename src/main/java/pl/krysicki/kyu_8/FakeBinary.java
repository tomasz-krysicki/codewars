package pl.krysicki.kyu_8;

import java.util.stream.Collectors;


public class FakeBinary {

    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println(fakeBin("509321967506747"));
        System.out.println(fakeBin("366058562030849490134388085"));
    }

    public static String fakeBin(String numberString) {

// most voted as best practises and clever
/*      return numberString
                .replaceAll("[0-4]", "0") // regex variation [1-4]
                .replaceAll("[5-9]", "1"); // regex variation [^0]*/

// 1st attempt (submitted)
        String fakeBinStr = "";
        for (char c : numberString.toCharArray()) {
            fakeBinStr += c < '5' ? '0' : '1';
        }
        return fakeBinStr;

// learned solution using Streams (import java.util.stream.Collectors needed)
/*      return numberString
                .chars()
                .mapToObj(c -> c < '5' ? "0" : "1")
                .collect(Collectors.joining());*/

// learned solution, different approach using Streams (no import needed version)
/*      String result = "";
        for (int num : java.util.Arrays.stream(numberString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray()) {
            result += num < 5 ? 0 : 1;
        }
        return result;*/


// interesting solution (3rd clever) with String() constructor
/*      char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
            c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);*/
    }
}
