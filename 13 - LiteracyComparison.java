
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<String> lines = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .forEach(row -> lines.add(row));
        } catch (Exception e){
            System.out.println(e);
        }
        
        ArrayList<LiteracyData> literacy = new ArrayList<>();
                
        lines.stream()
            .map(row -> row.split(","))
            .map(parts -> new LiteracyData(parts[3], Integer.valueOf(parts[4]), parts[2], parts[5]))
            .forEach(data -> literacy.add(data));   
        
        literacy.stream()
                .sorted((data1, data2) -> {
                    return data1.getLiteracy().compareTo(data2.getLiteracy());
                })
                .forEach(data -> System.out.println(data.toString()));
        }
}

