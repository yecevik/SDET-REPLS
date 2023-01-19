package Overriding1;

public class Animal {
    void eat() {
        System.out.println("Animals usually eat plants");

    }

    void sleep() {

        System.out.println("Animals usually sleep 8-10 hours");
    }
}

class Panda extends Animal {
    @Override
    void eat() {
        System.out.println("Pandas eat Bamboos");

    }
/*Override is an annotation that tells java to check for extra rules like
if we are properly overriding a method or not
* */
@Override
    void sleep() {

        System.out.println("Animals usually sleep for 14 hours");
    }
}
class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cats like to eat fish");

    }

}