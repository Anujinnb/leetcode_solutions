#include <stdio.h>    // For printf
#include <stdlib.h>   // For malloc
#include "solution.h" // Include the header file

// Helper function to create a new TreeNode
struct TreeNode *createNode(int val)
{
    struct TreeNode *newNode = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    newNode->val = val;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

int main()
{
    // Example Tree 1
    struct TreeNode *tree1 = createNode(1);
    tree1->left = createNode(2);
    tree1->right = createNode(3);

    // Example Tree 2
    struct TreeNode *tree2 = createNode(1);
    tree2->left = createNode(2);
    tree2->right = createNode(3);

    // Check if the two trees are the same
    if (isSameTree(tree1, tree2))
    {
        printf("The trees are the same.\n");
    }
    else
    {
        printf("The trees are not the same.\n");
    }

    // Free allocated memory (important to avoid memory leaks)
    free(tree1->left);
    free(tree1->right);
    free(tree1);
    free(tree2->left);
    free(tree2->right);
    free(tree2);

    return 0;
}
