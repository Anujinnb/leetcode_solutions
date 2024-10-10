// solution.h

#ifndef SOLUTION_H
#define SOLUTION_H

#include <stdbool.h> // For using bool type

// Definition for a binary tree node.
struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

// Function declarations
bool isSubtree(struct TreeNode *root, struct TreeNode *subRoot);
bool isSameTree(struct TreeNode *p, struct TreeNode *q);

#endif // SOLUTION_H
