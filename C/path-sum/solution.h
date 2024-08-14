// solution.h

#ifndef SOLUTION_H
#define SOLUTION_H

#include <stdbool.h> // For using bool, true, and false

// Definition of TreeNode structure
struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

// Function prototype for hasPathSum
bool hasPathSum(struct TreeNode *root, int targetSum);

#endif // SOLUTION_H
