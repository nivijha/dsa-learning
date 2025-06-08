
public class Tiling {

    public static int tilingProb(int n){// 2 * n floor size
        //base case
        if( n == 0 || n == 1){
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1= tilingProb(n-1);

        //horizontal choice
        int fnm2= tilingProb(n-2);

        int totalWays= fnm1 + fnm2;
        return totalWays;
    }

    public static void removeDuplicates(String str, int indx, StringBuilder newStr, boolean map[]){
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(indx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicates(str, indx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, indx+1, newStr.append(currChar), map);
        }
    }

    public static int pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=pairing(n-1);

        //pair
        int fnm2=pairing(n-2);
        int pairWays= (n-1) * fnm2;

        //totalways
        int totalWays = fnm1 + pairWays;

        return totalWays;

        /* compact way of writing- 
         return pairing(n-1) + (n-1) * pairing(n-2); */
    }

    public static void printBinString(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        /* if(lastPlace == 0){
            //sit 0 on chair n
            printBinString(n-1, 0, str.append("0"));
            printBinString(n-1, 1, str.append("1"));
        }
        else{
            printBinString(-1, 0, str.append("0"));
        } */
        
        //compact way of writing-
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinString(n-1, 1, str+("1"));
        }
        
    }

    public static void main(String[] args) {
        System.out.println(tilingProb(3));

        String str ="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        System.out.println(pairing(3));

        printBinString(3, 0, "");

    }
}
