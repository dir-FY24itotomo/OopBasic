package company;

public class Sales extends Employee {
    
    // Constructor
    public Sales(String name, Department department, String position, int employeeId) {
        super(name, department, position, employeeId);
    }

    //join a meeting
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("I attend above meeting as sales man：" + department.getName() + "Name ：" + name);
    }

}
