#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper function to create a new tree node
struct TreeNode *newNode(int val)
{
    struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}

int main()
{
    // Create a sample tree
    //        3
    //       / \
    //      5   1
    //     / \   \
    //    6   2   8
    //       / \
    //      7   4

    struct TreeNode *root = newNode(3);
    root->left = newNode(5);
    root->right = newNode(1);
    root->left->left = newNode(6);
    root->left->right = newNode(2);
    root->right->right = newNode(8);
    root->left->right->left = newNode(7);
    root->left->right->right = newNode(4);

    // Find the LCA of the deepest leaves
    struct TreeNode *lca = lcaDeepestLeaves(root);
    if (lca != NULL)
    {
        printf("The LCA of the deepest leaves is: %d\n", lca->val);
    }
    else
    {
        printf("The tree is empty or has no deepest leaves.\n");
    }

    return 0;
}
