package Repl;

public class Repl178 {




    /*Encapsulation

Create Class EncapsulationDemo

create two variable as shown below.

private String empName;

private int empAge;

Create the getter/setter methods for each variable.

In Main Class and main method.

Using setter methods assign the values as "John" and "30"

Using getter methods print the values as below outputs.

**Expected Output:**

```
Employee Name: John
Employee Age: 30
```*/

}

class EncapsulationDemo {
    private String empName;

    private int empAge;

    public EncapsulationDemo(String empName, int empAge) {
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

    void printInfo() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);

    }
}

class Test {
    public static void main(String[] args) {


        EncapsulationDemo emp = new EncapsulationDemo("John", 30);
        emp.printInfo();
    }
}