#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};
struct Node* top = NULL;


void push(int value){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if(!newNode){
        printf("Stack Overflow");
        return;
    }
    newNode->data=value;
    newNode->next=top;
    top=newNode;
}

int pop(){
    if(top==NULL){
        printf("stackUnderflow");
        return -1;
    }
    struct Node* temp = top;
    int data = top->data;
    top = top->next;
    free(temp);
    return data;
}

void display() {
    struct Node* temp = top;
    printf("Stack: \n");
    while (temp != NULL) {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main(){
    push(30);
    push(1);
    push(100);
    push(321);
    pop();
    display();
}
