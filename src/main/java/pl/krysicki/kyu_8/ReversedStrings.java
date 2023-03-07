package pl.krysicki.kyu_8;

public class ReversedStrings {


    public static void main(String[] args) {

        String string = "Was it a cat I saw";
        System.out.println(string);
        System.out.println(solution(string));
    }

    public static String solution(String str) {

//  2nd attempt
        return new StringBuilder(str).reverse().toString();

//  1st attempt
/*      StringBuilder stringBuilder = new StringBuilder();
        String revStr = stringBuilder.append(str).reverse().toString();
        return revStr; */
    }
}
