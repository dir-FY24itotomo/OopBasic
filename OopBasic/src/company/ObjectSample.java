package company;

public class ObjectSample {
  //main method
    public static void main(String[] args) {
        Department devDepartment = new Department("consulting", "001", 100000);
        Employee tomo = new Employee("tomo", devDepartment, "analyst", 221458);
        
        tomo.report(1);
        tomo.joinMeeting();  
    }
}