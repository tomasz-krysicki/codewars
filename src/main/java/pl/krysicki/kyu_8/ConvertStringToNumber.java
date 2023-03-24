package pl.krysicki.kyu_8;

import java.util.Scanner;

public class ConvertStringToNumber {

    public static int stringToNumber(String str) {

//  1st attempt (submitted) most voted as best practices and clever
        return Integer.parseInt(str);

//  my solution with try-catch block
/*      int numberFromString = 0;
        try {
            numberFromString = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid String");
        }
        return numberFromString;*/

//  learned, nice trick with Scanner (import java.util.Scanner needed)
/*      Scanner sc = new Scanner(str);
        int i = sc.nextInt();
        return i;*/
    }
}
