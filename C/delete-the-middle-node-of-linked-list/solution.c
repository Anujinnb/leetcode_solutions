#include <stddef.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *deleteMiddle(struct ListNode *head)
{
    if (head->next == NULL)
    {
        return NULL;
    }

    struct ListNode *slow = head;
    struct ListNode *fast = head->next;

    while (fast->next != NULL && fast->next->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }

    slow->next = slow->next->next;

    return head;
}