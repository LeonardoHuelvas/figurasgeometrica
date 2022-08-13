/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.figurasgeometrica;

/**
 *
 * @author jhguerra
 */
public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(double base, double altura, String nombre) {
        super(base, altura, nombre);
    }

    public void setPerimetro() {
        this.perimetro = 3 * this.base;
    }
    
    
}
