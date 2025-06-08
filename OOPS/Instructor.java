public class Instructor {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs =4;
        System.out.println(dobby.legs);
    }
}

//base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats ");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
class Mammals extends Animal{ // single level inheritance
    int legs;
}

//Derived Class
class Dog extends Mammals{ // multi level inheritance
    String breed;
}

//Derived Class
class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

class Shark{
    String breed;
}

class Bird extends Animal{
    String size;
}

class Sparrow{
    int numbersLeft; 
}