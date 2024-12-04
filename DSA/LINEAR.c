#include <stdio.h>

int linearsearch(int arr[],int size,int key){
    for(int i=0;i<size;i++){
        if(arr[i]==key)
            return i;
        
    }
    return -1;
}
int main(){
   int arr[]={10,20,30,40,50};
   int key=30;
   int index =linearsearch (arr ,5,key);
   if(index!=-1)
    printf("element found at index",index);
   else
    printf("element not flound")

}