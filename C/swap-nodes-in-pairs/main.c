// main.c

#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper to create a new node
struct ListNode *createNode(int val)
{
    struct ListNode *node = (struct ListNode *)malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

// Helper to print the list
void printList(struct ListNode *head)
{
    while (head != NULL)
    {
        printf("%d", head->val);
        if (head->next != NULL)
        {
            printf(" -> ");
        }
        head = head->next;
    }
    printf("\n");
}

// Helper to free the list
void freeList(struct ListNode *head)
{
    while (head != NULL)
    {
        struct ListNode *temp = head;
        head = head->next;
        free(temp);
    }
}

int main()
{
    // Create linked list: 1 -> 2 -> 3 -> 4
    struct ListNode *n1 = createNode(1);
    struct ListNode *n2 = createNode(2);
    struct ListNode *n3 = createNode(3);
    struct ListNode *n4 = createNode(4);

    n1->next = n2;
    n2->next = n3;
    n3->next = n4;

    printf("Original list:\n");
    printList(n1);

    struct ListNode *swapped = swapPairs(n1);

    printf("Swapped list:\n");
    printList(swapped);

    freeList(swapped);
    return 0;
}
