package company;

public class Department{
    private final String name;
    private final String departmentId;
    private int budget;
    
    //constructor
    public Department(String name, String departmentId, int budget) {
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
    }
    
    //Held conference
    public void meeting() {
        System.out.println("Held department meeting. Dep : " + name + "Budget : " + budget);
    }
    //Get name
    public String getName() {
        return name;
    }
    //Get budget
    public int getBudget() {
        return budget;
    }
    //Set budget
    public void setBudget(int budget) {
        if(budget<0) {
            throw new IllegalArgumentException("Budget should be positive value!");
        }
        this.budget = budget;
    }
}
