package pl.krysicki.kyu_8;

import static java.lang.Character.*;

import java.util.stream.Collectors;

public class AlternatingCase {

    public static void main(String[] args) {
        String test = "aLA MA KOTA sTRINGuTILS.TOaLTERNATINGcASE 1A2B3C4D5E";
        System.out.println(toAlternativeString(test));
    }

    public static String toAlternativeString(String string) {


// Version using Streams (with 2 options of termination) (2 imports needed)
        return string
                .chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : toUpperCase(c))
                .mapToObj(Character::toString)

                //termination option #1 (passed tests, not submitted)
//              .reduce((a,b)->a+b)
//              .orElse(string);

                //termination option #2 (submitted)
                .collect(Collectors.joining());

//  2nd attempt - shorter code (submitted)
//      String s = "";
//      for (char c : string.toCharArray()) {
//          s = (Character.isUpperCase(c)) ? s + Character.toLowerCase(c) : s + Character.toUpperCase(c);
//      }
//      return s;


//  New version (cleaner code)

/*      String swapedString = "";
        for (char c: string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swapedString += Character.toLowerCase(c);
            } else {
                swapedString += Character.toUpperCase(c);
            }
        } return swapedString;*/


//  1st attempt (submitted)
/*      StringBuilder swapCaseString = new StringBuilder();
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            swapCaseString.append(ch);
        }
        return swapCaseString.toString();*/
    }
}
