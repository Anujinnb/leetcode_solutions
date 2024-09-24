// solution.h
#ifndef SOLUTION_H
#define SOLUTION_H

#include <stddef.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *middle(struct ListNode *head);
struct ListNode *reverse(struct ListNode *head);
void reorderList(struct ListNode *head);
void merge(struct ListNode *list1, struct ListNode *list2);

#endif // SOLUTION_H
