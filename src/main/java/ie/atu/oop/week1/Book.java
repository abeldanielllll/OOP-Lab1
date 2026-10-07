package ie.atu.oop.week1;

public class Book {
    private final String title;
    private final String author;
    private final int pageCount;
    private BookStatus status;

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
        this.status = BookStatus.AVAILABLE;
    }

    public String getTitle(){
        return title;
    }

    public BookStatus getStatus() {
        return status;
    }
    public String getAuthor(){
        return author;
    }
    public int getpageCount(){
        return pageCount;
    }

    public void borrowBook() {
        if (status == BookStatus.ON_LOAN) {
            throw new IllegalStateException(
                    "Book is already on loan");
        }
        status = BookStatus.ON_LOAN;
    }
    public void returnbook() {
        if (status == BookStatus.AVAILABLE) {
            throw new IllegalStateException(
                    "Book is already available");
        }
        status = BookStatus.AVAILABLE;

        if (status == BookStatus.ON_LOAN) {
        status = BookStatus.AVAILABLE;

    }

}}
