package pl.krysicki.kyu_8;

public class ConvertNumberToString {

    public static void main(String[] args) {

        int num = 123;
        System.out.println(num + 1);
        System.out.println(numberToString(num) + 1);
    }

    public static String numberToString(int num) {

//  clever solution with concatenation properties
//        return "" + num;


//  1st attempt (submitted) - most voted as best practices
        return String.valueOf(num);

//  Some more solutions
//        return Integer.toString(num);
//        return ((Integer) num).toString();
//        return String.valueOf((Integer) num);
    }
}
