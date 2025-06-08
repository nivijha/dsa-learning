package Patterns;

/* public class Star_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* Pattern-
        12345
        1234
        123
        12
        1
    /

} */

public class Star_pattern {

    public static void main(String[] args) {
        int i,j;
        char c='A';
        for(i=0;i<=4;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

   /* Pattern-
        A
        BC
        DEF
        GHIJ
        KLMNO 
    */
}