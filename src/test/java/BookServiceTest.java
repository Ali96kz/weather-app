import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    private BookDao bookDao = mock(BookDao.class);
    private BookService bookService;

    @Captor
    private ArgumentCaptor<Book> bookArgumentCaptor;

    @Before
    public void init() {
        bookService = new BookService(bookDao);
    }

    @Test
    public void sumOfAllBook_ifOnlyNotDeletedBookPassed() {
        List<Book> books = Arrays.asList(
                new Book("a", 200, false),
                new Book("b", 300, false),
                new Book("c", 500, false)
        );
        when(bookDao.findAll()).thenReturn(books);

        int sum = bookService.sumOfAllBooks();

        assertEquals(1000, sum);
    }

    @Test
    public void sumOfAllBook_ifOnlyDeletedBookPassedToo() {
        List<Book> books = Arrays.asList(
                new Book("a", 200, true),
                new Book("b", 300, false),
                new Book("c", 500, true),
                new Book("c", 200, false),
                new Book("c", 250, false)
        );
        when(bookDao.findAll()).thenReturn(books);

        int sum = bookService.sumOfAllBooks();

        assertEquals(750, sum);
    }

    @Test
    public void save_ifNormalDataPassed() {
        Book book = new Book("test", 200, false);
        Book book1 = new Book("test1", 200, false);

        boolean saved = bookService.save(book1);

        assertTrue(saved);
        verify(bookDao, times(1)).save(book);
    }

    @Test
    public void findById() {
        Book book1 = new Book("test1", 200, false);

        bookService.save(book1);

        verify(bookDao, times(1)).save(bookArgumentCaptor.capture());
        Book savedBook = bookArgumentCaptor.getValue();

        assertEquals("test1", savedBook.getName());
        assertEquals(200, savedBook.getCost());
        assertFalse(savedBook.isDeleted());
    }

    @Test
    public void findById_calledSeveralTIme() {
        Book book1 = new Book("test-1", 200, false);
        Book book2 = new Book("test-2", 300, false);

        when(bookDao.findById(eq(1))).thenReturn(book1);
        when(bookDao.findById(eq(2))).thenReturn(book2);

        Book actualBook1 = bookService.findById(1);
        Book actualBook2 = bookService.findById(2);

        assertEquals(book1, actualBook1);
        assertEquals("test-1", actualBook1.getName());
        assertEquals(book2, actualBook2);
    }

    @Test
    public void delete() {
        Book book1 = new Book("test-1", 200, false);
        Book book2 = new Book("test-2", 200, false);
        Book book3 = new Book("test-3", 200, false);
        Book book4 = new Book("test-4", 300, false);
        Book book5 = new Book("test-5", 400, false);

        List<Book> list = Arrays.asList(book1, book2, book3, book4, book5);

        when(bookDao.findAll()).thenReturn(list);

        bookService.deleteAllLowerThan(300);

        verify(bookDao, times(1)).deleteByName("test-1");
    }


}
