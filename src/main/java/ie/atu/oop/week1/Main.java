package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args)
    {
        try {
            Book myBook = new Book(title"Dune", author"Frank", pagecount 412);
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}






