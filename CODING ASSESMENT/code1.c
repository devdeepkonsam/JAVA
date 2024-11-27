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
        printf("Stack overflow");
        return;
    }
    newNode->data = value;
    newNode->next = top;
    top = newNode;
}

void pop(){
    if(top==NULL){
        printf("Stack underflow");
        return;
    }
    struct Node* temp = top;
    int data = top->data;
    top = top->next;
    free(temp);
    printf("popped : %d\n",data);
}

void display(){
    struct Node* temp = top;
    while(temp!=NULL){
        printf("%d\n",temp->data);
        temp = temp->next;
    }
    printf("\n");   
}

int main(){
    push(10);
    push(20);
    push(30);
    push(50);
    display();
    pop();
    push(40);
    display();
}