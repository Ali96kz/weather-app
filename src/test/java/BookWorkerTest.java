import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookWorkerTest {

    @Test
    public void test() {
        Book book1 = new Book("test-1", 200, false);
        Book book4 = new Book("test-4", 300, false);
        Book book5 = new Book("test-5", 400, false);

        List<Book> list = Arrays.asList(book1, book4, book5);

        BookWorker bookWorker = new BookWorker();
        List<Book> allLowerThan = bookWorker.getAllLowerThan(list, 300);

        assertEquals(book1, allLowerThan.get(0));
    }
}