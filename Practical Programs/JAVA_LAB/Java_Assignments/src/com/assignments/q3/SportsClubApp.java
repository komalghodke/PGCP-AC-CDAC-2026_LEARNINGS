package com.assignments.q3;
/*
SportsClubApp class
Menu-driven program to manage employees and members.
Implements all required operations.
*/
import java.util.*;

public class SportsClubApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("ABC","999","a@x.com","HR","Manager","2020-01-01",30000));
        employees.add(new ContractEmployee("GK","888","b@x.com","IT","Developer","2021-02-02",160,200));
        employees.add(new Vendor("KG","777","c@x.com","Supply","Vendor","2022-03-03",10,50000));

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Employees by Type");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Display All Employees");
            System.out.println("5. Calculate Salary by Designation");
            System.out.println("6. Display 5 Employees of Department");
            System.out.println("7. Exit");
            int ch = sc.nextInt(); sc.nextLine();

            switch(ch) {
                case 1:
                    System.out.print("Enter type (salaried/contract/vendor): ");
                    String type = sc.nextLine();
                    for(Employee e: employees) {
                        if((type.equalsIgnoreCase("salaried") && e instanceof SalariedEmployee) ||
                           (type.equalsIgnoreCase("contract") && e instanceof ContractEmployee) ||
                           (type.equalsIgnoreCase("vendor") && e instanceof Vendor)) {
                            e.display();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    for(Employee e: employees) if(e.getId()==id) e.display();
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    String nm = sc.nextLine();
                    for(Employee e: employees) if(e.getName().equalsIgnoreCase(nm)) e.display();
                    break;
                case 4:
                    for(Employee e: employees) e.display();
                    break;
                case 5:
                    System.out.print("Enter designation: ");
                    String des = sc.nextLine();
                    for(Employee e: employees) if(e.getDesignation().equalsIgnoreCase(des))
                        System.out.println(e.getName()+" Salary: "+e.calculateSalary());
                    break;
                case 6:
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    int count=0;
                    for(Employee e: employees) {
                        if(e.getDepartment().equalsIgnoreCase(dept)) {
                            e.display(); count++;
                            if(count==5) break;
                        }
                    }
                    break;
                case 7: return;
            }
        }
    }
}