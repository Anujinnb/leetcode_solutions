class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[nums.length - 1 - i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if (!stack.isEmpty() && nums[i] < stack.peek()) {
                result[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        return result;
    }
}