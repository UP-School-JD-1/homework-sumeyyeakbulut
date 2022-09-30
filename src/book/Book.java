package book;

public class Book {

    BookType bookType;
    Author author;
    String title;
    int page;
    int currentPage;
    boolean isHardCover;

    Book(){}

    Book(String title, int page){
        this.title = title;
        this.page = page;
    }

    public void setBookType(BookType bookType){
        this.bookType = bookType;
    }

    public BookType getBookType(){
        return bookType;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPage(int page){
        this.page = page;
    }

    public int getPage(){
        return page;
    }

    public void setCurrentPage(int currentPage){
        this.currentPage = currentPage;
    }

    public int getCurrentPage(){
        return currentPage;
    }

    public void setIsHardCover(boolean isHardCover){
        this.isHardCover = isHardCover;
    }

    public boolean getIsHardCover(){
        return isHardCover;
    }
}
