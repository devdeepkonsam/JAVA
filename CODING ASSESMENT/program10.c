#include <stdio.h>

int binarySearch(int arr[], int key, int size) {
    int start=0,end=size;
    int mid = 0;
    while(start<=end) {
        mid = (start+end)/2;
        if(arr[mid]==key){
            return mid;
        } else if(arr[mid]>key) {
            end = mid-1;
        } else {
            start = mid+1;
        }
    }
}

int main() {
    int arr[] = {1,3,5,7,9,12,15,19,21,27,31,36,39,43,49};
    int key;
    int size = sizeof(arr)/sizeof(arr[0]);
    printf("Enter the element to be searched: \n");
    scanf("%d",&key);
    int position = binarySearch(arr,key,size);
    printf("Found at %d index",position);
    return 0;
}