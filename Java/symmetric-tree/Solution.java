//Space complexity of this program: 1. If the tree is balanced, the best case is O(logn) 2. If the tree is skewed, the worst case is O(n).
//Time complexity: O(n) because each node is visited only once.

class Solution {
    public boolean checkSymmetry(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val && checkSymmetry(node1.left, node2.right) && checkSymmetry(node1.right, node2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return checkSymmetry(root.left, root.right);
    }
}