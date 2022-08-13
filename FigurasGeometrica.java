/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.example.figurasgeometrica;

/**
 *
 * @author jhguerra
 */
public class FigurasGeometrica {

    public static void main(String[] args) {
        
        //Objeto Cuadrado
        Cuadrado cualquiera = new Cuadrado(10, "Cuadrado");
        cualquiera.setArea();
        cualquiera.setPerimetro();
        System.out.println(cualquiera.toString());
        
        //Objeto Circulo
        Circulo circulo = new Circulo(15, "Circulo");
        circulo.setArea();
        circulo.setPerimetro();
        System.out.println(circulo.toString());
        
        //Objeto Triangulo Equilatero
        TrianguloEquilatero objectTrianguloEquilatero = 
                new TrianguloEquilatero(10, 5, "Triangulo Equilatero");
        objectTrianguloEquilatero.setArea();
        objectTrianguloEquilatero.setPerimetro();
        System.out.println(objectTrianguloEquilatero.toString());
        
        //Objeto Otro triangulo
        OtroTriangulo otroTrianguloEscaleno = new OtroTriangulo(8, 5, 10, 12, "Triangulo Escaleno");
        otroTrianguloEscaleno.setArea();
        otroTrianguloEscaleno.setPerimetro();
        System.out.println(otroTrianguloEscaleno.toString());
       
        
        
    }
}
