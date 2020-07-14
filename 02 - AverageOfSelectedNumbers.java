
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");
        
        while (true){
            String command = scanner.nextLine();
            
            if (command.equals("end")){
                break;
            }
            
            numbers.add(command);
        }
        
        System.out.println("Print the average of the negative numbers of the positive numbers? (n/p)");
        String command = scanner.nextLine();
        
        if (command.equals("n")){
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + average);
        } else {
            double average = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter (number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + average);
        }
        
    }
}
