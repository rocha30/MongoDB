package com.example.MongoDB;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioLibro extends MongoRepository<Libros,String> {

    
}
