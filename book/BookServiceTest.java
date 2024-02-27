package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    BookService bookService;
    BookRepository bookRepository;
    @BeforeEach
    void setUp(){
        bookService = new BookService(bookRepository);
        bookRepository = mock(BookRepository.class);
    }
    @Test
    void testFindById(){
        when(bookRepository.findById("1")).thenReturn(new Book("1", "Harry Potter", "Joanne Rowling"));

        Book result = bookService.findBookById("1");

        assertThat(result.getId()).isEqualTo("1");
        assertThat(result.getAuthor()).isEqualTo("Joanne Rowling");
        assertThat(result.getTitle()).isEqualTo("Harry Potter");
    }

    @Test
    void testFindAllBooks(){
        when(bookRepository.findAll()).thenReturn(List.of(new Book("1", "Harry Potter", "Joanne Rowling")));

        List <Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("Harry Potter", result.get(0).getTitle());
        assertEquals("Joanne Rowling", result.get(0).getAuthor());
    }
}