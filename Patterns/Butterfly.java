package Patterns;

public class Butterfly {
    public static void pattern(int row){
        int i,j;
        //1st half
        for(i=1;i<=row;i++){
            //stars = i
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces = 2*(row-i)
            for(j=1;j<=(2*(row-i));j++){
                System.out.print("  ");
            }
            //stars = i
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half
        for(i=row;i>=1;i--){
            //stars = i
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces = 2*(row-i)
            for(j=1;j<=(2*(row-i));j++){
                System.out.print("  ");
            }
            //stars = i
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  
        
        /* Pattern-
                    *             * 
                    * *         * * 
                    * * *     * * * 
                    * * * * * * * * 
                    * * * * * * * * 
                    * * *     * * * 
                    * *         * *
                    *             *
        */
    }

    public static void main(String[] args) {
        pattern(4);
    }
}

