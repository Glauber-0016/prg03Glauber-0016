/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Circulo extends FormaBidimensional {
    
     private final double raio;
    

    public Circulo (double raio) 
    {
        this.raio = raio; // Inicializa o atributo raio com o valor passado no construtor.
    }
    
    // Calcula a área do círculo e imprime o resultado
    @Override
    public void obterArea () 
    {
        System.out.printf("area do circulo | %.2f%n ", Math.pow(getRaio(), 2) * Math.PI);
    }

    private double getRaio () 
    {
        return raio;
    }
    
    @Override
    public String toString () 
    {
        return " - Circulo - ";
    }
}
