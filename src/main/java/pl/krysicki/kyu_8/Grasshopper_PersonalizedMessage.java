package pl.krysicki.kyu_8;

public class Grasshopper_PersonalizedMessage {

    public static void main(String[] args) {
        System.out.println(greet("Tomek", "Tomek"));
        System.out.println(greet("Tomek", "Romek"));
        System.out.println(greet("Romek", "Tomek"));
    }

    public static String greet(String name, String owner) {

//  1st attempt (submitted), most voted as best practices
        return name.equals(owner) ? "Hello boss" : "Hello guest";

//  shorter code, most voted as clever
/*      return "Hello " + (name.equals(owner) ? "boss" : "guest");*/

//  interesting with String.format method
/*  return String.format("Hello %s", name.equals(owner) ? "boss" : "guest");*/
    }
}
