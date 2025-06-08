package Patterns;

public class Diamond {
    
    public static void pattern(int row){
        int i,j;
        //1st half
        for(i=1;i<=row;i++){
            
            //spaces = (row-i)
            for(j=1;j<=((row-i));j++){
                System.out.print("  ");
            }
            
            //stars = 2i-1
            for(j=1;j<=((2*i)-1);j++){
              System.out.print("* ");
            }

            System.out.println();
        }
        //2st half
        for(i=row;i>=1;i--){
            
            //spaces = (row-i)
            for(j=1;j<=((row-i));j++){
                System.out.print("  ");
            }
            
            //stars = 2i-1
            for(j=1;j<=((2*i)-1);j++){
              System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
