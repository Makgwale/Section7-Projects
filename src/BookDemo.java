public class BookDemo {
    public static void main(String[] args) {

        Book gameOfThrones = new Book("George Martin","Game of Thrones",
                "Fantasy",864);

         Book mathbook = new Book("James Stewart", "Calculus",
                 "Math",1392);

         Book javaBook = new Book("Joel Murach","Murach's Java Programming",
                 "Programming",800);

         gameOfThrones.printBookDetails();
         mathbook.printBookDetails();
         javaBook.printBookDetails();

//         printBookDetails(gameOfThrones);
//         printBookDetails(mathbook);
//         printBookDetails(javaBook);

    }
//    public static void printBookDetails(Book book){
//        System.out.println(book.getTitle());
//        System.out.println(" by " +book.getAuthor());
//        System.out.println(" has " + book.getNumPages() +
//                           " pages, and its genre is " + book.getGenre());
//        System.out.println();
//
//    }
}
