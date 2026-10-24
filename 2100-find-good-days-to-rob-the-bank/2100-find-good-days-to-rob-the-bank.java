class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] prefix = new int[security.length];
        int[] suffix = new int[security.length];
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);

        for (int i = 1; i < security.length; i++) {
            if (security[i] <= security[i - 1]) {
                prefix[i] += prefix[i - 1] ;
            } 
        }

        for (int i = security.length - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                suffix[i] += suffix[i + 1] ;
            } 
        }

        for (int i = 0; i < security.length; i++) {
            System.out.print(prefix[i]);
            
        }
        System.out.print("\n");
        for (int i = 0; i < security.length; i++) {
            System.out.print(suffix[i]);
            
        }

        for (int i = 0; i < security.length; i++) {
            if (prefix[i] >= time+1 && suffix[i] >= time+1) {
                res.add(i);
            }
        }

        return res;
    }
}