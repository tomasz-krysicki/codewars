package pl.krysicki.kyu_7;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {

//  most voted as best practices and clever
        return str.endsWith(ending);

//  learned interesting with conjunction
/*      return str.length() >= ending.length() && str.substring(str.length()-ending.length()).equals(ending);*/

//  1st attempt (submitted), surprisingly voted as 2nd clever solution
/*      return str.length() >= ending.length() ? str.substring(str.length()-ending.length()).equals(ending): false;*/
    }
}
