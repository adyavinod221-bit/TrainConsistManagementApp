import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String type;     // Passenger or Goods
    private String name;     // Sleeper, AC Chair, First Class, Rectangular, Cylindrical
    private int capacity;

    public Bogie(String type, String name, int capacity) {
        this.type = type;
        this.name = name;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 1: Create bogies (Passenger + Goods)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Passenger", "Sleeper", 72));
        bogies.add(new Bogie("Passenger", "AC Chair", 56));
        bogies.add(new Bogie("Passenger", "First Class", 24));
        bogies.add(new Bogie("Goods", "Rectangular", 100));
        bogies.add(new Bogie("Goods", "Cylindrical", 80));
        bogies.add(new Bogie("Passenger", "Sleeper", 72)); // duplicate type for grouping test

        // Step 2: Group bogies by type using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped bogies
        System.out.println("Grouped Bogies by Type:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + ":");
            bogieList.forEach(System.out::println);
        });
    }
}
