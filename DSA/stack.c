#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

void push(struct Node** top,int value){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory Allocation Failed\n");
        return;
    }
    newNode->data=value;
    newNode->next=*top;
    *top = newNode;
    printf("%d is push onto the stack\n",value);
}

int isEmpty(struct Node* top){
    return top == NULL;
}

int pop(struct Node** top){
    if(isEmpty(*top)){
        printf("Stack empty");
        return -1;
    }
    struct Node* temp = *top;
    int poppedValue = temp->data;
    *top = (*top)->next;
    free(temp);
    return poppedValue;
}

int peep(struct Node* top){
    if(isEmpty(top)){
        printf("Emtpy stack");
        return -1;
    }
    return top->data;
}

void display(struct Node* top){
    if(isEmpty(top)){
        printf("Emtpy stack");
        return;
    }
    printf("Stack Element: \n");
    struct Node* temp = top;
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}


int main(){
    struct Node* stack = NULL;
    push(&stack,10);
    push(&stack,20);
    push(&stack,30);
    push(&stack,40);
    printf("%d is popped.\n",pop(&stack));
    push(&stack,10);
    display(stack);

}