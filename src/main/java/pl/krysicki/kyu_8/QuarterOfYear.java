package pl.krysicki.kyu_8;

public class QuarterOfYear {

    public static void main(String[] args) {

        for (double i = 1; i < 13; i++) {
            System.out.print((int) Math.ceil(i / 3));
        }

        System.out.println();

        for (int i = 1; i < 13; i++) {
            System.out.print(quarterOf(i));
        }
    }

    public static int quarterOf(int month) {

//  2nd attempt
        return (int) Math.ceil((double) month / 3);

//  1st attempt
/*      if (month < 4) return 1;
        else if (month < 7) return 2;
        else if (month < 10) return 3;
        return 4; */
    }
}
