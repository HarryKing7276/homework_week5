package homework;

/** 10. Write a programme that tells you which line passes through particular stations.
 *       Just use Zone 1 stations name
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_10_LondonTrains {
    public static void main(String[] args) {


        Map<String, String> Programme_10_LondonTrains = new HashMap();
        Programme_10_LondonTrains.put("King's Cross St Pancreas", "Piccadilly, Victoria, Northern, Hammersmith & City, Circle, Metropolitan");
        Programme_10_LondonTrains.put("Waterloo", "Baker loo, Northern, Jubilee, Waterloo & City");
        Programme_10_LondonTrains.put("Oxford Circus", "Baker loo, Central, Victoria");
        Programme_10_LondonTrains.put("Victoria", "Victoria, District, Circle");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the Station Name in Zone 1: ");
        String station = scanner.nextLine();

        //check if the station exists in the map

        if (Programme_10_LondonTrains.containsKey(station)) {
            String lines = Programme_10_LondonTrains.get(station);
            System.out.println("The following lines pass through " + station + ": " + lines);
        } else {
            System.out.println("The station \"" + station + "\" is not found in Zone 1.");
        }
        scanner.close();
    }

}
