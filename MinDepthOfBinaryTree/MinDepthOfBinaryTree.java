class Solution {
    public int minDepth(TreeNode root) {
        int result = 0;

        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (root.right == null || root.left == null) {
            result = Math.max(left, right) + 1;
        } else {
            result = Math.min(left, right) + 1;
        }

        return result;
    }
}