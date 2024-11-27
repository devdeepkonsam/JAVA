#include <stdio.h>
#define MAX 10

int stack[MAX],top=-1;

void push(int value){
    if(top==MAX-1){
        printf("Stack Overflow");
        return;
    }
    top++;
    stack[top]=value;
}

void pop(){
    if(top==-1){
        printf("Stack Underflow");
        return;
    }
    printf("Popped %d\n",stack[top]);
    top--;
}

void display(){
    if(top==-1){
        printf("Stack Underflow");
        return;
    }
    printf("Stack: \n");
    for(int i = top;i>=0;i--){
        printf("%d\n",stack[i]);
    }
}

int main(){
    push(12);
    push(23);
    push(34);
    push(45);
    push(56);
    display();
    pop();
    display();
    push(78);
    display();
}