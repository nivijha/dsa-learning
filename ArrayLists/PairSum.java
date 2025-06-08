import java.util.ArrayList;

public class PairSum {
    // Brute Force O(n^2)
    public static boolean pairSum(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int currSum = list.get(i) + list.get(j);
                if (target == currSum) {
                    return true;
                }
            }

        }
        return false;
    }

    // 2-pointer Approach O(n)
    public static boolean twoPointerApproach(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;
        while (lp != rp) {
            int sum = list.get(rp) + list.get(lp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp++;
            } else if (sum > target) {
                rp--;
            }
        }
        return false;
    }

   
    // O(n)
    public static boolean sortedRotatedArr(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; //smallest
        int rp = bp; //largest
        while (lp != rp) {
            int sum = list.get(rp) + list.get(lp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heightArr = new ArrayList<>();
        heightArr.add(11);
        heightArr.add(15);
        heightArr.add(6);
        heightArr.add(8);
        heightArr.add(9);
        heightArr.add(10);

        System.out.println(pairSum(heightArr, 50));
        System.out.println(twoPointerApproach(heightArr, 51));
        System.out.println(sortedRotatedArr(heightArr, 17));

    }
}
