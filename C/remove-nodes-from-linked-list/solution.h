// solution.h
#ifndef SOLUTION_H
#define SOLUTION_H

// Definition for singly-linked list node
struct ListNode
{
    int val;
    struct ListNode *next;
};

// Function declaration
struct ListNode *removeNodes(struct ListNode *head);

// Utility function to create a new ListNode
struct ListNode *createNode(int val);

#endif // SOLUTION_H
