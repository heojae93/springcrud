package jae.springcrud;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class BookService {
    private BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book create(@Valid @RequestBody CreateBookRequest createBookRequest) {
        Book book = new Book(createBookRequest.title(), createBookRequest.author(),
                createBookRequest.isbn(), createBookRequest.price(), createBookRequest.publishedYear());
        bookRepository.save(book);
        return book;

    }


}
