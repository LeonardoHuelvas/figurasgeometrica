/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.figurasgeometrica;

import static java.lang.Math.PI;

/**
 *
 * @author jhguerra
 */
public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public void setArea() {
        this.area = PI * Math.pow(this.radio, 2) ;
    }

    public void setPerimetro() {
        this.perimetro = 2 * (PI * this.radio);
    }
    
    
    
    
    
    
}
