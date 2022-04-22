import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\ResourcesExerc\\input.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        }catch (IOException e){
            System.out.println("Error while reading");
        }
        long sum =0;
        for (String line:lines) {
            for (char symbol: line.toCharArray()) {
                sum +=symbol;
            }

        }
        System.out.println(sum);
    }
}
