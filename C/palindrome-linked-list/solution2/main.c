#include "solution.h"
#include <stdio.h>
#include <stdlib.h>

struct ListNode *create_node(int value)
{
    struct ListNode *new_node = (struct ListNode *)malloc(sizeof(struct ListNode));
    new_node->val = value;
    new_node->next = NULL;
    return new_node;
}

void append_node(struct ListNode **head_ref, int new_value)
{
    struct ListNode *new_node = create_node(new_value);
    struct ListNode *last = *head_ref;

    if (*head_ref == NULL)
    {
        *head_ref = new_node;
        return;
    }

    while (last->next != NULL)
    {
        last = last->next;
    }

    last->next = new_node;
}

void free_list(struct ListNode *head)
{
    struct ListNode *tmp;
    while (head != NULL)
    {
        tmp = head;
        head = head->next;
        free(tmp);
    }
}

int main()
{
    struct ListNode *head = NULL;

    // Example usage:
    append_node(&head, 1);
    append_node(&head, 2);
    append_node(&head, 2);
    append_node(&head, 1);

    if (isPalindrome(head))
    {
        printf("The linked list is a palindrome.\\n");
    }
    else
    {
        printf("The linked list is not a palindrome.\\n");
    }

    free_list(head);
    return 0;
}
