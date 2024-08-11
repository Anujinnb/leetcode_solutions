#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int rangeSumBST(struct TreeNode *root, int low, int high);

#endif // SOLUTION_H
