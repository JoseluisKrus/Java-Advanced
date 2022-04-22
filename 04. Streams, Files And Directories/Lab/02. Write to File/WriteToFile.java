import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\Resources\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);

        Set<Character> separators = Set.of(',', '.', '!', '?');

        int nextByte = fileStream.read();

        PrintStream printStream = new PrintStream("C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\Resources\\out.txt");
        while (nextByte!=-1){
            char symbol = (char)(nextByte);
            if(!separators.contains(symbol)){
                printStream.print(symbol);
            }
            nextByte = fileStream.read();
        }

    }
}
