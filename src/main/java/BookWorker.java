import java.util.ArrayList;
import java.util.List;

public class BookWorker {

    public List<Book> getAllLowerThan(List<Book> books, int price){


        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getCost() < price) {
                result.add(book);
            }
        }

        return result;
    }
}
