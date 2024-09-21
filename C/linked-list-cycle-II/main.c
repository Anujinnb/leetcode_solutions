// main.c
#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper function to create a new ListNode
struct ListNode *createNode(int value)
{
    struct ListNode *newNode = (struct ListNode *)malloc(sizeof(struct ListNode));
    newNode->val = value;
    newNode->next = NULL;
    return newNode;
}

// Helper function to free the linked list
void freeList(struct ListNode *head)
{
    struct ListNode *current = head;
    struct ListNode *nextNode;
    while (current != NULL)
    {
        nextNode = current->next;
        free(current);
        current = nextNode;
    }
}

int main()
{
    // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    struct ListNode *head = createNode(1);
    head->next = createNode(2);
    head->next->next = createNode(3);
    head->next->next->next = createNode(4);
    head->next->next->next->next = createNode(5);

    // Create a cycle: 5 -> 3 (cycle starts at node 3)
    head->next->next->next->next->next = head->next->next;

    // Test detectCycle function
    struct ListNode *cycleStart = detectCycle(head);

    if (cycleStart != NULL)
    {
        printf("Cycle detected starting at node with value: %d\n", cycleStart->val);
    }
    else
    {
        printf("No cycle in the linked list.\n");
    }

    // Breaking the cycle to safely free memory
    head->next->next->next->next->next = NULL;
    freeList(head);

    return 0;
}
