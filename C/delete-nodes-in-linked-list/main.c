#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Function to create a new node.
struct ListNode *createNode(int val)
{
    struct ListNode *newNode = (struct ListNode *)malloc(sizeof(struct ListNode));
    newNode->val = val;
    newNode->next = NULL;
    return newNode;
}

// Function to print the linked list.
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

int main()
{
    // Creating a linked list: 4 -> 5 -> 1 -> 9
    struct ListNode *head = createNode(4);
    head->next = createNode(5);
    head->next->next = createNode(1);
    head->next->next->next = createNode(9);

    printf("Original list: ");
    printList(head);

    // Deleting node with value 5 (the second node)
    struct ListNode *nodeToDelete = head->next;
    deleteNode(nodeToDelete);

    printf("List after deleting node with value 5: ");
    printList(head);

    // Freeing allocated memory
    while (head != NULL)
    {
        struct ListNode *temp = head;
        head = head->next;
        free(temp);
    }

    return 0;
}
