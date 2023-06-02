package com.example.h2test;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long>{
  Music findById(long id);
  Music findByName(String name);
  List<Music> findAll();
}
