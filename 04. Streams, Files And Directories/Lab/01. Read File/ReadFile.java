import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\Resources\\input.txt";

        try(FileInputStream fileStream = new FileInputStream(path)){
            int oneByte = fileStream.read();
            while (oneByte>=0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }


        }catch (IOException exception){
                exception.printStackTrace();
        }
    }
}
