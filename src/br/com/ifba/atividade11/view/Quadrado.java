/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Quadrado extends FormaBidimensional {
    
     private final double lado;

    public Quadrado (double lado) 
    {
        this.lado = lado; //Inicializa o Lado com o valor passado no construtor
    }
    
    //Obtem a area do quadrado e a imprime
    @Override
    public void obterArea () 
    {
        System.out.printf("area do quadrado | %.2f%n", Math.pow(getLado(), 2));
    }

    private double getLado () 
    {
        return lado;
    }
    
    @Override
    public String toString () 
    {
        return " - Quadrado -";
    }
    
}
