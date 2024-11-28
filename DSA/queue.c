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






#include <stdio.h>
#include <stdlib.h>

// Define the Node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to insert at the beginning
void insertAtBeginning(struct Node** head, int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = *head;
    *head = newNode;
}

// Function to insert at the end
void insertAtEnd(struct Node** head, int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;

    if (*head == NULL) {
        *head = newNode;
        return;
    }

    struct Node* temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
}

// Function to insert at a specific position
void insertAtPosition(struct Node** head, int data, int position) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;

    if (position == 1) {
        newNode->next = *head;
        *head = newNode;
        return;
    }

    struct Node* temp = *head;
    for (int i = 1; i < position - 1 && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Position out of range.\n");
        free(newNode);
        return;
    }

    newNode->next = temp->next;
    temp->next = newNode;
}

// Function to delete from the beginning
void deleteFromBeginning(struct Node** head) {
    if (*head == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = *head;
    *head = (*head)->next;
    free(temp);
}

// Function to delete from the end
void deleteFromEnd(struct Node** head) {
    if (*head == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = *head;

    if (temp->next == NULL) {
        *head = NULL;
        free(temp);
        return;
    }

    while (temp->next->next != NULL) {
        temp = temp->next;
    }

    free(temp->next);
    temp->next = NULL;
}

// Function to delete from a specific position
void deleteFromPosition(struct Node** head, int position) {
    if (*head == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = *head;

    if (position == 1) {
        *head = (*head)->next;
        free(temp);
        return;
    }

    for (int i = 1; i < position - 1 && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL || temp->next == NULL) {
        printf("Position out of range.\n");
        return;
    }

    struct Node* deleteNode = temp->next;
    temp->next = deleteNode->next;
    free(deleteNode);
}

// Function to traverse the linked list
void traverse(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to search for an element in the linked list
void search(struct Node* head, int key) {
    int position = 1;
    struct Node* temp = head;

    while (temp != NULL) {
        if (temp->data == key) {
            printf("Element %d found at position %d.\n", key, position);
            return;
        }
        temp = temp->next;
        position++;
    }
    printf("Element %d not found.\n", key);
}

// Main function to demonstrate all operations
int main() {
    struct Node* head = NULL;

    // Insert operations
    insertAtBeginning(&head, 10);
    insertAtEnd(&head, 20);
    insertAtEnd(&head, 30);
    insertAtPosition(&head, 25, 3);

    printf("Linked List after insertion:\n");
    traverse(head);

    // Search operations
    search(head, 25);
    search(head, 15);

    // Delete operations
    deleteFromBeginning(&head);
    printf("Linked List after deleting from beginning:\n");
    traverse(head);

    deleteFromEnd(&head);
    printf("Linked List after deleting from end:\n");
    traverse(head);

    deleteFromPosition(&head, 2);
    printf("Linked List after deleting from position 2:\n");
    traverse(head);

    return 0;
}



