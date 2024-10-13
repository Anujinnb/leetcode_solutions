#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int height(struct TreeNode *root);

struct TreeNode *lcaDeepestLeaves(struct TreeNode *root)
{
    if (root == NULL)
    {
        return NULL;
    }

    int left = height(root->left);
    int right = height(root->right);

    if (left == right)
    {
        return root;
    }
    else if (left > right)
    {
        return lcaDeepestLeaves(root->left);
    }
    else
    {
        return lcaDeepestLeaves(root->right);
    }
}

int height(struct TreeNode *root)
{
    int max = 0;

    if (root == NULL)
    {
        return 0;
    }

    int left = height(root->left);
    int right = height(root->right);

    if (left > right)
    {
        max = left;
    }
    else
    {
        max = right;
    }

    return max + 1;
}