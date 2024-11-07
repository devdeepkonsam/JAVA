#include <stdio.h>

int main(){
    FILE *file;
    char content;

    file = fopen("example.txt","w");
    if(file == NULL){
        printf("Error opening file\n");
        return 1;
    }
    fprintf(file, "Hello, This is DEVDEEP SINGHA");
    fclose(file);

    file = fopen("example.txt","r");
    if(file== NULL){
        printf("Error opeing the file");
        return 1;
    }
    printf("content of the file\n");
    while((content = fgetc(file)) != EOF){
        putchar(content);
    }
    fclose(file);
    return 0;
}