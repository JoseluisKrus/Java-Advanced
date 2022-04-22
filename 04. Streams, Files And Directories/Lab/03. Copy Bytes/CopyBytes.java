import java.io.*;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\Resources\\input.txt";
        String outPath ="C:\\Users\\Joseluis\\Desktop\\Java-Advanced\\04. Streams, Files And Directories\\Resources\\output2.txt";

        try(FileInputStream inStream = new FileInputStream(path);
            OutputStream output= new FileOutputStream(outPath))
        {
            int oneByte = 0;
            while ((oneByte = inStream.read()) >=0){
                if(oneByte == 10 || oneByte ==32){
                    output.write(oneByte);
                }else{
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i <digits.length() ; i++) {
                        output.write(digits.charAt(i));
                    }
                }

        }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
