package jae.springcrud;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/api/v1/books")
    public Book createBook (@Valid @RequestBody CreateBookRequest createBookRequest) {
        return bookService.create(createBookRequest);
    }











}
