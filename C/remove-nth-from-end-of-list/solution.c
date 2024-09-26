#include <stddef.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *removeNthFromEnd(struct ListNode *head, int n)
{
    struct ListNode *dummy = (struct ListNode *)malloc(sizeof(struct ListNode));
    dummy->next = head;
    struct ListNode *prev = dummy;
    struct ListNode *current = head;

    for (int i = 0; i < n; i++)
    {
        current = current->next;
    }

    while (current != NULL)
    {
        prev = prev->next;
        current = current->next;
    }

    prev->next = prev->next->next;

    return dummy->next;
}