class Solution:
    def __init__(self):
        self.max_sum = -inf

    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        self.findMaxPath(root)
        return self.max_sum

    def findMaxPath(self, node: Optional[TreeNode]) -> int:
        if node is None:
            return 0
        
        left_sum = max(0, self.findMaxPath(node.left))
        right_sum = max(0, self.findMaxPath(node.right))

        path_sum = node.val + left_sum + right_sum
        self.max_sum = max(self.max_sum, path_sum)

        return node.val + max(left_sum, right_sum)