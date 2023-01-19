package Repl;
/*
**For you to do:**
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
**Expected Output:**
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */
public class Repl87 {


}
class Main13{
    String carColor;
    int carYear;
    String carMake;



    public static void main(String[] args) {
        Main13 obj1=new Main13();
        obj1.carMake="BMW";
        obj1.carColor="White";
        obj1.carYear=2018;

        Main13 obj2=new Main13();
        obj2.carMake="Toyota";
        obj2.carColor="Black";
        obj2.carYear=2019;
        System.out.println("Car color is "+obj1.carColor+"  and car year is "+obj1.carYear+ " and car make is "+obj1.carMake );
        System.out.println("Car color is "+obj2.carColor+"  and car year is "+obj2.carYear+ " and car make is "+obj2.carMake );
    }

}