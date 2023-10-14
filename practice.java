import java.util.*;
abstract class Animal {
    abstract void walk();
}
class Dog extends Animal {
    void walk() {
        System.out.println("dog");
    }
}
public class practice {
    public static void main(String args[]) {
        Animal a=new Animal();
        a.walk();
    }
    
}
