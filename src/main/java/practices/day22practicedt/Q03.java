package practices.day22practicedt;

public class Q03 {



        //Type code to add books to library with its info(bookName, authorName, pageNumber), then create a method to show
        // information of the book

        String bookName;
        String authorName;
        int pageNumber;
        String bookID;

        static  int numOfBooks;

        public static void main(String[] args) {

            //Q03 book0 = new Q03();
           // book0.display();

            Q03 book1 = new Q03("Crime and Punishment","Dostoyevski",450);

            book1.display();

            Q03 book2 = new Q03("Pride","Jane Austen", 650);
            book2.display();

    }
        public Q03(String bookName, String authorName, int pageNumber){

            this.bookName = bookName;
            this.authorName = authorName;
            this.pageNumber = pageNumber;


            numOfBooks++;
            bookID = bookName.substring(0,2) + numOfBooks;

            System.out.println("Book Name: " + bookName + " Author Name: " + authorName + " Page: " + pageNumber +" Book ID: " + bookID);


    }
    public void display(){

        System.out.println("Book Name: " + bookName + " Author Name: " + authorName + " Page: " + pageNumber +" Book ID: " + bookID);

    }


}
