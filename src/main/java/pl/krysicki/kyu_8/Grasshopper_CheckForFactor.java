package pl.krysicki.kyu_8;

public class Grasshopper_CheckForFactor {

    public static void main(String[] args) {
        System.out.println(checkForFactor(10,2));
        System.out.println(checkForFactor(63,7));
        System.out.println(checkForFactor(2450,5));
        System.out.println(checkForFactor(24612,3));
        System.out.println(checkForFactor(3,5));
        System.out.println(checkForFactor(0,1));
    }

//  1st attempt (submitted), also most voted as best practices and clever
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
