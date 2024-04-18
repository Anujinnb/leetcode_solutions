//Runtime complexity: O(n) because we loop through the flowerbed array once
//Space complexity: O(1) because regardless of the input it uses constant space
//Explanation: First check if n is 0 then we don't need to do anything so return true. Otherwise, we loop through the flowerbed array 
//and check if we can place flowers at current position. In this case, if it is 0, then we check the two sides. If both previous and next positions
//are available, then we can place the flower, which is assigning the value to 1 and reduce n. If we place all the flowers (n == 0), then we can
//simply return true.  

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}