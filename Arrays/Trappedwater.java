package Arrays;

public class Trappedwater {
    public static int rainwater(int height[]){
        //calculate left max boundary -> array
        int n= height.length;
        int LeftMax[]= new int[n];
        LeftMax[0] = height[0];
        for(int i=1; i<n; i++){
            LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
        }

        //calculate right max boundary -> array
        int RightMax[]=new int[n]; 
        RightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            RightMax[i]= Math.max(height[i], RightMax[i+1]);
        }

        int trappedWater=0;

        //loop
        for(int i=0; i<n; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel= Math.min(LeftMax[i], RightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
       
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(rainwater(height));
    }
    
}
