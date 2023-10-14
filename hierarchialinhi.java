public class hierarchialinhi {
    public static void main(String ags[]) {
        Dog doggy=new Dog();
        Fish nimo=new Fish();
        Bird air=new Bird();
        doggy.walk();
        nimo.swim();
        air.fly();

    }    
}
class Animal {
    String color;
    void eat() {
        System.out.println("eat");
    }
    void breath() {
        System.out.println("hiio");
    }
}
class Dog extends Animal {
    void walk() {
        System.out.println("walk");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fg");
    }
}
