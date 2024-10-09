// For every node in root (total m), the isSameTree function may be called, which takes O(n), where n is the number of nodes in subRoot
// Therefore, time complexity of this program is O(m x n)
//The space complexity is O(h), where h is the height of the root tree, due to the recursive call stack

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return p.val == q.val && left && right;
    }
}