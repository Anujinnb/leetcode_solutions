#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int rangeSumBST(struct TreeNode *root, int low, int high)
{
    int current = 0;

    if (root == NULL)
    {
        return 0;
    }

    if (low <= root->val && root->val <= high)
    {
        current = root->val;
    }
    else
    {
        current = 0;
    }

    int left_tree = rangeSumBST(root->left, low, high);
    int right_tree = rangeSumBST(root->right, low, high);

    return current + left_tree + right_tree;
}