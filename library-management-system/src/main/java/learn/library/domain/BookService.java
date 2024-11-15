package learn.library.domain;

import learn.library.data.BookRepository;
import learn.library.data.JdbcTemplateBookRepository;
import learn.library.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService( BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id);
    }

    public void addBook(Book book) {
        repository.save(book);
    }

    public void updateBook(Book book) {
        repository.update(book);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }


}
