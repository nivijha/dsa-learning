import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        Collections.sort(list);
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        for(int i=0; i<list.size();i++){
            if(i==0){
                if(list.get(i)+1!=list.get(i+1)){
                    lonelyNumbers.add(list.get(i));
                }
            }
            else if(i==list.size()-1){
                if(list.get(i)-1!=list.get(i-1)){
                    lonelyNumbers.add(list.get(i));
                }
            }
            else{
                if(list.get(i)-1!=list.get(i-1) && list.get(i)+1 != list.get(i+1)){
                    lonelyNumbers.add(list.get(i));
                }
            }
        }

        System.out.println(lonelyNumbers);
        
    }
}
