/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.figurasgeometrica;

/**
 *
 * @author jhguerra
 */
public class Triangulo extends Figura{
    
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setArea() {
        this.area = (this.base * this.altura) / 2;
    }
    
    
    
    
    
    
    
}
