#include <stdbool.h>
#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

bool isSameTree(struct TreeNode *p, struct TreeNode *q);

bool isSubtree(struct TreeNode *root, struct TreeNode *subRoot)
{
    if (root == NULL)
    {
        return false;
    }

    if (isSameTree(root, subRoot))
    {
        return true;
    }

    return isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);
}

bool isSameTree(struct TreeNode *p, struct TreeNode *q)
{
    if (p == NULL && q == NULL)
    {
        return true;
    }

    if (p == NULL || q == NULL)
    {
        return false;
    }

    bool left = isSameTree(p->left, q->left);
    bool right = isSameTree(p->right, q->right);

    return p->val == q->val && left && right;
}