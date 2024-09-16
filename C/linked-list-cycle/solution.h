// solution.h
#ifndef SOLUTION_H
#define SOLUTION_H

#include <stdbool.h>

struct ListNode
{
    int val;
    struct ListNode *next;
};

bool hasCycle(struct ListNode *head);

#endif // SOLUTION_H
