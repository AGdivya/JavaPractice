package InheritanceWithAbstractionDemo;

public class Manager extends Employee {

    int noOfProjects;

    public Manager()
    {
        empId=100;
        name="Divi";
        salary=500000;
        noOfProjects=1;
    }

    public Manager(int id, double sal, String nm,int nop) {
        empId = id;
        salary = sal;
        name = nm;
        noOfProjects=nop;
    }

    @Override
    void designationDetails() {
        System.out.println("I am a manager");

    }

}