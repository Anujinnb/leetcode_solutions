class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        current = 0

        if root is None:
            return 0
        

        if low <= root.val and root.val <= high:
            current = root.val
        else:
            current = 0
        
        left_tree = self.rangeSumBST(root.left, low, high)
        right_tree = self.rangeSumBST(root.right, low, high)

        return current + left_tree + right_tree