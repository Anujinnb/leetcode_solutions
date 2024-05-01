class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, - 1);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                result[i] = stack.peek();
                
                if (arr[i] > stack.peek()) {
                    stack.push(arr[i]);
                }
            }
        }

        return result;
    }
}