package day22practicedt;

import java.util.Arrays;

public class Example {



        String bookName;
        String authorName;
        int pageNumber;
        String bookID;

        static int numOfBooks;

    public static void main(String[] args) {

        Example book1= new Example("Crime","David", 400);
        book1.display();

        Example book2 = new Example("Justice","Austen",250);
        book2.display();

    }
    public Example(String bookName, String authorName, int pageNumber){

        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber ;

        numOfBooks++;
        bookID = bookName.substring(0,2) + numOfBooks;




    }
    public void display (){
        System.out.println(bookName + authorName + pageNumber + bookID);
    }

}
