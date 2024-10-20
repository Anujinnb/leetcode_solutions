#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper function to create a new tree node
struct TreeNode *createTreeNode(int val)
{
    struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}

int main()
{
    // Example tree
    //       3
    //      / \
    //     5   1
    //    / \ / \
    //   6  2 0  8
    //     / \
    //    7   4

    struct TreeNode *root = createTreeNode(3);
    root->left = createTreeNode(5);
    root->right = createTreeNode(1);
    root->left->left = createTreeNode(6);
    root->left->right = createTreeNode(2);
    root->right->left = createTreeNode(0);
    root->right->right = createTreeNode(8);
    root->left->right->left = createTreeNode(7);
    root->left->right->right = createTreeNode(4);

    struct TreeNode *p = root->left;        // Node with value 5
    struct TreeNode *q = root->left->right; // Node with value 2

    struct TreeNode *lca = lowestCommonAncestor(root, p, q);

    if (lca != NULL)
    {
        printf("Lowest Common Ancestor: %d\n", lca->val);
    }
    else
    {
        printf("Lowest Common Ancestor not found.\n");
    }

    // Free allocated memory (optional but recommended)
    // Freeing all nodes is a good practice in actual usage.

    return 0;
}
