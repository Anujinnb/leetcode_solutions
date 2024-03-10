class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        left = self.minDepth(root.left)
        right = self.minDepth(root.right)

        if (not root.left or not root.right):
            result = max(left, right) + 1
        else:
            result = min(left, right) + 1

        return result