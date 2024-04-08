package company;

public class Engineer extends Employee {
    String programmingLanguage;

    public Engineer(String name, Department department, String position, 
            int employeeId, String programmingLanguage) {
        super(name, department, position, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    public void developSoftware() {
        System.out.println("Develop spoftware. Name ：" + name +
                "、Programing language：" + programmingLanguage);
    }

    // Override. @ is called "annotation (注釈)"
    // @Override can check if this method override original one correctly.
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("I attend above meeting with technical preparation. Name ：" + name);
    }
    
}
