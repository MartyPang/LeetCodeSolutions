/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 *
 * https://leetcode.com/problems/climbing-stairs/description/
 *
 * algorithms
 * Easy (43.46%)
 * Total Accepted:    362.4K
 * Total Submissions: 832.3K
 * Testcase Example:  '2'
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * Note: Given n will be a positive integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * 
 */
class Solution {
    /**
     * Dynamic Programming
     * State Transition:
     *     dp[i] = dp[i-1] + dp[i-2]
     */
    // public int climbStairs(int n) {
    //     if(n == 1) return 1;
    //     int[] dp = new int[n+1];
    //     dp[0] = 0;
    //     dp[1] = 1;
    //     dp[2] = 2;
    //     for(int i = 3; i < n+1; ++i) {
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }

    /**
     * Recursive
     */
    public int climbStairs(int n) {
        int[] cal = new int[n+1];
        return recursiveClimb(0, n, cal);
    }
    public int recursiveClimb(int i, int n, int[] cal) {
        if(i > n) return 0;
        if(i == n) return 1;
        if(cal[i] != 0) return cal[i];

        cal[i] = recursiveClimb(i+1, n, cal) + recursiveClimb(i+2, n, cal);
        return cal[i];
    }
}

