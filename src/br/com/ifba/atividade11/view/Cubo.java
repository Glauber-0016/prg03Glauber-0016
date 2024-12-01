/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Cubo extends FormaTridimensional {
    
    private final double aresta;

    public Cubo (double aresta) 
    {
        this.aresta = aresta; // Inicializa a aresta do cubo com o valor passado no construtor
    }
    
    //Obtem o Volume do cubo e o imprime
    @Override
    public void obterVolume () 
    {
        System.out.printf("volume do cubo | %.2f%n", Math.pow(getAresta(), 3));
    }

    //Obtem a area do Cubo e a imprime
    @Override
    public void obterArea () 
    {
        System.out.printf("area do cubo | %.2f%n", 6 * Math.pow(aresta, 2));
    }

    private double getAresta () 
    {
        return aresta;
    }
    
    @Override
    public String toString() {
        return " - Cubo -";
    }
}
