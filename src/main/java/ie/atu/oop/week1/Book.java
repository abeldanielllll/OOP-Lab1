package ie.atu.oop.week1;

public class Book {
    private final String title;
    private final String author;
    private final int pageCount;

    public Book(String title, String author, int pageCount)

    {
        if(title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        if(author == null || author.isBlank())
        {
            throw new IllegalArgumentException("Author cannot be blank");
        }
        if(pageCount <= 0 )
        {
            throw new IllegalArgumentException(" Page count must be positive");
        }

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public int getpageCount(){
        return pageCount;
    }
}
