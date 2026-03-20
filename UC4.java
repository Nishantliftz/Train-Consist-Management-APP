import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4: Maintain Ordered Train Consist");

        // 1. Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // 2. Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // 3. Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After adding Pantry: " + train);

        // 4. Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // 5. Final Train
        System.out.println("Final Train Consist: " + train);
    }
}