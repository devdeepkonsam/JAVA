#include <stdio.h>

int fac(int n){
    if(n==0 || n==1){
        return 1;
    }
    return n*fac(n-1);
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int factorial = fac(n);
    printf("Factorial of %d is %d",n,factorial);
}