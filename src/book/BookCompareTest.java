package book;

import java.util.function.BinaryOperator;

public class BookCompareTest {
    public static void main(String[] args) {

        Book book1 = new Book("Bülbülü Öldürmek", 356);
        Book book2 = new Book("Sol Ayağım", 189);

        BinaryOperator<Book> compare = BinaryOperator.maxBy((a, b) -> Math.max(a.getPage(), b.getPage()));
        System.out.println(compare.apply(book1, book2).getTitle());

    }
}
