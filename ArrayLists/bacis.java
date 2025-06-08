import java.util.ArrayList;
import java.util.Collections;

public class bacis {
    public static void main(String[] args) {
        //Java Collection Framework
        //className objectName= new className();
        ArrayList <Integer> list= new ArrayList<>();
        ArrayList <String> list2= new ArrayList<>();

        // Add element with Time Complexity of O(1)
        list.add(1); // O(1)
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(2);

        System.out.println(list);

        list.add(5);
        System.out.println(list);

        // Get Opreation - O(1)
        int ele=list.get(3);

        System.out.println(ele);

        // Remove element from particular index - O(n)
        list.remove(2);
        System.out.println(list);

        // Set element - O(n)
        list.set(2, null);
        System.out.println(list);

        // Contains - O(n)
        System.out.println(list.contains(9));

        // Adding element at an index - O(n)
        list.add(2,9);
        System.out.println(list);

        // Print Reverse ArrayList
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }

        // Find Max in an arrayList
        ArrayList <Integer> list3= new ArrayList<>();
        list3.add(2); 
        list3.add(5);
        list3.add(9);
        list3.add(3);
        list3.add(6);
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list3.size(); i++){
            if(max<list3.get(i)){
                max=list3.get(i);
            }
        }
        System.out.println("\nMax= "+max);


        // Swap 2 numbers
        int temp=list3.get(1);
        list3.set(1, list3.get(3));
        list3.set(3, temp);
        System.out.println(list3);

        // Sort in ascending order
        Collections.sort(list3);
        System.out.println(list3);

        // Sort in descending order using Comparator func
        Collections.sort(list3, Collections.reverseOrder());
        System.out.println(list3);
    }
}
