package buffered_io_stream;

import java.io.*;

public class BufferedIO {

    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("test.txt");
            BufferedOutputStream bout = new BufferedOutputStream(output);
            String s = "OUTput outPUT";
            bout.write(s.getBytes());
            bout.close();
            output.close();

            FileInputStream input = new FileInputStream("test.txt");
            BufferedInputStream bin = new BufferedInputStream(input);
            StringBuffer s_buf = new StringBuffer();
            int i_char;
            while((i_char = bin.read()) != -1) {
                s_buf.append((char)i_char);
            }
            System.out.println(s_buf);
            bin.close();
            input.close();
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
