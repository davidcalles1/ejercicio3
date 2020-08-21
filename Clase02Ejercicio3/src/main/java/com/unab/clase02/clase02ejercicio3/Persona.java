/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase02ejercicio3;

/**
 *
 * @author nelson
 */
public class Persona {
    protected String Nombre,Direccion,FechaNC,Genero;
    protected int Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaNC() {
        return FechaNC;
    }

    public void setFechaNC(String FechaNC) {
        this.FechaNC = FechaNC;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + '}';
    }
    
    
    
}
