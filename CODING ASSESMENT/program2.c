#include <stdio.h>

int main(){
    int n,i,fac=1;
    printf("Enter the number: ");
    scanf("%d", &n);
    for(i=1;i<=n;i++){
        fac = fac*i;
    }
    printf("Factorial of %d is %d",n,fac);
    return 0;
}