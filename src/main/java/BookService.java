import java.util.List;

public class BookService {

    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int sumOfAllBooks() {
        int sum = bookDao.findAll().stream()
                .filter(book -> !book.isDeleted())
                .mapToInt(Book::getCost)
                .sum();

        return sum;
    }

    public Book findById(int id) {
        Book byId = bookDao.findById(id);
        byId.setCost(2000);
        return byId;
    }

    public void deleteAllLowerThan(int price){
        List<Book> books = bookDao.findAll();

        for (Book book : books) {
            if(book.getCost() < price) {
                bookDao.deleteByName(book.getName());
            }
        }
    }

    public boolean save(Book book) {
        try {
            bookDao.save(book);
            return true;
        } catch (IllegalAccessError e) {
            return false;
        }
    }
}
