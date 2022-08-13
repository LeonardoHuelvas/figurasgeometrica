/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.figurasgeometrica;

/**
 *
 * @author jhguerra
 */
public class Figura {
    
    protected String nombre;
    protected double area;
    protected double perimetro;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
    
    
}
