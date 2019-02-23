package ExceptionExample;

import java.io.IOException;

public class Child extends Parent {

    public void message() throws IOException {
        System.out.println("Child class message");
    }
}
