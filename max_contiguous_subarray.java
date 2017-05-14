public class Solution {
    public int maxSubArray(int[] A) {
         int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}


###################################

public class Solution {
    public int maxSubArray(int[] A) {
         int n = A.length;
        int dp =0 ;//dp[i] means the maximum subarray ending with A[i];
        dp = A[0];
        int max = dp;
        int prev=dp,tem=0;
        
        
        for(int i = 1; i < n; i++){
            tem = A[i] + (prev > 0 ? prev : 0);
            prev=tem;
            max = Math.max(max, prev);
        }
        
        return max;
    }
}
