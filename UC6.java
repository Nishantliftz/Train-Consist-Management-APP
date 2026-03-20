import java.util.*;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("======================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // Iterate and display
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }
    }
}