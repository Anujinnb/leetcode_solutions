//This solution is brute-force solution which has O(n^2) time complexity.

class Solution {
    public int countDays(int days, int[][] meetings) {
        boolean[] scheduled = new boolean[days + 1];
        
        for (int i = 0; i < meetings.length; i++) {
            for (int j = meetings[i][0]; j <= meetings[i][1]; j++) {
                scheduled[j] = true;
            }
        }

        int count = 0;

        for (int i = 1; i < scheduled.length; i++) {
            if (scheduled[i] == false) {
                count++;
            }
        }

        return count;
    }
}