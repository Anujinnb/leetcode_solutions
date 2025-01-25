#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h>

// Definition for a singly-linked list node
struct ListNode
{
    int val;
    struct ListNode *next;
};

// Function prototype
struct ListNode *deleteMiddle(struct ListNode *head);

// Helper functions for testing
struct ListNode *createList(int *arr, int size);
void printList(struct ListNode *head);
void freeList(struct ListNode *head);

#endif // SOLUTION_H
