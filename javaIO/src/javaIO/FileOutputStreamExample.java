package javaIO;

import java.io.*;

public class FileOutputStreamExample {

    public static void main(String[] args) {

        FileOutputStream output;
//        InputStreamReader input;

        try {
            output = new FileOutputStream("test.txt");
            output.write("ASDASD\nasdasd".getBytes());
            output.write(output.getChannel().toString().getBytes());
            output.write(output.getFD().toString().getBytes());
            StringBuilder test_file  = new StringBuilder();
            int test_char;
            FileInputStream input = new FileInputStream("test.txt");
            while((test_char = input.read()) != -1) {
                test_file.append((char)test_char);
            }
            input.close();
            System.out.println(test_file);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
