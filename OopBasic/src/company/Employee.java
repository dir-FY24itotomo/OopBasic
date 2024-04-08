package company;

import javax.management.loading.PrivateClassLoader;
import javax.xml.stream.XMLReporter;

public abstract class Employee implements Workable {
    // field
    protected final String name;
    protected final Department department;
    private final String position;
    private final int employeeId;

    // constructor
    public Employee(String name, Department department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }

    // method
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }

    // method (overload)
    public void report() {
        report(1);
    }
    
    public abstract void joinMeeting();
    /*
    public void joinMeeting() {
        department.meeting();
        System.out.println("I attend above meeting, Dep : " + department.getName() + "Name : " + name);
    }
    */
    
    @Override
    public void work() {
        System.out.println("i'm regular employee"+ name + slogan);
    }
    
}