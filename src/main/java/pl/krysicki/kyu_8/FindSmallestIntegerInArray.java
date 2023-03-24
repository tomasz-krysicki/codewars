package pl.krysicki.kyu_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallestIntegerInArray {

    public static int findSmallestInt(int[] args) {

// learned, Streams and Lambda expression / method reference
        return IntStream.of(args)
                .reduce(Math::min)    // or (a, b) -> a < b ? a : b or (a, b) -> Math.min(a, b)
                .getAsInt();

// learned, chain of methods as array object
/*      return Arrays.stream(args).sorted().toArray()[0];*/

// learned, interesting solution
/*      return IntStream.of(args)
                .summaryStatistics()
                .getMin();*/

//  learned, most voted as clever
/*      Arrays.sort(args);
        return args[0];*/


//  learned, most voted as best practices (import java.util.stream.IntStream needed)
/*      return IntStream.of(args)
                .min()
                .getAsInt();*/


//  1st attempt (submitted) (import java.util.Arrays needed)
/*      return Arrays.stream(args)
                .min()
                .getAsInt();*/
    }
}
