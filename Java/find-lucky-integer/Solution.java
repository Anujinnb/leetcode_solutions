//This solution gives time complexity of O(n) since it used the hashmap. 
//Explanation: We need to iterate through the array first to check if the number exists in the hashmap or not.
//If it already exists in the hashmap, then we store two things: the number, the count of occurrence. Otherwise, 
//we just count that as one. On the next step, using entrySet, we check if the number equals the count of occurrence.
//If that is the case, then we found the lucky number. Also, if there are multiple numbers that equals the count of occurrence,
//then we get the highest number.

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int luckyNumber = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                luckyNumber = Math.max(luckyNumber, entry.getKey());
            }
        }

        return luckyNumber;
    }
}