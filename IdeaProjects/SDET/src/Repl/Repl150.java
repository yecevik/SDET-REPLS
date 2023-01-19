package Repl;
/*1. Create four classes (Person, Employee, Student, Retiree)
* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)
At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
Create multilevel inheritance: Person --> Employee --> Student --> Retiree
From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
**Expected Output:**
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
 */
public class Repl150 {
    public static void main(String[] args) {
        Employee1 o1=new Employee1("Joe","Smith",35,35000);
        o1.e1();
        Student o2=new Student("Adam","Smith",15, 0,10);
        o2.s1();
        Retiree o3=new Retiree("Frank","Smith",15,0,0,"Tour");
        o3.r1();

    }

}
class Person1 {
    String name;
    String lastname;
   int age;

    Person1(   String name, String lastname, int age){
        this.name=name;
        this.lastname=lastname;
        this.age=age;





    }

}
class Employee1 extends Person1{

    int salary;

    Employee1(String name, String lastname, int age, int salary) {

        super( name,lastname, age);
        this.salary = salary;
    }

    void e1(){
        System.out.println(name+" "+lastname+" "+age+" "+salary);
    }
}
class Student extends Employee1{
    int grade;

    Student(String name, String lastname, int age,int salary, int grade) {
        super(name, lastname, age,salary);

       this.grade=grade;


    }
    void s1(){
        System.out.println(name+" "+lastname+" "+age+" "+grade);
    }
}
class Retiree extends Student{

    String seniorActivity;
    Retiree(String name, String lastname, int age,int salary,int grade,String seniorActivity) {
        super(name, lastname, age,salary,grade);

        this.seniorActivity=seniorActivity;

    }
    void r1(){
        System.out.println(name+" "+lastname+" "+age+" "+seniorActivity);
    }
}