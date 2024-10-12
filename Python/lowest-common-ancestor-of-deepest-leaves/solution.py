class Solution:
    def lcaDeepestLeaves(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return None
        
        left = self.height(root.left)
        right = self.height(root.right)

        if left == right:
            return root
        elif left > right:
            return self.lcaDeepestLeaves(root.left)
        else:
            return self.lcaDeepestLeaves(root.right)
    
    def height(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        
        left = self.height(root.left)
        right = self.height(root.right)

        return max(left, right) + 1