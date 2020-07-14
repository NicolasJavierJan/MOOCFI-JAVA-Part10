
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1){
                break;
            }
            
            list.add(number);
        }
        
        System.out.println(positive(list));
    }
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> list = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return list;
    }
}
