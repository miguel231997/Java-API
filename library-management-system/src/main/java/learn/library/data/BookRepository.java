package learn.library.data;

import learn.library.models.Book;
import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    Book findById(Long id);
    int save(Book book);
    int update(Book book);
    int deleteById(Long id);
}
