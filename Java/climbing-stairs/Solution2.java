//Time complexity is O(n). The loop runs n - 1 times, so the time complexity is linear.
//Space complexity is O(1) because only a constant amount of extra space is used 

class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        for (int i = 0; i < n - 1; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
