#include <stdio.h>
#include <stdlib.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *swapPairs(struct ListNode *head)
{
    if (head == NULL)
    {
        return NULL;
    }

    struct ListNode *dummy = (struct ListNode *)malloc(sizeof(struct ListNode));
    dummy->val = 0;

    dummy->next = head;

    struct ListNode *prev = dummy;
    struct ListNode *first = head;

    while (first != NULL && first->next != NULL)
    {
        struct ListNode *second = first->next;

        prev->next = second;
        first->next = second->next;
        second->next = first;

        prev = first;
        first = first->next;
    }

    return dummy->next;
}