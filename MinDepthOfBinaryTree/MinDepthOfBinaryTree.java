//Explanation for the code: First we need to check whether the root is null or not. If it is null, then the depth is 0.
//Otherwise, we can use recursion to find the depth of both left and right side of tree. If either one of them is null,
//then minimum depth of the tree is the maximum of the depths of the non-null subtree plus . If that is not the case, 
//then we can simply find the minimum depth by comparing the two.

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