// main.c

#include <stdio.h>
#include <stdlib.h>
#include "solution.h" // Include the header file to access the functions

// Helper function to create a new tree node
struct TreeNode *newNode(int val)
{
    struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = node->right = NULL;
    return node;
}

int main()
{
    // Create the main tree (root)
    struct TreeNode *root = newNode(3);
    root->left = newNode(4);
    root->right = newNode(5);
    root->left->left = newNode(1);
    root->left->right = newNode(2);

    // Create the subRoot tree
    struct TreeNode *subRoot = newNode(4);
    subRoot->left = newNode(1);
    subRoot->right = newNode(2);

    // Test if subRoot is a subtree of root
    if (isSubtree(root, subRoot))
    {
        printf("subRoot is a subtree of root.\n");
    }
    else
    {
        printf("subRoot is not a subtree of root.\n");
    }

    return 0;
}
