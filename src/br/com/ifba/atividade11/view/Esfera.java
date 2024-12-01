/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Esfera extends FormaTridimensional {
    private final double raio;
    
    // Inicializa o raio da esfera.
    public Esfera (double raio) 
    {
        this.raio = raio;
    }
    
    // Calcula o volume e o imprime
    @Override
    public void obterVolume () 
    { 
        System.out.printf("volume da esfera | %.2f%n", (4 * Math.PI * Math.pow(getRaio(), 3)) / 3);
    }
    
    // Calcula a área da superfície e a imprime 
    @Override
    public void obterArea () 
    {
        System.out.printf("area da esfera | %.2f%n", 4 * Math.PI * Math.pow(getRaio(), 2));
    }

    private double getRaio () 
    {
        return raio;
    }
    
    @Override
    public String toString () 
    {
        return " - Esfera -";
    }
}
