package pl.krysicki.kyu_8;

import static java.lang.Math.max;

public class BeginnerSeries1_SchoolPaperwork {

    public static void main(String[] args) {

        System.out.println(paperWork(5, 5));
        System.out.println(paperWork(5, -5));
        System.out.println(paperWork(-5, 5));
        System.out.println(paperWork(-5, -5));
        System.out.println(paperWork(0, 5));
        System.out.println(paperWork(5, 0));
    }

    public static int paperWork(int n, int m) {

//  most voted as clever
        /*return max(n,0) * max(m, 0);*/

//  3rd attempt (submitted - most voted as best practices)

        return n < 0 || m < 0 ? 0 : n * m;

//  2nd attempt (submitted - my preferred)
        /*return n > 0 && m > 0 ? n * m : 0;*/

//  1st attempt (submitted)
        /*return (n > 0 && m > 0) ? n * m : 0;*/
    }

}
