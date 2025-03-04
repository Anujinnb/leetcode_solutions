#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

struct TreeNode *lowestCommonAncestor(struct TreeNode *root, struct TreeNode *p, struct TreeNode *q)
{
    if (root == NULL)
    {
        return NULL;
    }

    if (p->val == root->val || q->val == root->val)
    {
        return root;
    }

    struct TreeNode *left = lowestCommonAncestor(root->left, p, q);
    struct TreeNode *right = lowestCommonAncestor(root->right, p, q);

    if (left == NULL)
    {
        return right;
    }

    if (right == NULL)
    {
        return left;
    }

    return root;
}