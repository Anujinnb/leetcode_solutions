#include <stdlib.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *removeNodes(struct ListNode *head)
{
    struct ListNode *stack = NULL;
    struct ListNode *current = head;

    while (current != NULL)
    {
        while (stack != NULL && stack->val < current->val)
        {
            struct ListNode *temp = stack;
            stack = stack->next;
            free(temp);
        }

        struct ListNode *newNode = malloc(sizeof(struct ListNode));
        newNode->val = current->val;
        newNode->next = stack;
        stack = newNode;

        current = current->next;
    }

    struct ListNode *newHead = NULL;
    while (stack != NULL)
    {
        current = stack;
        stack = stack->next;
        current->next = newHead;
        newHead = current;
    }

    return newHead;
}