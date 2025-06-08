package Sort;
/* Question 2 : Given an array nums of size n, return the majority element. (MEDIUM)
The majority element is the element that appears more than ⌊n/2⌋ times. You may assume that the majority element always exists in the array.
Sample Input 1: nums = [3,2,3]
Sample Output 1: 3
Sample Input 2: nums = [2,2,1,1,1,2,2]
Sample Output 2: 2
Constraints(extra Conditions):
● n == nums.length
● 1 <= n <= 5 * 104
● -109 <= nums[i] <= 109 */

public class Q2 {

    //Brute Force-  Count the number of times each number occurs in the array & find the largest count.Time complexity - O(n^2)
    /* public static void majority(int arr[]){
        int majorityCount = arr.length/2;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count > majorityCount){
                return arr[i];
            }
        }
        return -1;
    } */

    //Divide and Conquer- If we know the majority element in the left and right halves of an array, we can determine which is the global majority element in linear time.
    /* Here, we apply a classical divide & conquer approach that recurses on the left and right halves of an array until an answer can be trivially achieved for a length-1 array. 
    Note that because actually passing copies of sub arrays costs time and space, we instead pass lo and hi indices that describe the relevant slice of the overall array. In this case, the majority element for a length-1 slice is trivially its only element, so the recursion stops there. 
    If the current slice is longer than length-1, we must combine the answers for the slice's left and right halves. If they agree on the majority element, then the majority element for the overall slice is obviously the same[1]. If they disagree, only one of them can be "right" , so we need to count the 
    occurrences of the left and right majority elements to determine which sub slice's answer is globally correct. The overall answer for the array is thus the majority element between indices 0 and n.
    Time Complexity- O(n*logn) */
    public static int countInRange(int[] nums, int num, int lo, int hi) {
        int count=0; 
        for(int i= lo; i <= hi; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int low, int high){
        //base case. the only element in an array of size 1 is the majority element.
        if(low==high){
            return nums[low];
        }

        int mid = low+(high-low)/2;
        int left = majorityElementRec(nums, low, mid);
        int right = majorityElementRec(nums, mid+1, high);

        //if the two halves agree on the majority element, return it.
        if(left==right){
            return left;
        }

        //count each element and return the majority
        int leftCount = countInRange(nums, left, low, high);
        int rightCount = countInRange(nums, right, low, high);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] num){
        return majorityElementRec(num, 0, num.length-1);
    }

    public static void main(String[] args) {
        int num[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }
}
