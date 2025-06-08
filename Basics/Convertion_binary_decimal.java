package Basics;
public class Convertion_binary_decimal {
    
    public static int binToDec(int binNum ){
        int num=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastdigit = binNum%10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));
            
            pow++;
            binNum=binNum/10;

        }
        
        System.out.println("decimal of "+ num +" = "+ decNum);
        
        return 0;
    }

    public static int decToBin(int decNum ){
        int num=decNum;
        int pow=0;
        int binNum=0;
        while(decNum>0){
            int rem = decNum%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            
            pow++;
            decNum=decNum/2;

        }
        
        System.out.println("Binary of "+ num +" = "+ binNum);
        
        return 0;
    }


    public static void main(String[] args) {
        binToDec(101);
        decToBin(5);
    }
}
