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

// Helper function to print the linked list
void printList(struct ListNode *head)
{
    struct ListNode *current = head;
    while (current != NULL)
    {
        printf("%d -> ", current->val);
        current = current->next;
    }
    printf("NULL\n");
}

// Main function to test the reorderList function
int main()
{
    // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
    struct ListNode *head = createNode(1);
    head->next = createNode(2);
    head->next->next = createNode(3);
    head->next->next->next = createNode(4);
    head->next->next->next->next = createNode(5);

    printf("Original list:\n");
    printList(head);

    // Call reorderList
    reorderList(head);

    printf("Reordered list:\n");
    printList(head);

    // Free allocated memory
    struct ListNode *temp;
    while (head != NULL)
    {
        temp = head;
        head = head->next;
        free(temp);
    }

    return 0;
}
