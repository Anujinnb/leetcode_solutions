#include <stdio.h>
#include <stdlib.h>
#include "solution.h"

// Function to create a linked list from an array
struct ListNode *createList(int *arr, int size)
{
    if (size == 0)
        return NULL;

    struct ListNode *head = (struct ListNode *)malloc(sizeof(struct ListNode));
    head->val = arr[0];
    head->next = NULL;

    struct ListNode *current = head;
    for (int i = 1; i < size; i++)
    {
        struct ListNode *newNode = (struct ListNode *)malloc(sizeof(struct ListNode));
        newNode->val = arr[i];
        newNode->next = NULL;
        current->next = newNode;
        current = newNode;
    }
    return head;
}

// Function to print the linked list
void printList(struct ListNode *head)
{
    struct ListNode *current = head;
    while (current)
    {
        printf("%d -> ", current->val);
        current = current->next;
    }
    printf("NULL\n");
}

// Function to free allocated memory for the linked list
void freeList(struct ListNode *head)
{
    struct ListNode *current = head;
    while (current)
    {
        struct ListNode *temp = current;
        current = current->next;
        free(temp);
    }
}

// Main function to test deleteMiddle
int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    struct ListNode *head = createList(arr, size);

    printf("Original List: ");
    printList(head);

    head = deleteMiddle(head);

    printf("After Deleting Middle: ");
    printList(head);

    freeList(head);
    return 0;
}
