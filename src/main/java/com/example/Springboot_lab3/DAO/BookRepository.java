package com.example.Springboot_lab3.DAO;


import com.example.Springboot_lab3.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {

}
