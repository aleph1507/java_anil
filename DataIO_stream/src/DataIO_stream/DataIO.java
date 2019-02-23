package DataIO_stream;

import java.io.*;

public class DataIO {

    public static void main(String[] args) throws IOException {

        try {
            FileOutputStream output = new FileOutputStream("data.txt");
            DataOutputStream dataOutput = new DataOutputStream(output);
            dataOutput.writeInt(100);
            dataOutput.writeChar(65);
            dataOutput.writeBytes("Hello Java");
            dataOutput.close();
            output.close();

            FileInputStream input = new FileInputStream("data.txt");
            DataInputStream dataInput = new DataInputStream(input);
            StringBuffer s_buf = new StringBuffer();
            int count = dataInput.available();
            byte [] arr = new byte[count];
            dataInput.read(arr);
            for(byte b:arr) {
                System.out.print((char)b);
            }
            dataInput.close();
            input.close();
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
            throw ioe;
        }

    }
}
