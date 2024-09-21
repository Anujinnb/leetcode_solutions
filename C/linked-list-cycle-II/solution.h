// solution.h
#ifndef SOLUTION_H
#define SOLUTION_H

struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *detectCycle(struct ListNode *head);

#endif // SOLUTION_H
