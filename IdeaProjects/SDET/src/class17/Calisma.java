package class17;

public class Calisma {
    /*Create class A

declare variable int i=10;

Create class B  extends A

declare variable int i=20;

create a method to display value of variable i from both classes

In Main Class create an object of subclass and call method display

**Expected Output:**

```
20
```

```
10
```
*/

}


class A{

    int i=10;
    void met1(){
        System.out.println(i);
    }

}
class B extends A{
    int i=20;
    void met2(){
        System.out.println(i);
    }

}
class Main{

    public static void main(String[] args) {
        B b=new B();
        b.met2();
    }
}
