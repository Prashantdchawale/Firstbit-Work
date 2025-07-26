#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct book {
    int bookid;
    char bookname[40];
    char aname[40];
    float price;
    float rating;
} book;

book storebook();
void removeBook(book*, int*);
void searchBook(book*, int);
void showBooksByAuthor(book*, int);
void updateBook(book*, int);
void sortBooks(book*, int);
void displaybook(book*, int);

int main() {
    int choice = 0, repeat;
    int count = 3;
    int capacity = 10; 

    book *b1 = (book *)malloc(capacity * sizeof(book)); 

    b1[0] = (book){1001, "Wings of Fire", "APJ", 299.0, 4.8};
    b1[1] = (book){1002, "Shyamchi Aai", "Sane GuruJi", 399.5, 4.5};
    b1[2] = (book){1003, "Raja ShivChhatrapati", "Babasaheb Purandare", 499.0, 5.0};

    printf("\n\t\tBOOK MANAGEMENT SYSTEM\n");

    do {
        printf("\n1. Add Book\n2. Remove Book\n3. Search Book\n4. Show Books By Author\n5. Show Book by Category\n6. Update Book\n7. Sort Books\n8. Display All Books\n9. Exit\n\n");
        printf("Choose Menu Option: ");
        scanf("%d", &choice);

        if (choice == 1) {
            if (count >= capacity)
			{
                capacity = capacity + 10;
                book *temp = (book *)realloc(b1, capacity * sizeof(book)); 
                if (temp == NULL) 
				{
                    printf("Memory allocation fail here \n");
                    free(b1);
                    exit(1);
                }
                b1 = temp;
                printf("New capacity = %d\n", capacity);
            }

            printf("Enter Book Details:\n");
            b1[count] = storebook();
            count++;
        }

        else if (choice == 2) {
            if (count == 0)
                printf("\nNo books available to remove.\n");
            else
                removeBook(b1, &count);
        }

        else if (choice == 3) {
            if (count == 0)
                printf("\nNo books available to search.\n");
            else
                searchBook(b1, count);
        }

        else if (choice == 4) {
            if (count == 0)
                printf("\nNo books available.\n");
            else
                showBooksByAuthor(b1, count);
        }

        else if (choice == 6) {
            if (count == 0)
                printf("\nNo books available to update.\n");
            else
                updateBook(b1, count);
        }

        else if (choice == 7) {
            if (count == 0)
                printf("\nNo books available to sort.\n");
            else
                sortBooks(b1, count);
        }

        else if (choice == 8) {
            if (count == 0)
                printf("\nNo books to display.\n");
            else {
                printf("\nDisplaying All Books:\n");
                displaybook(b1, count);
            }
        }

        else if (choice == 9) {
            printf("\nAre You Sure You Want to Exit?\n");
            break;
        }

        else {
            printf("Invalid choice. Please try again.\n");
        }

        printf("\nDo you want to continue? (Press 1 for Yes / Any other key to Exit): ");
        scanf("%d", &repeat);

    } while (repeat == 1);

    printf("THANK YOU FOR VISITING!\n");
    free(b1); // ? free the memory

    return 0;
}



book storebook() {
    book b1;
    printf("\nBook ID     : ");
    scanf("%d", &b1.bookid);
    getchar();
    printf("Book Name   : ");
    gets(b1.bookname);
    printf("Author Name : ");
    gets(b1.aname);
    printf("Price       : ");
    scanf("%f", &b1.price);
    do {
        printf("Rating      : ");
        scanf("%f", &b1.rating);
        if (b1.rating < 0 || b1.rating > 5)
            printf("Invalid! Please enter rating between 0 to 5 only.\n");
    } while (b1.rating < 0 || b1.rating > 5);
    return b1;
}

void removeBook(book *ptr, int *size) {
    int id, found = 0;
    printf("\nEnter Book ID to remove: ");
    scanf("%d", &id);
    for (int i = 0; i < *size; i++) {
        if (ptr[i].bookid == id) {
            found = 1;
            for (int j = i; j < *size - 1; j++) {
                ptr[j] = ptr[j + 1];
            }
            (*size)--;
            printf("Book ID %d removed successfully.\n", id);
            break;
        }
    }
    if (!found)
        printf("Book with ID %d not found.\n", id);
}

void searchBook(book *ptr, int size) {
    int choice, found = 0;
    printf("\nSearch Book by:\n1. ID\n2. Name\nEnter choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        int id;
        printf("Enter Book ID to search: ");
        scanf("%d", &id);

        for (int i = 0; i < size; i++) {
            if (ptr[i].bookid == id) {
                printf("\nBook Found:\n");
                displaybook(&ptr[i], 1);
                found = 1;
                break;
            }
        }
    } else if (choice == 2) {
        char name[40];
        printf("Enter Book Name to search: ");
        scanf("%s", name);
        for (int i = 0; i < size; i++) {
            if (strstr(ptr[i].bookname, name) != NULL) {
                if (!found)
                    printf("\nMatching Books Found:\n");
                displaybook(&ptr[i], 1);
                found = 1;
            }
        }
    } else {
        printf("Invalid choice.\n");
        return;
    }

    if (!found)
        printf("\nNo book found.\n");
}

void showBooksByAuthor(book *ptr, int size) {
    char author[40];
    int found = 0;
    printf("\nEnter Author Name to search: ");
    getchar();
    gets(author);
    author[strcspn(author, "\n")] = '\0';

    for (int i = 0; i < size; i++) {
        if (strstr(ptr[i].aname, author) != NULL) {
            displaybook(&ptr[i], 1);
            found = 1;
        }
    }
    if (!found)
        printf("\nNo books found by author: %s\n", author);
}

void updateBook(book *ptr, int size) {
    int id, found = 0;
    printf("\nEnter Book ID to update: ");
    scanf("%d", &id);

    for (int i = 0; i < size; i++) {
        if (ptr[i].bookid == id) {
            found = 1;
            printf("\nCurrent details of the book:\n");
            displaybook(&ptr[i], 1);
            printf("\nEnter new details:\n");
            ptr[i] = storebook();
            printf("Book Updated Successfully.\n");
            break;
        }
    }
    if (!found)
        printf("Book ID %d not found.\n", id);
}

void sortBooks(book *ptr, int size) {
    int choice;
    book temp;
    printf("\nSort books by:\n1. Rating\n2. Price\nEnter your choice: ");
    scanf("%d", &choice);

    if (choice != 1 && choice != 2) {
        printf("Invalid sort field.\n");
        return;
    }

    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            int swap = 0;

            if (choice == 1 && ptr[i].rating < ptr[j].rating)
                swap = 1;
            else if (choice == 2 && ptr[i].price < ptr[j].price)
                swap = 1;

            if (swap) {
                temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }

    printf("Books sorted successfully in descending order!\n");
    displaybook(ptr, size);
}

void displaybook(book *ptr, int size) {
    for (int i = 0; i < size; i++) {
        printf("\nBook ID     = %d", ptr[i].bookid);
        printf("\nBook Name   = %s", ptr[i].bookname);
        printf("\nAuthor Name = %s", ptr[i].aname);
        printf("\nPrice       = $%.1f/-", ptr[i].price);
        printf("\nRating      = %.1f/5.0\n", ptr[i].rating);
    }
}