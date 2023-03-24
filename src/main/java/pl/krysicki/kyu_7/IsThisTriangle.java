package pl.krysicki.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class IsThisTriangle {

    public static boolean isTriangle(int a, int b, int c) {

//  most voted as best practices and clever
        return a + b > c && a + c > b && b + c > a;

//  1st attempt (submitted)
        /*      return a + b > c ? (a + c > b ? b + c > a : false) : false;*/

//  my solution with sorted array
/*        int[] array = {a, b, c};
        Arrays.sort(array);
//      array = Arrays.stream(array).sorted().toArray();
        return array[0] + array[1] > array[2];*/

//  learned nice solution
//        return Math.max(Math.max(a, b), c) < a + b + c - Math.max(Math.max(a, b), c);

//        List<Integer> sides = Stream.of(a, b, c).sorted().toList();
//        return sides.get(0) + sides.get(1) > sides.get(2);

//        LinkedList<Integer> boki = LinkedList( int a, int b, int c);

    }
}
