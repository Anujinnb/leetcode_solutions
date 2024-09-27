// main.c

#include "solution.h"

int main()
{
    // Create a simple linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
    struct ListNode *head = createNode(1);
    head->next = createNode(2);
    head->next->next = createNode(3);
    head->next->next->next = createNode(4);
    head->next->next->next->next = createNode(5);

    printf("Original List: ");
    printList(head);

    int n = 2; // Remove the 2nd node from the end (should remove node with value 4)
    head = removeNthFromEnd(head, n);

    printf("List after removing %d-th node from the end: ", n);
    printList(head);

    // Free the allocated memory (important to prevent memory leaks)
    struct ListNode *current = head;
    while (current != NULL)
    {
        struct ListNode *next = current->next;
        free(current);
        current = next;
    }

    return 0;
}
