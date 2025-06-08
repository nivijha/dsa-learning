package Array2D;

public class Q1 {
    public static void seven(int matrix[][]){
        int count7=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if (matrix[i][j]==7) {
                    count7++;
                }
            }
        }
        System.out.println("number of 7's are "+count7);
    }
    public static void main(String[] args) {
        int martix[][]={ {4,7,8},{8,8,7} };
        seven(martix);
    }
}
