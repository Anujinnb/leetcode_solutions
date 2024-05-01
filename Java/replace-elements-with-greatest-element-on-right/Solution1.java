//Time complexity of this program is O(n) since we loop through the array once. The space complexity is O(1).

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }

        return arr;
    }
}