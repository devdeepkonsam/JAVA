#include <stdio.h>

int search(int arr[],int k , int s){
    for(int i = 0;i<s;i++){
        if(arr[i]==k){
            return i;
        }
    }
    return -1;
}


int main(){
    int arr[] = {2,5,8,9,2,123,4,5,34,23,44,6,44,25,13412,134,33,41,12};
    int key;
    size_t size = sizeof(arr)/sizeof(arr[0]);
    printf("Enter the element to be searched: ");
    scanf("%d",&key);
    int postion = search(arr,key,size);
    if(postion!=-1){
        printf("element found at :%d",postion);
    }else {
        printf("Not found");
    }
    return 0;
}