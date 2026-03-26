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
}
