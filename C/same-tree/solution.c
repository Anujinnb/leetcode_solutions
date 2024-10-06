#include <stdbool.h>
#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

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
