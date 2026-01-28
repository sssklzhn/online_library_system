package com.example.online_library_system.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
public class BookControllerTest {

    @Test
    void testGetBooks() {
        BookController controller = new BookController();
        List<String> books = controller.getBooks();
        assertEquals(3, books.size());
        assertEquals("Clean Code", books.get(0));
    }
}
