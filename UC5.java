import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5: Preserve Insertion Order of Bogies");

        // 1. Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 2. Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 3. Try adding duplicate
        train.add("Sleeper"); // ignored

        // 4. Display formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}