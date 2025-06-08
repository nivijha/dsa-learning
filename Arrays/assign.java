package Arrays;

public class assign {
    /*public static boolean checkduplictenum(int num[]){
        
        int i,j,n=num.length;

        for(i=0; i<n-1; i++){
            for(j=i+1; j<n; j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }*/

       
    //using binary search
    public static int invertedsearch(int num[], int target) {
        int min=minSearch(num);

        if (num[min] <=target && target <= num[num.length-1]){
            return Search(num,min,num.length-1,target);
        }
        else{
            return Search(num,0,min,target);
        }
    }

    public static int Search(int num[], int left, int right, int target){
        int l= left;
        int r= right;

        while(left<=right){
            int mid= l+(r-1)/2;
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    public static int minSearch(int num[]){
        int left=0;
        int right=num.length-1;
        while(left<right){
            int mid= left+(right-left)/2;
            if(mid>0 && num[mid-1]>num[mid]){
                return mid;
            }
            else if(num[left]<=num[mid] && num[mid]>num[right]){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    public static void main (String[] args) {
        int num[]={4,5,6,7,1,2,3};
        int target=2;
        int pos= invertedsearch(num,target);
        System.out.println(pos);

    }

}
