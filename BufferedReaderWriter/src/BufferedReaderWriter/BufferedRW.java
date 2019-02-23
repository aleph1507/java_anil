package BufferedReaderWriter;

import java.io.*;

public class BufferedRW {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("myfile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("FileWriter Example");
        fileWriter.flush();
        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();

        FileReader fileReader = new FileReader("myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        StringBuffer s_buf = new StringBuffer();
        while((line = bufferedReader.readLine()) != null){
            s_buf.append(line);
        }
        System.out.println(s_buf);
        bufferedReader.close();
        fileReader.close();
    }
}
