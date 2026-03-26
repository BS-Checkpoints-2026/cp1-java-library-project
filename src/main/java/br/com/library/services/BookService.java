package br.com.library.services;

import br.com.library.models.Book;
import br.com.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book addBook(Book book){
        return repository.save(book);
    }

    public Book getBookById(Long id) {
        return findBookById(id);
    }

    public void deleteBook(Long id) {
        findBookById(id);
        repository.deleteById(id);
    }

    public Book updateBook(Long id, Book newBook) {
        findBookById(id);
        newBook.setId(id);
        return repository.save(newBook);
    }

    private Book findBookById(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "book com id " + id + " não encontrado")
        );
    }
}
