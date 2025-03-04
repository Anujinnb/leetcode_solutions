#include <stddef.h>
#define bool int
#define true 1
#define false 0

struct ListNode
{
    int val;
    struct ListNode *next;
};

bool isPalindrome(struct ListNode *head);