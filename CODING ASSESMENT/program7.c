#include <stdio.h>
#define MAX 10

int stack[MAX],top=-1;

void push(int data){
    if(top==MAX-1){
        printf("Stack Overflow");
    }else{
        top++;
        stack[top] = data;
    }
}

int pop(){
    if(top==-1){
        printf("Stack underflow");
    }else{
        printf(stack[top]);
        return stack[top--];
    }
}

void display(){
    if (top==-1){
        printf("Stack underflow");
    }else{
        printf("Stack: \n");
        for(int i = top;i>=0;i--){
            printf("%d\n",stack[i]);
        }
    }
    
}

int main(){
    push(30);
    push(20);
    push(10);
    push(0);
    display();
    pop();
    display();
    return 0;
}
