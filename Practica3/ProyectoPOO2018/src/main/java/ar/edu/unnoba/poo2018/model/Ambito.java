/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unnoba.poo2018.model;

public class Ambito {

    private String nombre;

    // Constructores.
    public Ambito(String nombre) {    
        this.nombre = nombre;
    }
    
    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }	
}