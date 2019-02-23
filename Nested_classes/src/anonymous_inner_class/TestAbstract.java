package anonymous_inner_class;

public class TestAbstract {

    public static void main(String[] args) {

        AbstractClass a = new AbstractClass() {
            @Override
            void display() {
                System.out.println("display abstract");
            }
        };

        a.display();

        MyInterface i = new MyInterface() {

            @Override
            public void displayText() {
                System.out.println("display interface");
            };
        };

        i.displayText();

    }
}
