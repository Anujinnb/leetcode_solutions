#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Helper function to create a new ListNode
struct ListNode *createNode(int val)
{
    struct ListNode *newNode = (struct ListNode *)malloc(sizeof(struct ListNode));
    newNode->val = val;
    newNode->next = NULL;
    return newNode;
}

// Helper function to print the linked list
void printList(struct ListNode *head)
{
    while (head != NULL)
    {
        printf("%d -> ", head->val);
        head = head->next;
    }
    printf("NULL\n");
}

int main()
{
    // Creating the linked list 0 -> 1 -> 3 -> 0 -> 4 -> 5 -> 2 -> 0
    struct ListNode *head = createNode(0);
    head->next = createNode(1);
    head->next->next = createNode(3);
    head->next->next->next = createNode(0);
    head->next->next->next->next = createNode(4);
    head->next->next->next->next->next = createNode(5);
    head->next->next->next->next->next->next = createNode(2);
    head->next->next->next->next->next->next->next = createNode(0);

    printf("Original list: ");
    printList(head);

    struct ListNode *mergedHead = mergeNodes(head);

    printf("Merged list: ");
    printList(mergedHead);

    // Freeing allocated memory
    while (head != NULL)
    {
        struct ListNode *temp = head;
        head = head->next;
        free(temp);
    }

    return 0;
}
