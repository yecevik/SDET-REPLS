package Overriding1;

public class Car {

    void start(){

        System.out.println("use the key to start me");
    }
    void stop(){
        System.out.println("use brakes to stop me");
    }

    void park(){
        System.out.println("park me manually");

    }
}

class BMW extends Car{
    void start(){

        System.out.println("use push start button to start me");
    }
    void stop(){
        super.stop();
        System.out.println("use Auto braking  to stop me");

    }
}
class Toyota extends Car{
    void start(){

        System.out.println("push me to start");
    }

}

class Tesla extends Car{
void start(){
    System.out.println("use the app to start");
    super.start();
}
    void stop(){
        super.stop();
        System.out.println("use AI and Auto braking  to stop me");

    }
    void park(){
        System.out.println("I can auto park myself");

    }

}