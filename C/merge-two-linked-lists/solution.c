/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *mergeTwoLists(struct ListNode *list1, struct ListNode *list2)
{
    struct ListNode *dummy = (struct ListNode *)malloc(sizeof(struct ListNode));
    dummy->val = 0;
    dummy->next = NULL;

    struct ListNode *head = dummy;

    while (list1 != NULL && list2 != NULL)
    {
        if (list1->val < list2->val)
        {
            dummy->next = list1;
            list1 = list1->next;
        }
        else
        {
            dummy->next = list2;
            list2 = list2->next;
        }

        dummy = dummy->next;
    }

    if (list1 != NULL)
    {
        dummy->next = list1;
    }

    if (list2 != NULL)
    {
        dummy->next = list2;
    }

    return head->next;
}