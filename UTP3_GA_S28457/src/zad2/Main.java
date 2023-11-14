/**
 *
 *  @author Bayar Berkay S25786
 *
 */

package zad2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*<-- necessary imports */

public class Main {

  public static void main(String[] args) {
    // List of destination: departure_airport destination_airport price_EUR
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = dest.stream()
            .filter(s -> s.startsWith("WAW "))
            .map(s -> {
                String[] parts = s.split(" ");
                double priceInPLN = Double.parseDouble(parts[2]) * ratePLNvsEUR;
                return "to " + parts[1] + " - price in PLN:\t" + (int) priceInPLN;
            })
            .collect(Collectors.toList());
    for (String r : result) System.out.println(r);
  }
}
