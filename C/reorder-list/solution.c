#include <stddef.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *middle(struct ListNode *head);
struct ListNode *reverse(struct ListNode *head);

void reorderList(struct ListNode *head)
{
    if (head == NULL || head->next == NULL)
    {
        return;
    }

    struct ListNode *mid = middle(head);
    struct ListNode *secondHalf = reverse(mid->next);
    mid->next = NULL;

    merge(head, secondHalf);
}

struct ListNode *middle(struct ListNode *head)
{
    struct ListNode *slow = head;
    struct ListNode *fast = head;

    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }

    return slow;
}

struct ListNode *reverse(struct ListNode *head)
{
    struct ListNode *prev = NULL;
    struct ListNode *current = head;
    struct ListNode *next = NULL;

    while (current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    return prev;
}

void merge(struct ListNode *list1, struct ListNode *list2)
{
    struct ListNode *temp1 = NULL;
    struct ListNode *temp2 = NULL;

    while (list2 != NULL)
    {
        temp1 = list1->next;
        temp2 = list2->next;

        list1->next = list2;
        list2->next = temp1;

        list1 = temp1;
        list2 = temp2;
    }
}
