package br.com.library.controllers;

import br.com.library.models.Author;
import br.com.library.services.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
@Slf4j
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addAuthor(author));
    }

    @GetMapping
    public List<Author> listAll(){
        return service.getAuthors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id){
        log.info("Obtendo os dados do autor {}", id);

        Author author = service.getAuthorById(id);
        return ResponseEntity.ok(author);
    }

    @PutMapping("{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id, @RequestBody Author author){
        log.info("Atualizando filme com id {} com os dados {}", id, author);
        return ResponseEntity.ok( service.updateAuthor(id, author) );
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        log.info("Deletando filme com id {}", id);
        service.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }
}