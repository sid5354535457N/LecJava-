public class multilevelinhi {
    public static void main(String args[]){
        Dog doggy=new Dog();
        doggy.legs=4;
        doggy.eat();
        System.out.println(doggy.legs);
    }

}
class Animal {
    String color;
    void eat() {
        System.out.println("eat");
    }
    void breath() {
        System.out.println("huu");
    }

}
class Mammel extends Animal {
    int legs;
}
class Dog extends Mammel {
    String breedl;
}

