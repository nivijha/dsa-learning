public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(3.14f, 1.5f ));
        System.out.println(calc.sum(3, 4));
        System.out.println(calc.sum(2, 4, 6));

        Deer d = new Deer();
        d.eat();
    }
}

//Method overloading
class Calculator{
    int sum(int a,int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//Method overriding
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats only Grass");
    }
}
