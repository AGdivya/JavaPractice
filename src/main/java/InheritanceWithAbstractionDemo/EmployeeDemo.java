package InheritanceWithAbstractionDemo;

public class EmployeeDemo {

    public static void main(String[] args) {

        Manager m=new Manager();
        m.designationDetails(); //I am a manager
        m.displayDetails(); //it will take details which define in Manager constructor

        System.out.println("..........................");

        SalesExecutive s=new SalesExecutive();
        s.designationDetails(); //I am a SalesExecutive
        s.displayDetails();//divya 100 50000

        System.out.println("..........................");

        Manager m1=new Manager(12,2000,"raj",3);
        m1.designationDetails(); //I am a manager
        m1.displayDetails(); //12,2000,raj,3
    }
}
