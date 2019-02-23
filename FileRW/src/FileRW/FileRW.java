package FileRW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

    public static void main(String[] name) throws IOException {

        FileWriter fileWriter = new FileWriter("myfile.txt");
        fileWriter.write("This is an example of FileWriter");

        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader("myfile.txt");
        int i_char;
        StringBuffer s_buff = new StringBuffer();
        while((i_char = fileReader.read()) != -1) {
            s_buff.append((char)i_char);
        }
        System.out.println(s_buff);
        fileReader.close();

    }
}
