package com.example.MemoryDatabaseCRUD.user.service;

import com.example.MemoryDatabaseCRUD.user.db.UserRepository;
import com.example.MemoryDatabaseCRUD.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service //서비스의 로직이 작동하는 영역임을 표시
@RequiredArgsConstructor //Bean영역의 생성자메소드로 주입
// 스프링이 자동으로 @Bean이 선언된 userRepository를 찾음 // UserRepository가 Bean으로 등록되어야 함
public class UserService {  //쿼리를  작동시킬 메소드 공간

    @Autowired //스프링의 Bean컨텍스트를 찾아서 생성
    private UserRepository userRepository;
     // private final UserRepository userRepository;
     // userRepository 선언 후 @RequiredArgsConstructor
    public UserEntity save(UserEntity user){
      return userRepository.save(user);//save 위한 repository 필요
      //Controlelr->service->Repository->DB (Repository 통해 DB에 데이터 입출력)
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
        //UserRepository는 SimpleDataRepository를 상속받으므로
        //Simple..의 메소드 findAll을 사용
    }

    //findBy id -> path variable 아이디를 찾아서 해당내용을 찾아서 삭제하는 메소드 생성
    //delete
    @DeleteMapping("/id/{id}")
    public void delete(Long id){
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score){
//        return null;
        return userRepository.findAllByScoreGreaterThan(score);
        //Jpa사용시 Sql에서 따로 query가 아닌 query method를 사용
        //findAllBy + (Where절)GreaterThan...
    }

//    public List<UserEntity> filterScore(int min, int max){
////        return null;
//        return userRepository.score(min, max);
//        //findAllByScoreGreaterThanEqualAndScoreLessThanEqual(min, max);

//    }

}
