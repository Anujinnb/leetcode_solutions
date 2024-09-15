#include <stdio.h>
#include "solution.h"

struct ListNode *createNode(int val)
{
    struct ListNode *node = (struct ListNode *)malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

void printList(struct ListNode *head)
{
    while (head != NULL)
    {
        printf("%d -> ", head->val);
        head = head->next;
    }
    printf("NULL\n");
}

int main()
{
    // Create the first sorted linked list: 1 -> 2 -> 4
    struct ListNode *list1 = createNode(1);
    list1->next = createNode(2);
    list1->next->next = createNode(4);

    // Create the second sorted linked list: 1 -> 3 -> 4
    struct ListNode *list2 = createNode(1);
    list2->next = createNode(3);
    list2->next->next = createNode(4);

    // Merge the two lists
    struct ListNode *mergedList = mergeTwoLists(list1, list2);

    // Print the merged list
    printf("Merged List: ");
    printList(mergedList);

    return 0;
}
