#include <stdio.h>
#define MAX 10

int queue[MAX];
int front=-1;
int rear=-1;

int isEmpty(){
    return front == -1;
}

int isFull(){
    return (rear+1) % MAX == rear;
}

void enqueue(int value){
    if(isFull){
        printf("Queue Overflow.\n");
    }
    if(isEmpty()){
        front = 0;
    }
    rear = (rear + 1) % MAX;
    queue[rear] = value;
    printf("%d is pushed onto the queue.\n",value);
}

int dequeue(){
    if(isEmpty()){
        return -1;
    }
    int queuedValue = queue[front];
    if (front == rear) {
        front = rear = -1;
    }else {
        front = (front+1) % MAX;
    }
    return queuedValue;
}

int peek(){
    if(isEmpty()){
        printf("Empty Queue\n");
        return -1;
    }
    return queue[front];
}

void display(){
    if(isEmpty()){
        printf("Empty Queue\n");
        return;
    }
    int i = front;
    printf("Queue Elements :\n");
    while(1) {
        if(i == rear){
            break;
        }
        printf("%d ",queue[i]);
        i = (i+1)%MAX;
    }
}

int main() {
    int choice, value;
    while (1) {
        printf("\nMenu:\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                enqueue(value);
                break;
            case 2:
                value = dequeue();
                if (value != -1)
                    printf("Dequeued element: %d\n", value);
                break;
            case 3:
                value = peek();
                if (value != -1)
                    printf("Front element: %d\n", value);
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}
