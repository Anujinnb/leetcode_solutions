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
    int list[100000];
    int size = 0;

    struct ListNode *current = head;

    while (current != NULL)
    {
        list[size++] = current->val;
        current = current->next;
    }

    int left = 0;
    int right = size - 1;

    while (left < right)
    {
        if (list[left] != list[right])
        {
            return false;
        }

        left++;
        right--;
    }

    return true;
}