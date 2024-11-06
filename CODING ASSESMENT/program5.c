#include <stdio.h>

int add(int a, int b){
    return a+b;
}

int main(){
    int x,y,sum;
    printf("Enter the two numbers to be added: ");
    scanf("%d %d",&x,&y);
    sum=add(x,y);
    printf("Sum of %d and %d is %d",x,y,sum);
    return 0;
}