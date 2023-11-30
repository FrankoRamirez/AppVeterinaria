package com.mycompany.appvet.model;

public class CategoriaProd {
    private String id_categoria;
    private String nombre;
    
    public CategoriaProd(){
    }

    public CategoriaProd(String id_categoria, String nombre) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
