class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];

            if (max < altitude) {
                max = altitude;
            }
        }

        return max;
    }
}