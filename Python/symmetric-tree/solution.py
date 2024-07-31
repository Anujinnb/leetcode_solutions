class Solution:
    def checkSymmetry(self, node1: Optional[TreeNode], node2: Optional[TreeNode]) -> bool:
        if not node1 and not node2:
            return True
        
        if not node1 or not node2:
            return False
        
        return (node1.val == node2.val and 
                self.checkSymmetry(node1.left, node2.right) and 
                self.checkSymmetry(node1.right, node2.left))
    
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        
        return self.checkSymmetry(root.left, root.right)
        