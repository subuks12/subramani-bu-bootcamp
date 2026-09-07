import java.io.FileReader;
import java.io.BufferedReader;  
import java.io.IOException; 
public class Filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\subra\\BU\\JAVA Training\\Module1\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
