#ifndef SOLUTION_H
#define SOLUTION_H

#include <stdbool.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

bool isSameTree(struct TreeNode *p, struct TreeNode *q);

#endif // SOLUTION_H
