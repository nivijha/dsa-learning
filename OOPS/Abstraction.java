public class Abstraction {
    public static void main(String[] args) {
        /* Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
 */
        //Animal a = new Animal();  hum kisi bhi abstract class ka object ni bna sakte

        Mustang myHorse = new Mustang();
        //Animal->Horse->Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();//hrr animal ke pass walk naam ka function hona chahiye but woh kaise work krega woh animal class ni btaega woh uski sub classes btaegi apne aap.

}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }

    void changecolor(){
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}

class Chicken extends Animal{
    
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

