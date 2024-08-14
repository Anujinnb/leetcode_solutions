#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

bool hasPathSum(struct TreeNode *root, int targetSum)
{
    if (root == NULL)
    {
        return false;
    }

    if (root->left == NULL && root->right == NULL)
    {
        return root->val == targetSum;
    }

    bool leftSum = hasPathSum(root->left, targetSum - root->val);
    bool rightSum = hasPathSum(root->right, targetSum - root->val);

    return leftSum || rightSum;
}