#include <stddef.h>
#define bool int
#define true 1
#define false 0

struct ListNode
{
    int val;
    struct ListNode *next;
};

bool isPalindrome(struct ListNode *head)
{
    struct ListNode *slow = head;
    struct ListNode *fast = head;

    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }

    struct ListNode *prev = NULL;
    struct ListNode *current = slow;
    struct ListNode *next = NULL;

    while (current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    struct ListNode *first = head;
    struct ListNode *second = prev;

    while (first != NULL && second != NULL)
    {
        if (first->val != second->val)
        {
            return false;
        }

        first = first->next;
        second = second->next;
    }

    return true;
}