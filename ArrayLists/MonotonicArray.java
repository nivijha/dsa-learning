import java.util.ArrayList;

public class MonotonicArray {

    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc= true;
        boolean desc= true;

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                desc=false;
            }
            if(list.get(i)<list.get(i+1)){
                inc=false;
            }
        }

        return inc || desc;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(isMonotonic(list));

        ArrayList<Integer> list2= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(14);
        list.add(18);
        list.add(23);
        list.add(27);

        System.out.println(isMonotonic(list2));

        ArrayList<Integer> list3= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println(isMonotonic(list3));
    }
}
