#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* left;
    struct Node* right;
};

struct Node* createNode(int value){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct Node* insert(struct Node* root, int value){
    if(root == NULL) return createNode(value);
    if(value > root->data){
        root->right = insert(root->right,value);
    } else if(value < root->data){
        root->left = insert(root->left,value);
    }
    return root;
}

void preOrder(struct Node* root){
    if (root == NULL) return;
    printf("%d ",root->data);
    preOrder(root->left);
    preOrder(root->right); 
}

void inOrder(struct Node* root){
    if (root == NULL) return;
    inOrder(root->left);
    printf("%d ",root->data);
    inOrder(root->right); 
}

void postOrder(struct Node* root){
    if (root == NULL) return;
    postOrder(root->left);
    postOrder(root->right); 
    printf("%d ",root->data);
}

int search(struct Node* root, int target){
    if(root == NULL) return 0;
    if(root->data == target){
        return 1;
    }else if(target > root->data){
        return search(root->right,target);
    } else {
        return search(root->right,target);
    }
}


int main(){
    struct Node* root = NULL;
    root = insert(root, 50);
    insert(root, 30);
    insert(root, 70);
    insert(root, 20);
    insert(root, 40);
    insert(root, 60);
    insert(root, 80);



    inOrder(root);
    printf("\n");
    preOrder(root);
    printf("\n");
    postOrder(root);
    if (search(root,110))
    {
        printf("found");
    }else {
        printf("NOt found");
    }
    
}