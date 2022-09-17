package book;

public class ReaderTest {
    public static void main(String[] args) {
        Author author = new Author();
        Book book1 = new Book();
        Book book2 = new Book();
        Reader reader = new Reader();

        author.setName("Zülfü Livaneli");

        book1.setAuthor(author);
        book1.setTitle("Serenad");
        book1.setPage(250);

        book2.setAuthor(author);
        book2.setTitle("Kardeşimin Hikayesi");
        book2.setPage(223);

        reader.setAge(22);
        reader.setName("Sümeyye Akbulut");

        reader.read(book1);

    }
}
