//This solution takes O(nlogn) time complexity because of sorting the meetings array.

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int unscheduled = 0;
        int last = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            if (start > last + 1) {
                unscheduled += start - last - 1;
            }

            last = Math.max(last, end);
        }

        if (last < days) {
            unscheduled += days - last;
        }

        return unscheduled;
    }
}