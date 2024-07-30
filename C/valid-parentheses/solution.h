#ifndef SOLUTION_H
#define SOLUTION_H

#include <stdbool.h>

typedef struct Node
{
    char data;
    struct Node *next;
} Node;

Node *newNode(char data);

bool isEmpty(Node *root);

void push(Node **root, char data);

char pop(Node **root);

char peek(Node *root);

bool isValid(char *s);

#endif // SOLUTION_H
