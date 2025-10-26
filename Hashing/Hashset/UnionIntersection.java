package Hashset;
import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> s1 = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            s1.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            s1.add(arr2[i]);
        }

        System.out.println("Union of two arrays = " + s1.size() + "\n" + s1);
        System.out.println();

        s1.clear();
        int count =0;
        HashSet<Integer> s2 = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            s1.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(s1.contains(arr2[i])){
                count++;
                s1.remove(arr2[i]);
                s2.add(arr2[i]);
            }
        }

        System.out.println("Intersection of two arrays = " + count + "\n" + s2);
    }
}
