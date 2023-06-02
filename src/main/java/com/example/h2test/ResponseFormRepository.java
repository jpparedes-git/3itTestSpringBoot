package com.example.h2test;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseFormRepository extends CrudRepository<ResponseForm, Long>{
    User findById(long id);
    List<ResponseForm> findAll();
    List<ResponseForm> findByMusicId(long id);
}