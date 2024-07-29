#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

typedef struct Node
{
    char data;
    struct Node *next;
} Node;

Node *newNode(char data)
{
    Node *stackNode = (Node *)malloc(sizeof(Node));
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}

bool isEmpty(Node *root)
{
    return !root;
}

void push(Node **root, char data)
{
    Node *stackNode = newNode(data);
    stackNode->next = *root;
    *root = stackNode;
}

char pop(Node **root)
{
    if (isEmpty(*root))
    {
        return '\0';
    }
    Node *temp = *root;
    *root = (*root)->next;
    char popped = temp->data;
    free(temp);
    return popped;
}

char peek(Node *root)
{
    if (isEmpty(root))
    {
        return '\0';
    }
    return root->data;
}

bool isValid(char *s)
{
    Node *stack = NULL;
    for (int i = 0; i < strlen(s); i++)
    {
        char ch = s[i];
        if (ch == '(' || ch == '[' || ch == '{')
        {
            push(&stack, ch);
        }
        else
        {
            if (isEmpty(stack))
            {
                return false;
            }
            if (peek(stack) == '(' && ch == ')')
            {
                pop(&stack);
            }
            else if (peek(stack) == '[' && ch == ']')
            {
                pop(&stack);
            }
            else if (peek(stack) == '{' && ch == '}')
            {
                pop(&stack);
            }
            else
            {
                return false;
            }
        }
    }
    return isEmpty(stack);
}