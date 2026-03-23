import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding passenger bogies with seating capacity
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 40);

        // Adding goods bogies with load capacity (in tons)
        bogieCapacityMap.put("Rectangular Cargo", 50);
        bogieCapacityMap.put("Cylindrical Cargo", 60);

        // Iterating through the map and displaying bogie details
        System.out.println("Train Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}
