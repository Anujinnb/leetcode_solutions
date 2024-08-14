// main.c

#include <stdio.h>    // For standard input/output functions
#include <stdlib.h>   // For dynamic memory allocation (malloc)
#include "solution.h" // Include the header file

int main()
{
    // Example usage (creating a small binary tree)
    struct TreeNode *root = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->val = 5;
    root->left = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->right = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->left->val = 4;
    root->right->val = 8;
    root->left->left = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->left->right = NULL;
    root->right->left = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->right->right = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->left->left->val = 11;
    root->left->left->left = NULL;
    root->left->left->right = NULL;
    root->right->left->val = 13;
    root->right->right->val = 4;
    root->right->left->left = NULL;
    root->right->left->right = NULL;
    root->right->right->left = NULL;
    root->right->right->right = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    root->right->right->right->val = 1;
    root->right->right->right->left = NULL;
    root->right->right->right->right = NULL;

    int targetSum = 22;
    bool result = hasPathSum(root, targetSum);
    printf("Has path with sum %d: %s\n", targetSum, result ? "Yes" : "No");

    // Free allocated memory
    free(root->right->right->right);
    free(root->right->right);
    free(root->right->left);
    free(root->right);
    free(root->left->left);
    free(root->left);
    free(root);

    return 0;
}
