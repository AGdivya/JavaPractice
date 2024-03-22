package InheritanceWithAbstractionDemo;

abstract class Employee {

    int empId;
    double salary;
    String name;

    public Employee() //non parametrized constructor
    {
        empId=100;
        name="Divya";
        salary=500000;
    }

    //parametrized constructor
    public Employee(int id, double sal, String nm) {
        empId = id;
        salary = sal;
        name = nm;
    }

    public void displayDetails()
    {
        System.out.println("Emp name:" + name);
        System.out.println("Emp Id:" + empId);
        System.out.println("Emp Salary:" + salary);
    }

    abstract void designationDetails();

}
