import java.util.*;
public class Encapsulation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Employee details = new Employee();

        System.out.println("enter employee id:");
        details.setEmployee_id(sc.nextInt());
        System.out.println("enter employee name:");
        details.setEmployee_name(sc.next());
        System.out.println("enter employee salary:");
        details.setEmployee_salary(sc.nextInt());

        System.out.println("----------------Overall details of the employee----------------\nEmployee id:\n"+details.getEmployee_id()+"\nEmployee name:\n"+details.getEmployee_name()+"\nEmployee salary:\n"+details.getEmployee_salary());
        sc.close();

    }
}
class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    public int getEmployee_id(){
        return employee_id;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public double getEmployee_salary(){
        return employee_salary;
    }
    public void setEmployee_id(int employee_id){
        this.employee_id= employee_id;
    }
    public void setEmployee_name(String employee_name){
        this.employee_name= employee_name;
    }
    public void setEmployee_salary(double employee_salary){
        this.employee_salary= employee_salary;
    }
}