package ie.atu.oop.week1;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount)

    {
        if(title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
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
