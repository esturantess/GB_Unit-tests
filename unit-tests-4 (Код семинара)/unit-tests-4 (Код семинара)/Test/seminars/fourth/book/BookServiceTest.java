package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class BookServiceTest {

    BookRepository bookRepositoryMock = mock(BookRepository.class);
    BookService bookService = new BookService(bookRepositoryMock);

    @Test
    void bookServiceFindBookByIdTest() {
        when(bookService.findBookById("1")).thenReturn(new Book("1", "Title", "Author"));

        assertEquals("1", bookService.findBookById("1").getId());
        verify(bookRepositoryMock, times(1)).findById("1");

    }

    @Test
    void bookServiceFindAllBooksTest() {
        when(bookService.findAllBooks()).thenReturn(Arrays.asList(new Book("1"), new Book("2"), new Book("3")));

        assertEquals(3, bookRepositoryMock.findAll().size());
        verify(bookRepositoryMock, times(1)).findAll();

    }

}