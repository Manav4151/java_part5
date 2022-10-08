
//21CE097 Manav Patel
//Write a program to transfer data from one file to another file so that if the destination file does not exist, it is created.
import java.io.*;
import java.io.IOException;

public class prac3_5 {
    public static void main(String[] args) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        try {
            File infile = new File("M:/java/files/input.txt");
            File outfile = new File("M:/java/files/output.txt");
            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;

            // copying the contents from input stream to Output stream using read and write methods
            while ((length = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, length);
            }
            // Closing the input/Output file streams
            instream.close();
            outstream.close();
            System.out.println("File  copied  successfully!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
