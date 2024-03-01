class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int current = 0;

        if (root == null) {
            return 0;
        }

        if (root.val >= low && root.val <= high) {
            current = root.val;
        } else {
            current = 0;
        }

        int left_tree = rangeSumBST(root.left, low, high);
        int right_tree = rangeSumBST(root.right, low, high);

        return current + left_tree + right_tree;
    }
}