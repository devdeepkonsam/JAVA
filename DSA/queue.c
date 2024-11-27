#include <stdio.h>
#define MAX 100

int queue[MAX];
int front = -1;
int rear = -1;

int isEmpty() {
    return front == -1;
}

int isFull() {
    return rear == MAX - 1;
}

void enqueue(int value) {
    if (isFull()) {
        printf("Queue overflow. Unable to enqueue %d.\n", value);
        return;
    }
    if (isEmpty()) {
        front = 0;
    }
    queue[++rear] = value;
    printf("%d enqueued into the queue.\n", value);
}

int dequeue() {
    if (isEmpty()) {
        printf("Queue underflow. The queue is empty.\n");
        return -1;
    }
    int dequeuedValue = queue[front];
    if (front == rear) {
        front = rear = -1;
    } else {
        front++;
    }
    return dequeuedValue;
}

int peek() {
    if (isEmpty()) {
        printf("The queue is empty.\n");
        return -1;
    }
    return queue[front];
}

void display() {
    if (isEmpty()) {
        printf("The queue is empty.\n");
        return;
    }
    printf("Queue elements are:\n");
    for (int i = front; i <= rear; i++) {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

int main() {
    int value;
    while (printf("\nMenu:\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit\nEnter choice: ") &&
           scanf("%d", &value) && value != 5) {
        switch (value) {
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
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    printf("Exiting program.\n");
    return 0;
}
