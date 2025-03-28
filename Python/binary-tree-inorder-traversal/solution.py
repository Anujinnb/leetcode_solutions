class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self._inorder(root, res)
        return res
    
    def _inorder(self, node: Optional[TreeNode], res: List[int]):
        if node:
            self._inorder(node.left, res)
            res.append(node.val)
            self._inorder(node.right, res)