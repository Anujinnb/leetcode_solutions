#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper function to create a new TreeNode
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
    // Example tree:
    //       10
    //      /  \
    //     5   15
    //    / \    \
    //   3   7    18

    struct TreeNode *root = newNode(10);
    root->left = newNode(5);
    root->right = newNode(15);
    root->left->left = newNode(3);
    root->left->right = newNode(7);
    root->right->right = newNode(18);

    int low = 7, high = 15;
    int sum = rangeSumBST(root, low, high);

    printf("The sum of values between %d and %d is: %d\n", low, high, sum);

    // Free allocated memory
    free(root->left->left);
    free(root->left->right);
    free(root->left);
    free(root->right->right);
    free(root->right);
    free(root);

    return 0;
}
