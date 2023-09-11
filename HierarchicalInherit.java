package Inheritance;

public class HierarchicalInherit {
        public static void main(String[] args) {
            Employ employy = new Employ();
            Account account = new Account();
            employy.getSalaryy();
            account.getAccount();
            account.getName();
            employy.getID();
        }
    }
    class Company{
        int id=76;
        String name="kowsika";
        int account=45;
        double salaryy = 9000;
        public void getID(){
            System.out.println("Account number: "+id);
        }
        public void getName(){
            System.out.println("Name: "+name);
        }
    }
    class Account extends Company{
        public void getAccount(){
            System.out.println("Account: "+account);
        }
    }
    class Employ extends Company{
            public void getSalaryy(){
                System.out.println("Salary: "+salaryy);
            }
        }

