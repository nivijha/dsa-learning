class Solution {
    public void helper(String digits, HashMap<String, String> hm, int i, List<String> res, StringBuilder temp){
        if(i==digits.length()){
            res.add(temp.toString());
            return;
        } 

        String choices = hm.get(String.valueOf(digits.charAt(i)));
        for(int j=0; j<choices.length(); j++){
            temp.append(choices.charAt(j));
            helper(digits, hm, i+1,res, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<String, String> hm = new HashMap<>();
        // String ch = 'a';
        // for(int i=2; i<=9; i++){
            
        // }

        hm.put("2", "abc");
        hm.put("3", "def");
        hm.put("4", "ghi");
        hm.put("5", "jkl");
        hm.put("6", "mno");
        hm.put("7", "pqrs");
        hm.put("8", "tuv");
        hm.put("9", "wxyz");

        List<String> res = new ArrayList<>();
        helper(digits, hm, 0, res, new StringBuilder());
        return res;
    }
}