package Repl;

/*
1. Complete the Employee.java class:
Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)
Write two constructors:
* non-argument constructor
* parameterized constructor that will initialize all instance variables
Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
Output:
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
 */
public class Repl146 {
}

class Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Employee(){

    }
    Employee( String name, String lastName, int employeeId, String startDate, int salary){
this.employeeId=employeeId;
this.name=name;
this.salary=salary;
this.lastName=lastName;
this.startDate=startDate;

    }
    void m(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }

    public static void main(String[] args) {
        Employee o1=new Employee();
        Employee o2=new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        o1.m();
        o2.m();

    }
}