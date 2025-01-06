class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");

        List<String> filteredList = new ArrayList<>();

        for (String str : strs) {
            if (!str.isEmpty()) {
                filteredList.add(str);
            }
        }

        String[] resultArray = filteredList.toArray(new String[0]);

        int left = 0;
        int right = resultArray.length - 1;

        while (left < right) {
            String temp = resultArray[left];
            resultArray[left] = resultArray[right];
            resultArray[right] = temp;

            left++;
            right--;
        }

        String resultString = String.join(" ", resultArray);

        return resultString;
    }
}