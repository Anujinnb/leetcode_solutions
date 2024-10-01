// main.c
#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Function to create a new tree node
struct TreeNode *createNode(int val)
{
    struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}

// Function to print the tree in pre-order traversal
void printTree(struct TreeNode *root)
{
    if (root == NULL)
    {
        return;
    }
    printf("%d ", root->val);
    printTree(root->left);
    printTree(root->right);
}

int main()
{
    // Creating a sample binary tree:
    //      1
    //     / \
    //    2   3
    //   / \ / \
    //  4  5 6  7
    struct TreeNode *root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->left->right = createNode(5);
    root->right->left = createNode(6);
    root->right->right = createNode(7);

    printf("Original Tree: ");
    printTree(root);
    printf("\n");

    // Invert the binary tree
    invertTree(root);

    printf("Inverted Tree: ");
    printTree(root);
    printf("\n");

    // Free memory (optional for this example)
    // You could add code here to free all allocated nodes if desired.

    return 0;
}
