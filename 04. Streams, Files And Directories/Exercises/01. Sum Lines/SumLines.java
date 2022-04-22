import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\ResourcesExerc\\input.txt");
        List<String> lines = new ArrayList<>();
        try {
           lines = Files.readAllLines(path);
        }catch (IOException e){
            System.out.println("Error while reading");
        }

        for (String line:lines) {
            int sum =0;
            for (char symbol: line.toCharArray()) {
                sum +=symbol;
            }
            System.out.println(sum);
        }

    }
    }


