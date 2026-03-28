package br.com.library.services;

import br.com.library.models.Author;
import br.com.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id){
        return findAuthorById(id);
    }

    public Author updateAuthor(Long id, Author newAuthor) {
        findAuthorById(id);
        newAuthor.setId(id);
        return authorRepository.save(newAuthor);
    }

    public void deleteAuthor(Long id) {
        findAuthorById(id);
        authorRepository.deleteById(id);
    }

    private Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Autor com id " + id + " não foi encontrado.")
        );
    }
}