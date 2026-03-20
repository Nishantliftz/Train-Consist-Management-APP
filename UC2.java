import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC2: Add Passenger Bogies");

        // 1. Initialize List
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Display Bogies
        System.out.println("Bogies after addition: " + passengerBogies);

        // 4. Remove a Bogie
        passengerBogies.remove("AC Chair");

        // 5. Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        // 6. Final State
        System.out.println("Final bogie list: " + passengerBogies);
    }
}