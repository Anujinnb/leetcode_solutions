class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxPath(root);
        return max;
    }

    public int findMaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left_sum = Math.max(0, findMaxPath(node.left));
        int right_sum = Math.max(0, findMaxPath(node.right));

        int path_sum = node.val + left_sum + right_sum;
        max = Math.max(path_sum, max);

        return node.val + Math.max(left_sum, right_sum);

    }
}