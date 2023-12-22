package com.example.MemoryDatabaseCRUD.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T, ID> extends Repository<T, ID> {

    //create, update->save에서 함께 처리
    T save(T data);
    // 특정 아이디 검색-> 기존 데이터는 업데이트, 없으면 save

    //read
    Optional<T> findById(ID id);
    //찾고자하는 아이디가 있을수도 없을수도
    //찾고자 하는 아이디가 없을 때 데이터타입 미지정--><T>

    List<T> findAll();

    //delete
    void delete(ID id);

}
