# Explanation: First check if n is 0 then we don't need to do anything so return true. Otherwise, we loop through the flowerbed array 
# and check if we can place flowers at current position. In this case, if it is 0, then we check the two sides. If both previous and next positions
# are available, then we can place the flower, which is assigning the value to 1 and reduce n. If we place all the flowers (n == 0), then we can
# simply return true.  

class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if n == 0:
            return True
        
        for i in range(len(flowerbed)):
            if flowerbed[i] == 0:
                prev = 0 if i == 0 else flowerbed[i - 1]
                next = 0 if i == len(flowerbed) - 1 else flowerbed[i + 1]

                if prev == 0 and next == 0:
                    flowerbed[i] = 1
                    n -= 1

                    if n == 0:
                        return True

        return False