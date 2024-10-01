// solution.h
#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h> // for NULL

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

struct TreeNode *invertTree(struct TreeNode *root);

#endif // SOLUTION_H
