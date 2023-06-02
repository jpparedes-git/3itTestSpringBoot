package com.example.h2test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long>{
  User findById(long id);
  User findByName(String name);
}
