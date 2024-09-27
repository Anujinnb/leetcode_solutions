// solution.h

#ifndef SOLUTION_H
#define SOLUTION_H

#include <stdio.h>
#include <stdlib.h>

// Definition of ListNode structure
struct ListNode
{
    int val;
    struct ListNode *next;
};

// Function prototype for removeNthFromEnd
struct ListNode *removeNthFromEnd(struct ListNode *head, int n);

// Helper function to create a new node
struct ListNode *createNode(int val);

// Helper function to print the list
void printList(struct ListNode *head);

#endif // SOLUTION_H
