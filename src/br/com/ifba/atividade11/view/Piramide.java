/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Piramide extends FormaTridimensional {
    
    private final double areaBase;
    private final double altura;
    private final double areaLateral;
  
    public Piramide (double areaBase, double altura, double areaLateral) 
    {
        //Inicializa a piramide com os valores passados no construtor
        this.areaBase = areaBase;
        this.altura = altura;
        this.areaLateral = areaLateral;
    }
    
    //Obtem o volume da piramide e o imprime
    @Override
    public void obterVolume () 
    {
        System.out.printf("volume da piramide | %.2f%n", (getAreaBase() * getAltura()) / 3);
    }

    //Obtem a area da piramide e a imprime
    @Override
    public void obterArea () 
    {
        System.out.printf("area da piramide | %.2f%n", getAreaBase() + getAreaLateral());    
    }

    public double getAreaBase () 
    {
        return areaBase;
    }

    public double getAltura () 
    {
        return altura;
    }

    private double getAreaLateral () 
    {
        return areaLateral;
    }
    
    @Override
    public String toString () 
    {
        return " - Pirade -";
    }
    
}
