package com.example.h2test;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
  User findById(long id);
  User findByEmail(String email);
  List<User> findAll();
}
