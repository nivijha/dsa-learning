package Arrays;

import java.util.*;

public class Basic {

    /*public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }*/

    public static int getLargest(int number[]){
        int largest =Integer.MIN_VALUE;

        for (int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        
        int number[]={1,2,6,3,5};
        System.out.println("largest value is = " + getLargest(number));
        
        /*int marks[]=new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array = "+marks.length);


        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("Phy= "+marks[0]);
        System.out.println("Chem= "+marks[1]);
        System.out.println("Maths= "+marks[2]);

        int marks[]={97,95,94};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }*/

        


    }
}
