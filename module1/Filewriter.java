import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\subra\\BU\\JAVA Training\\Module1\\test1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, this is a test file.");
            bw.newLine();
            bw.write("This is the second line.");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


