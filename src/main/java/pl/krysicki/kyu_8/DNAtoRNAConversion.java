package pl.krysicki.kyu_8;


import java.util.Objects;
import java.util.stream.Collectors;

public class DNAtoRNAConversion {

    public static void main(String[] args) {

        System.out.println(dnaToRna("TTTT"));
        System.out.println(dnaToRna("GCAT"));
    }

    public static String dnaToRna(String dna) {

        //  most voted best practices and clever
        /*      return dna.replace('T', 'U');*/

//  interesting solution using recursion
/*      if (dna.length() == 0) return "";
        if (dna.charAt(0) == 'T') return "U" + dnaToRna(dna.substring(1));
        return dna.charAt(0) + dnaToRna(dna.substring(1));*/

//  solution using Streams - #1 (import java.util.Objects; needed)
/*      return dna
                .chars()
                //lambda expression (c -> Character.toString(c)) replaced by method reference (Character::toString)
                .mapToObj(Character::toString)
                .map(c -> Objects.equals("T", c) ? "U" : c)
                .reduce("", (a, b) -> a + b);*/

//  solution using Streams - #2 (import java.util.stream.Collectors; needed)
/*      return dna
                .chars()
                .mapToObj(c -> c == 'T' ? "" + 'U' : "" + (char) c)
                .collect(Collectors.joining());*/

//  solution using Streams - #3
/*      return dna
                .chars()
                .mapToObj(i -> String.valueOf((char) i))
                .map(c -> c.equals("T") ? "U" : c)
                .reduce((a, b) -> a + b)
                .orElse(dna);*/

//  1st attempt (submitted)

        String s = "";
        for (char c : dna.toCharArray()) {
            s = c == 'T' ? s + 'U' : s + c;
        }
        return s;

//  initial solution (tested, not submitted)
/*      StringBuilder sb = new StringBuilder();
        for (char c : dna.toCharArray()) {
            if (c == 'T') c = 'U';
            sb.append(c);
        }
        return sb.toString();*/
    }
}
