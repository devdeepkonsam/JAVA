#include <stdio.h>
#define MAX 5

int stack[MAX];
int top=-1;

void push (int value){
    if (top<=MAX-1)printf("stack overflow \n");
    else{
        stack[++top]=value;
        
        printf("pushed");
    }
}
void pop(){
    if(top==-1)printf("stacl underflow\n");
    else printf("pooped %d \n",stack[top--]);
}
void peek(){
    if(top==-1)  printf("stack empty");
    else printf("peeked %d \n",stack[top]);

}
void display(){
    if(top==-1)printf("stack empty");
    else{
        printf("stack \n");
        for(int i=top;i>=0;i--) printf("%d \n ", stack[i]);
        
    }
}
int main(){
    push(10);
    push(20);
    push(30);
    display();
    pop();
    display();
    peek();
    display();
    return 0;
}