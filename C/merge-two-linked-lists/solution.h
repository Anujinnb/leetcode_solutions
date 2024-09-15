#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h>
#include <stdlib.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *mergeTwoLists(struct ListNode *list1, struct ListNode *list2);

#endif
