package com.example.MongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibrosController {
    
    @Autowired
    private LibrosServicio servicio;

    @GetMapping
    public List<Libros> getAll(){
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Libros> getById(@PathVariable String id){
        return servicio.findbyID(id);
    }

    @PostMapping
    public Libros create(@RequestBody Libros libros){
        return servicio.save(libros);
    }

    @PutMapping("/{id}")
    public Libros update(@PathVariable String id,  @RequestBody Libros libros){
        libros.setId(id);
        return servicio.save(libros);
    }

    @DeleteMapping("/{id}")

    public void delete(@PathVariable String id ){
        servicio.deletById(id);
    }
}
