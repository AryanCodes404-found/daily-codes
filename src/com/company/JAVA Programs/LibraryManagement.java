package com.company;
class Library {
    String[] books;
    int no_of_books;

    Library() {
        books = new String[100];
        no_of_books = 0;
    }

    void AddBook(String book) {
        books[no_of_books] = book;
        no_of_books++;
        System.out.println(book  +"  has been added");
    }
    void availableBooks(){

        System.out.println(" available books are");
        for(String book: books){
            if(book==null){
                continue;
            }
            System.out.println("*"+book);
        }
        } void issueBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(book)) {
                System.out.println(book + " has been issued");
                books[i] = null;
                return; // Exit after issuing the book
            }
        }
        System.out.println(book + " not found or already issued");
    }
void returnBook(String book){
        books[no_of_books]=book;
    System.out.println(book+"has been returned ");
}
}

    public class LibraryManagement {
        public static void main(String[] args) {
            Library central=new Library();

            central.AddBook("harrypotter");
            central.AddBook("c++");
            central.AddBook("algorithms");
            central.availableBooks();
central.issueBook("algorithms");
central.availableBooks();
central.returnBook("algorithms");
central.availableBooks();
        }
    }

