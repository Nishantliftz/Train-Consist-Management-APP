import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC3: Track Unique Bogie IDs");

        // 1. Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // 2. Add Bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // 3. Display unique IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}