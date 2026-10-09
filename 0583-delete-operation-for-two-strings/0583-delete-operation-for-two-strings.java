class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length();
		int m = s2.length();
		int maxLen = 0;
		int t[][] = new int[n + 1][m + 1];
		for (int i = 0; i<n + 1; i++) {
			t[i][0] = 0;
		}
		for (int j = 0; j<m + 1; j++) {
			t[0][j] = 0;
		}
		
		for (int i = 1; i<n + 1; i++) {
			for (int j = 1; j<m + 1; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					t[i][j] = 1 + t[i - 1][j - 1];
					maxLen = Math.max(t[i][j], maxLen);
				} else {
					t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
				}
			}
		}
		return (n-maxLen) + (m-maxLen);
    }
}