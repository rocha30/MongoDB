package com.example.MongoDB;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrosServicio {
    @Autowired
    private RepositorioLibro repositorio;

    public List<Libros> findAll(){
        return repositorio.findAll();
    }

    public Optional<Libros> findbyID(String id ){
        return repositorio.findById(id);
    }

    public Libros save(Libros libros){
        return repositorio.save(libros);
    }


    public void deletById(String id ){
        repositorio.deleteById(id);
    }

}
