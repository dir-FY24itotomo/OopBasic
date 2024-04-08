package company;

public class ObjectSample {
  //main method
    public static void main(String[] args) {
        Department devDepartment = new Department("consulting", "001", 100000);
        Employee tomo = new Sales("tomo", devDepartment, "analyst", 221458);
        Engineer tomoEngineer = new Engineer("Tomo", devDepartment, "fake", 100000, "Java");
        var parttimeWorker = new ParttimeWorker("Tomozou", devDepartment);
        Department salesDepartment = new Department("sales","002",30000);
        Employee ryuya = new Sales("Matusita", salesDepartment, "Manager", 321123);
        
        tomo.report(1);
        tomo.joinMeeting();  
        tomoEngineer.joinMeeting();
        tomoEngineer.developSoftware();
        ((Workable)tomoEngineer).work();
        ((Workable)parttimeWorker).work();
        ryuya.report();
        ryuya.joinMeeting();
        ((Workable)ryuya).work();
    }
}