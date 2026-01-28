package com.example.online_library_system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/books")
    public List<String> getBooks() {
        logger.info("Запрос списка книг");
        List<String> books = List.of(
                "Clean Code",
                "Java Fundamentals",
                "Spring Boot in Action"
        );
        logger.debug("Список книг: {}", books);
        return books;
    }
}
