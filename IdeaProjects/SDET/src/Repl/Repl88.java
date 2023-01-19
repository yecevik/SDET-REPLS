package Repl;
/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */
public class Repl88 {


}
class Main14{

    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(name+" the "+color+" "+breed+" can bark");

    }
    void run(){
        System.out.println(name+" the "+color+" "+breed+" can run");
    }
    void play(){
        System.out.println(name+" the "+color+" "+breed+" can play");
    }
    public static void main(String[] args) {

        Main14 o1=new Main14();
        o1.breed="Husky";
        o1.color="Gray";
        o1.name="Max ";
        Main14 o2=new Main14();
        o2.breed="Bulldog";
        o2.color="Yellow";
        o2.name="Tommy ";
        Main14 o3=new Main14();
        o3.breed="Labrador";
        o3.color="Black";
        o3.name="Joe ";


        o1.bark();
        o1.run();
        o1.play();
        o2.bark();
        o2.run();
        o2.play();
        o3.bark();
        o3.run();
        o3.play();




    }

}