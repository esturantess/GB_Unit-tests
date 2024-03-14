package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class BookServiceTest {

    @Test
    void bookServiceTest() {

        BookRepository bookRepositoryMock = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepositoryMock);

        when(bookService.findBookById("1")).thenReturn(new Book("1", "Title", "Author"));
        when(bookService.findAllBooks()).thenReturn(Arrays.asList(new Book("1"), new Book("2"), new Book("3")));

        assertEquals("1", bookService.findBookById("1").getId());
        verify(bookRepositoryMock, times(1)).findById("1");

        assertEquals(3, bookRepositoryMock.findAll().size());
        verify(bookRepositoryMock, times(1)).findAll();

    }

}