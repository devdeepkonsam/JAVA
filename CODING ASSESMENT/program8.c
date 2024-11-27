#include <stdio.h>
#define MAX 5

int queue[MAX];
int front = -1, rear = -1;

void enqueue(int value) {
    if (rear == MAX - 1)
        printf("Queue Overflow\n");
    else {
        if (front == -1) front = 0;
        queue[++rear] = value;
        printf("%d enqueued to queue\n", value);
    }
}

void dequeue() {
    if (front == -1 || front > rear)
        printf("Queue Underflow\n");
    else
        printf("Dequeued %d\n", queue[front++]);
}

void display() {
    if (front == -1)
        printf("Queue is empty\n");
    else {
        printf("Queue: ");
        for (int i = front; i <= rear; i++)
            printf("%d ", queue[i]);
        printf("\n");
    }
}
void display2(){
    for(int i =0;i<MAX;i++){
        printf("%d\n",queue[i]);
    }
}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    dequeue();
    enqueue(45);
    display2();
    enqueue(56);
    enqueue(75);
    display();
    display2();
    dequeue();
    enqueue(78);
    enqueue(34);
    display();
    return 0;
}
