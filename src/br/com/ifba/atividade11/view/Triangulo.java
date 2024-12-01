/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Triangulo extends FormaBidimensional {
    
    private final double base;
    private final double altura;
    
    public Triangulo (double base, double altura) 
    {
        //Inicializa os atributos com os valores do construtor
        this.base = base;
        this.altura = altura;
    }
    
    //Obtem a area do triangulo e a imprime
    @Override
    public void obterArea () 
    {
        System.out.printf("area do triangulo | %.2f%n", getBase() * getAltura() / 2);
    }

    private double getBase () 
    {
        return base;
    }

    private double getAltura () 
    {
        return altura;
     
    }   
    
    @Override
    public String toString () 
    {
        return " - Triangulo - ";
    }
}
