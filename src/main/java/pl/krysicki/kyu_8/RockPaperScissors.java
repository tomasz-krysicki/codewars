package pl.krysicki.kyu_8;

public class RockPaperScissors {

    public static void main(String[] args) {

        String r = "rock", s = "scissors", p = "paper";

        System.out.println(rps(r, r));
        System.out.println(rps(r, s));
        System.out.println(rps(r, p));
        System.out.println(rps(s, s));
        System.out.println(rps(s, p));
        System.out.println(rps(s, r));
        System.out.println(rps(p, p));
        System.out.println(rps(p, r));
        System.out.println(rps(p, s));

        String[] game = {"rock", "scissors", "paper"};
        for (String p1: game) {
            for (String p2: game) {
                System.out.println("1: " + p1 + " vs. 2: " + p2 + " --> " + rps(p1, p2));
            }
        }
    }

    public static String rps(String p1, String p2) {

        if (p1.equals(p2))
            return "Draw!";

        else if ((p1.equals("scissors") && p2.equals("paper")) || (p1.equals("paper") && p2.equals("rock")) || (p1.equals("rock") && p2.equals("scissors")))
            return "Player 1 won!";

        else
            return "Player 2 won!";
    }
}
