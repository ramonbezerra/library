package br.edu.uepb.library.controller;

import org.springframework.web.bind.annotation.RestController;

import br.edu.uepb.library.domain.Book;
import br.edu.uepb.library.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

    private final BookRepository bookRepository;
    
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping(value="/books")
    public Book createOneBook(@RequestBody Book entity) {
        bookRepository.save(entity);
        
        return entity;
    }
    
    
}
