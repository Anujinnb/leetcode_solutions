#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int height(struct TreeNode *root);

struct TreeNode *lcaDeepestLeaves(struct TreeNode *root);

#endif // SOLUTION_H
