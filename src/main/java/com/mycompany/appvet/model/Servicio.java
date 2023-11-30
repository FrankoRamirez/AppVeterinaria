package com.mycompany.appvet.model;

public class Servicio {
    private String id_servicio;
    private String descripcion;
    private double costo;
    
    public Servicio(){
    }

    public String getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(String id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
}
