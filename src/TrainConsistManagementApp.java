import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // LinkedHashSet ensures uniqueness + preserves insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attaching bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempting to attach a duplicate bogie
        trainFormation.add("Sleeper");  // This will be ignored automatically

        // Displaying final formation
        System.out.println("Final Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}
