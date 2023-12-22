package com.example.MemoryDatabaseCRUD.book.service;

import com.example.MemoryDatabaseCRUD.book.entity.BookEntity;
import com.example.MemoryDatabaseCRUD.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor //생성자 메소드로 입력받겠다(lombok): 생성자 메소드 작성하지 않아도 자동생성
public class BookService {

    // @Autowired //final 없이 생성 가능 :
    private final BookRepository bookRepository;//초기화
    // @Service를 통해 등록된 bookRepository(SimpleDataRepository 상속)를 찾아서 주입

    public BookService(BookRepository bookRepository) { //스프링으로부터 생성자 주입
        this.bookRepository = bookRepository;//BookService 클래스 생성
    }

    // create, update
    public BookEntity create(BookEntity book){
        return bookRepository.save(book);
    }

    // all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    // delete



    // find one

}
