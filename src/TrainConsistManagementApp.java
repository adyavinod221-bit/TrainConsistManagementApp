import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Define regex patterns
        String trainIdRegex = "TRN-\\d{4}";       // Train ID must be TRN- followed by exactly 4 digits
        String cargoCodeRegex = "PET-[A-Z]{2}";   // Cargo Code must be PET- followed by exactly 2 uppercase letters

        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // Step 2: Get user input
        System.out.print("Enter Train ID: ");
        String trainIdInput = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCodeInput = scanner.nextLine();

        // Step 3: Validate Train ID
        Matcher trainIdMatcher = trainIdPattern.matcher(trainIdInput);
        if (trainIdMatcher.matches()) {
            System.out.println("Valid Train ID: " + trainIdInput);
        } else {
            System.out.println("Invalid Train ID format!");
        }

        // Step 4: Validate Cargo Code
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCodeInput);
        if (cargoCodeMatcher.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCodeInput);
        } else {
            System.out.println("Invalid Cargo Code format!");
        }

        scanner.close();
    }
}