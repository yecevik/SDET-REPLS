package Repl;

/*
1. Complete the Dog.java class:
Create following class variables.
dogName
dogWeight
static dogBreed=Mutt;
For all methods and variables use proper naming convention.
Create constructor to initialize instance variables
2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
**Expected Output:**
Tarzan Mutt 50.0
Lucy Mutt 10.0
 */
public class Repl145 {
}

class Dog {
    String dogName;
    int dogWeight;
    static String dogBreed = "Mutt";

    Dog(String dogName,int dogWeight){

        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }
void met (){
    System.out.println(dogName+" "+dogBreed+" "+dogWeight);
}

    public static void main(String[] args) {
        Dog o1=new Dog("Tarzan",50);
        o1.met();
        Dog o2=new Dog("Lucy",10);
        o2.met();
    }
}