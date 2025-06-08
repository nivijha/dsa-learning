import java.util.ArrayList;

public class ContMostWater {

    public static int storeWater(ArrayList<Integer> heightArr){
        int maxWaterLevel= 0;
        for(int i=0; i<heightArr.size(); i++){
            int waterLevel=0;
            for(int j=i+1; j<heightArr.size(); j++){
                int height= Math.min(heightArr.get(i),heightArr.get(j));
                int width= j-i;
                waterLevel= height*width;
            }
            if(waterLevel>maxWaterLevel){
                maxWaterLevel=waterLevel;
            }
        }
        return maxWaterLevel;
    }


    public static int twoPointerApproach(ArrayList<Integer> heighArr){
        int maxWaterLevel=0;
        int lp=0, rp=heighArr.size()-1;

        while(lp<rp){
            int height= Math.min(heighArr.get(lp), heighArr.get(rp));
            int width= rp-lp;
            int currWater= height*width;
            maxWaterLevel= Math.max(maxWaterLevel, currWater);

            if(heighArr.get(lp)<heighArr.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWaterLevel;
    }

    public static void main(String[] args) {
        ArrayList <Integer> heightArr= new ArrayList<>();
        heightArr.add(1);
        heightArr.add(8);
        heightArr.add(6);
        heightArr.add(2);
        heightArr.add(5);
        heightArr.add(4);
        heightArr.add(8);
        heightArr.add(3);
        heightArr.add(7);
        int waterLevel= storeWater(heightArr);
        System.out.println(waterLevel);

        waterLevel= twoPointerApproach(heightArr);
        System.out.println(waterLevel);
    }
}
