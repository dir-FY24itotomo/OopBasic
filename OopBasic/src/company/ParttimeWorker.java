package company;

public class ParttimeWorker implements Workable {
    // field
    protected final String name;
    private final Department department;

    // constructor
    public ParttimeWorker(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    
    // work method
    @Override
    public void work() {
        System.out.println("I'm part-time worker. Name ：" + name + slogan);
    }
}
