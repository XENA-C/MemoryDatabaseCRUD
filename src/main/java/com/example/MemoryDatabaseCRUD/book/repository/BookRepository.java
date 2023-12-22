package com.example.MemoryDatabaseCRUD.book.repository;

import com.example.MemoryDatabaseCRUD.book.entity.BookEntity;
import com.example.MemoryDatabaseCRUD.db.SimpleDataRepository;
import org.springframework.stereotype.Service;

@Service //bean으로 등록
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {


}
