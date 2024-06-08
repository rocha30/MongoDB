package com.example.MongoDB;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "libros")
public class Libros {

    @Id
    private String id; 
    private String titulo; 
    private String autor;
    private int añoPublicacion; 


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String title) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String author) {
        this.autor = autor;
    }

    public int getañoPublicacion() {
        return añoPublicacion;
    }

    public void setañoPublicacion(int publicationYear) {
        this.añoPublicacion = añoPublicacion;
    }
    
}
