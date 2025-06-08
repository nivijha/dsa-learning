package Array2D;

public class Search {
    public static boolean staircaseSearch(int matrix[][], int key){
        /*O(n+m)=O(n) if n>>m
        O(n+m)=O(m) if n<<m */

        //taking top right corner as pivot

        int row = 0;
        int col = matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if(matrix[row][col]==key){
                System.out.println("Found key at(" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key note found");
        return false;

        
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        staircaseSearch(matrix, 10);
    }
}
