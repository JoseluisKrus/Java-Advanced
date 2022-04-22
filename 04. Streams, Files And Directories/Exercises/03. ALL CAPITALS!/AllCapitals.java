import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\ResourcesExerc\\input.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        }catch (IOException e){
            System.out.println("Error while reading");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String line:lines) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
