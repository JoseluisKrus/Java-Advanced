import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EveryThird {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\Resources\\input.txt";
        FileReader reader = new FileReader(path);
        Scanner scanner = new Scanner(reader);
        int lineNumber =0;
        while (scanner.hasNext()){
            lineNumber++;
            if(lineNumber%3==0){
                System.out.println(scanner.nextLine());
            }else{
                scanner.nextLine();
            }
        }
    }
}
