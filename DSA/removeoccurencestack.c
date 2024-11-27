#include <stdio.h>
#define MAX 100

int stack[MAX];
int top = -1;

int isEmpty() {
    return top == -1;
}

int isFull() {
    return top == MAX - 1;
}

void push(int value) {
    if (isFull()) {
        printf("Stack Overflow!\n");
        return;
    }
    stack[++top] = value;
}

int pop() {
    if (isEmpty()) {
        printf("Stack Underflow!\n");
        return -1;
    }
    return stack[top--];
}

void removeFirstOccurrence(int element) {
    if (isEmpty()) {
        printf("Stack is empty. Nothing to remove.\n");
        return;
    }

    int temp[MAX];
    int tempTop = -1;
    int found = 0;

    while (!isEmpty()) {
        int current = pop();
        if (!found && current == element) {
            found = 1;
        } else {
            temp[++tempTop] = current;
        }
    }

    while (tempTop != -1) {
        push(temp[tempTop--]);
    }

    if (found) {
        printf("First occurrence of %d removed from the stack.\n", element);
    } else {
        printf("%d not found in the stack.\n", element);
    }
}

void display() {
    if (isEmpty()) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Stack elements: ");
    for (int i = 0; i <= top; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

int main() {
    push(10);
    push(20);
    push(30);
    push(40);
    push(30);
    push(50);

    printf("Original stack:\n");
    display();

    int elementToRemove = 30;
    printf("\nRemoving first occurrence of %d...\n", elementToRemove);
    removeFirstOccurrence(elementToRemove);

    printf("\nUpdated stack:\n");
    display();

    return 0;
}
