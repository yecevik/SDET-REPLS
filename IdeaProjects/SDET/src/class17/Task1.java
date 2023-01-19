package class17;

public class Task1 {
}

class Student{
    void study(){
        System.out.println("I  study Generally");
    }
    void read(){
        System.out.println("I can read and write too");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("I study Java and Selenium");
    }

    @Override
    void read() {
        System.out.println("I can read and write codes");
    }
    void preparingInterview(){
        System.out.println("I'm getting prepared for interviews");
    }
}
class CollegeStudent extends Student{
    @Override
    void study() {
        System.out.println("I study very hard");
    }

    @Override
    void read() {
        System.out.println("I  read any kind of codes");
    }
    void prepareForExams(){
        System.out.println("I'm getting prepared for exams");
    }
}
class SchoolStudent extends Student{
    @Override
    void study() {
        System.out.println("I can study Japanese" );
    }

    @Override
    void read() {
        System.out.println("I can read books and newspaper");
    }
    void prepareForTests(){
        System.out.println("I'm getting prepared for code stuff");
    }
}
