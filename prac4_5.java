//21CE097 Manav Patel
//WAP to show use of character and byte stream.
import java.io.*;

public class prac4_5 {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("M:/java/files/input.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
        } finally {
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
        
    }
}
