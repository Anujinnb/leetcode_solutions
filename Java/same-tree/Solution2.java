// The time complexity of this program is O(n), where n is the total number of nodes in the larger of the two trees.
// The space complexity is O(h) where h is the height of the larger of two trees
// 1. Balanced Tree: the height h = O(log n)
// 2. Skewed Tree: h = O(n)

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return left && right && p.val == q.val;
    }
}