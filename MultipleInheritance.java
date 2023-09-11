
//import java.util.*;
public class MultipleInheritance {
    public static void main(String[] args) {
        // Employee employee =
        new Employ();
    }
}

class Company {
    int id = 76;
    String name = "kowsika";
    int account = 45;

    public void getID() {
        System.out.println("Account number: " + id);
    }

    public void getName() {
        System.out.println("Name: " + name);
    }
}

class Account extends Company {
    public void getAccount() {
        System.out.println("Account: " + account);
    }
}

class Employ extends Account {
    public Employ() {
        // super.
        getID();
        super.getName();
        this.getAccount();

    }
}
