package br.com.library.controllers;

import br.com.library.models.Book;
import br.com.library.services.BookService;
import jakarta.persistence.GeneratedValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
@Slf4j
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> listAll() {
        return service.getAllBooks();
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.addBook(book));
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        log.info("Obtendo dados do filme {}", id);
        return ResponseEntity.ok(service.getBookById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        log.info("Deletando filme com id {}", id);
        service.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book){
        log.info("Atualizando filme com id {} com os dados {}", id, book);
        return ResponseEntity.ok( service.updateBook(id, book) );
    }
}
