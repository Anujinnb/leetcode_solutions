#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h>

// Definition for a binary tree node.
struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

// Function to search a value in a Binary Search Tree.
struct TreeNode *searchBST(struct TreeNode *root, int val);

#endif // SOLUTION_H
