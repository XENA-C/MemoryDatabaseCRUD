package com.example.MemoryDatabaseCRUD.book.controller;


import com.example.MemoryDatabaseCRUD.book.entity.BookEntity;
import com.example.MemoryDatabaseCRUD.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor //생성자를 통해 생성
public class BookApiController { //-->서비스와 연결

    private final BookService bookService;

    @PostMapping("") //생성
    public BookEntity create(
        @RequestBody BookEntity bookEntity )
    {
       return bookService.create(bookEntity);
    }

    @GetMapping("/all") //조회
       public List<BookEntity> findAll(){
            return bookService.findAll();
    }

}

