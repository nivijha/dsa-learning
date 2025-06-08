
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object p1.
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";

        BankAccount myAcc = new BankAccount();
        myAcc.username= "nivijha";
        /* myAcc.password="abgdjshri"; won't be able to access password as it is private */
        myAcc.setPassword("absadjhnci");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen{
    //prop + functions
    int tip;
    String color;

    void setcolor(String newColor){    //setter
        color = newColor;
    }

    String getcolor(){  //getter
        return this.color; 
    }

    void setTip(int tip){
        this.tip = tip;  // "this.tip" is pointing the "tip" variable created in the class and the "tip" is just hte variable passed int the funciton
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int maths, int chem){
        percentage=(phy+chem+maths)/3;
    }
}