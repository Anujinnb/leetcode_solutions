#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper function to create a new tree node.
struct TreeNode *createNode(int val)
{
    struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}

// Main function to test the searchBST function.
int main()
{
    // Constructing a simple BST for testing.
    struct TreeNode *root = createNode(4);
    root->left = createNode(2);
    root->right = createNode(7);
    root->left->left = createNode(1);
    root->left->right = createNode(3);

    // Searching for a value in the BST.
    int val = 2;
    struct TreeNode *result = searchBST(root, val);

    if (result != NULL)
    {
        printf("Node found with value: %d\n", result->val);
    }
    else
    {
        printf("Node not found.\n");
    }

    // Freeing allocated memory (for demonstration; in a real application, you'd free the entire tree).
    free(root->left->left);
    free(root->left->right);
    free(root->left);
    free(root->right);
    free(root);

    return 0;
}
