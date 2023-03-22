package pl.krysicki.kyu_8;

public class Grasshopper_DebugCelsiusConverter {

    public static void main(String[] args) {

        System.out.println(weatherInfo(50));
        System.out.println(weatherInfo(23));
        System.out.println(weatherInfo(30));
        System.out.println(weatherInfo(35));
        System.out.println(weatherInfo(32));
    }

// learned - refactored, less code, one-liner practically

    public static String weatherInfo(double temp) {
        return (temp = (temp - 32) * (5 / 9d)) + " is" + (temp > 0 ? " above" : "") + " freezing temperature";
    }


//  1st attempt (submitted) most voted as best practices
    /*public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5.0 / 9.0);
    }

}*/

// initial code:
/* public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c : convert(temp);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static int convertToCelsius(int temperature) {
        int celsius = (tempertur - 32) + 5/9.0;
        return temperature;
    }
}*/
}