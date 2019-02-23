package inheritance_department;

public class employee extends salary {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public employee(String name, int salary) {
        super(salary);
        this.name = name;
    }


}
