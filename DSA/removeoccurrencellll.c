#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

void insertAtEnd(struct Node** head, int value) {
    struct Node* newNode = createNode(value);
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

void display(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node* temp = head;
    printf("List elements: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int findOccurrence(struct Node* head, int value) {
    int position = 1;
    struct Node* temp = head;
    while (temp != NULL) {
        if (temp->data == value) {
            return position;
        }
        temp = temp->next;
        position++;
    }
    return -1;
}

void removeFirstOccurrence(struct Node** head, int value) {
    if (*head == NULL) {
        printf("List is empty. Nothing to remove.\n");
        return;
    }
    struct Node* temp = *head;
    struct Node* prev = NULL;
    if (temp != NULL && temp->data == value) {
        *head = temp->next;
        free(temp);
        printf("First occurrence of %d removed from the list.\n", value);
        return;
    }
    while (temp != NULL && temp->data != value) {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("%d not found in the list.\n", value);
        return;
    }
    prev->next = temp->next;
    free(temp);
    printf("First occurrence of %d removed from the list.\n", value);
}

int main() {
    struct Node* head = NULL;
    int choice, value, position;

    while (1) {
        printf("\nMenu:\n");
        printf("1. Insert at end\n");
        printf("2. Display\n");
        printf("3. Find occurrence of an element\n");
        printf("4. Remove first occurrence of an element\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                insertAtEnd(&head, value);
                break;
            case 2:
                display(head);
                break;
            case 3:
                printf("Enter value to find: ");
                scanf("%d", &value);
                position = findOccurrence(head, value);
                if (position != -1) {
                    printf("%d found at position %d.\n", value, position);
                } else {
                    printf("%d not found in the list.\n", value);
                }
                break;
            case 4:
                printf("Enter value to remove: ");
                scanf("%d", &value);
                removeFirstOccurrence(&head, value);
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
