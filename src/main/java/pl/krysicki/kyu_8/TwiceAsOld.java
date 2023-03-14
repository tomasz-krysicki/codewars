package pl.krysicki.kyu_8;

public class TwiceAsOld {

    public static void main(String[] args) {
        System.out.println(twiceAsOld(30, 0));
        System.out.println(twiceAsOld(30, 7));
        System.out.println(twiceAsOld(45, 30));
        System.out.println(twiceAsOld(30, 15));
    }

//  1st attempt (submitted) - most voted as best practices and clever
    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - 2 * sonYears);
    }
}
