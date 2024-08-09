#ifndef SOLUTION_H
#define SOLUTION_H

// Definition for singly-linked list node.
struct ListNode
{
    int val;
    struct ListNode *next;
};

// Function to delete a node in a singly-linked list.
void deleteNode(struct ListNode *node);

#endif // SOLUTION_H
