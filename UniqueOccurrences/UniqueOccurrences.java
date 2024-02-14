//Explanation for the code: Using hashmap, if hashmap contains the specific number, then we can increase the count of occurrence
//If hashmap doesn't contain that number, then we can put that number and count of 1 in the hashmap.
//Using the entry set, if entry.getValue() which is the occurrence of number already exists in the hashset,
//then it is not unique. So, we return false. Otherwise, we add that to the entry set.

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int occurrences = entry.getValue();
            if (set.contains(occurrences)) {
                return false;
            } else {
                set.add(occurrences);
            }
        }

        return true;
    }
}
