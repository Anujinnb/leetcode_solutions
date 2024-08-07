#include <stddef.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *mergeNodes(struct ListNode *head)
{
    struct ListNode *current = head->next;

    while (current != NULL)
    {
        if (current->next->val != 0)
        {
            current->val += current->next->val;
            current->next = current->next->next;
        }
        else
        {
            current->next = current->next->next;
            current = current->next;
        }
    }

    return head->next;
}