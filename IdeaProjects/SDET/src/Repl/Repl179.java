package Repl;

import java.util.Map;

public class Repl179 {/*# Encapsulation

        Create Class EncapsulationDemo that will have 2 variables empName and empAge;
        Create the getter/setter methods for each variable.

        In Main Class and main method

        Using setter methods assign the values as "Mario" and "32"

        Using getter methods print the values as below outputs.

        **Expected Output:**

        ```
        Employee Name: Mario
        Employee Age: 32
        ```*/
}
class EncapsulationDemo2 {
    private String empName;

    private int empAge;

    public EncapsulationDemo2(String empName, int empAge) {
        setEmpName(empName);
        setEmpAge(empAge);

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {

        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

void printing(){

    System.out.println("Employee Name:"+empName);
    System.out.println("Employee Age: "+empAge);
}

}
class Main {

    public static void main(String[] args) {
        EncapsulationDemo2 emp = new EncapsulationDemo2("Mario", 32);
        emp.printing();


    }

}
