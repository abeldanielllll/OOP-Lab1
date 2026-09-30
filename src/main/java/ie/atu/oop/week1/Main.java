package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args)
    {
        Book book = new Book("Dune", "Frank Herbert", 412);
        System.out.println(book.getTitle());
        System.out.println(book.getpageCount());

        try {
            Book myBook = new Book("Dune","Frank",400);
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}






