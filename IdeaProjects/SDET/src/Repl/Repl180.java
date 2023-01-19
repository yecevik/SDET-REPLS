package Repl;

public class Repl180 {

    /*

    Create Class EncapsulationDemo

create two variable as shown below.

private String empName=John;

private int empAge=30;

Create only getters methods for each variable.

Print the values of each variable as shown below.

**Expected Output:**

```
Employee Name: John
```

```
Employee Age: 30
```
     */
}

 class   EncapsulationDemo3 {
     private String empName;

     private int empAge;




     public String getEmpName() {
         return empName;
     }

     public int getEmpAge() {
         return empAge;
     }

     void print3(String empName,int empAge){
         System.out.println("Employee Name: " + empName);
         System.out.println("Employee Age: " + empAge);
     }
 }
 class Main2{

     public static void main(String[] args) {
         EncapsulationDemo3 emp=new EncapsulationDemo3();
         emp.print3("John",30);

     }
 }
