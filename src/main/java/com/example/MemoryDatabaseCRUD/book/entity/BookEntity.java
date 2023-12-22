package com.example.MemoryDatabaseCRUD.book.entity;

import com.example.MemoryDatabaseCRUD.entity.Entity;
import lombok.*;
import java.math.BigDecimal;

@Data @EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder //@Entity(name="Book") //"Book"테이블과 연결
public class BookEntity extends Entity { //상속받지 않음

   // @Id //프라이머리 키
   // @GeneratedValue(strategy = GenerationType.IDENTITY)//데이터베이스 내에서 작동
    private Long id;

    private String name;
    private String category;
    private BigDecimal amount;

}
