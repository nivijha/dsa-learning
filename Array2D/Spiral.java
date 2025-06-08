package Array2D;

public class Spiral {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow= matrix.length-1;
        int endCol= matrix.length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            /* SR- fixed
             * SC---> EC */
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            /* SR+1--->ER
             * EC-fixed */
            for(int i=startRow+1; i<=endCol; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            /* EC-1--->SC
            ER-fixed */
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            /* SC-fixed
               ER-1--->SR+1 */
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");                
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(matrix);
    }

    

}
