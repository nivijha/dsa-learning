package Array2D;

public class DiagnolSum {

    public static int sum(int matrix[][]){
        int diasum=0;

        /* Brute Force (basic approach with time complexity of O(n^2)) 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum+= matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
        }
         */

        // O(n)
        for(int i=0; i<matrix.length; i++){
            //pd
            diasum+= matrix[i][i];
            //sd
            if(i!=matrix.length-i-1){
                diasum+=matrix[i][matrix.length-i-1];
            }
        }
        return diasum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        sum(matrix);
    }

}
