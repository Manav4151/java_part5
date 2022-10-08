// 21CE097 Manav Patel
//When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give example.
import java.util.*;
import java.io.*;

public class prac2_5 {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("M:/java/files/prac2.rtf");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.println("Program successfully executed");
        } finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}