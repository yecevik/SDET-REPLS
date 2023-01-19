package Class24;

public class Horse {


    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }

    String getName() {

        return name;
    }

    void setName(String name) {
        if (name.length() > 20) {
            System.out.println("name must be less than 20 characters");
        } else
            this.name = name;
    }

    String getBreed() {
        return breed;
    }

    void setBreed(String breed) {

        if (breed.equalsIgnoreCase("arab")) {
            System.out.println("This horse is strong");

        } else if (breed.equalsIgnoreCase("english")) {
            System.out.println("This horse is fast");
        }
        this.breed = breed;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        if (color.equalsIgnoreCase("white")) {
            System.out.println("White horse is beautiful");
        } else if (color.equalsIgnoreCase("Black")) {
            System.out.println("Black horse is amazing");
        }
        this.color = color;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age < 0 && age > 40) {
            System.out.println("please enter proper age");
        }
        this.age = age;
    }

    double getWeight() {
        if (weight > 400 && weight < 0) {
            System.out.println("please enter proper age");
        }
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Color " + color + " Age " + age + " Weight " + weight);
    }
}

class Test {

    public static void main(String[] args) {
        Horse h = new Horse("Champion", "arab", "black", 15, 250);
        h.printInfo();


    }
}