// main.c
#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Utility function to print the linked list
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

// Function to add nodes to the linked list
struct ListNode *appendNode(struct ListNode *head, int val)
{
    if (head == NULL)
    {
        return createNode(val);
    }
    struct ListNode *current = head;
    while (current->next != NULL)
    {
        current = current->next;
    }
    current->next = createNode(val);
    return head;
}

int main()
{
    // Initialize the linked list {5, 2, 13, 3, 8}
    struct ListNode *head = NULL;
    head = appendNode(head, 5);
    head = appendNode(head, 2);
    head = appendNode(head, 13);
    head = appendNode(head, 3);
    head = appendNode(head, 8);

    // Print original list
    printf("Original List: ");
    printList(head);

    // Call removeNodes and print the modified list
    head = removeNodes(head);
    printf("Modified List after removing nodes: ");
    printList(head);

    // Free remaining nodes
    struct ListNode *current = head;
    while (current != NULL)
    {
        struct ListNode *temp = current;
        current = current->next;
        free(temp);
    }

    return 0;
}
