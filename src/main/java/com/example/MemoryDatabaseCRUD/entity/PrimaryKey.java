package com.example.MemoryDatabaseCRUD.entity;

public interface PrimaryKey {

    void setId(Long id);//각 데이터의 고유 키: 프라이머리 키
    Long getId();

}
