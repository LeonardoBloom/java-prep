public class Main {
    public static void main(String[] args) {

        /*
        Aggregation = Represents a "has-a" relationship between objects.
                      One object contains another object as part of its structure,
                      but the contained object/s can exist independently.
         */

        Book book1 = new Book("The Creative Gene", 423);
        Book book2 = new Book("The Two Towers", 566);
        Book book3 = new Book("The way of the Ronin", 766);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Library of Alexandria", 456, books);

        library.displayInfo();



    }
}
