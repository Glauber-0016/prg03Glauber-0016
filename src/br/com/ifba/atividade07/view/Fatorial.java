/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Glauber
 */
public class Fatorial {
    private int valor;
    
    public void setValor (int n) {
       this.valor = n;
    }
    
    //Pegando o Fatorial de um Número n
    public int getFatorial () {
        for (int i = valor - 1; i > 1; i--) {
            valor *= i;
        }
        
        return valor;
    }
    
    //Colocando o calculo de fatorial em uma string
    public String getFormula () {
        StringBuilder formula = new StringBuilder();
        
        for (int i = valor; i > 1; i--) {
            formula.append(i).append(" * ");
        }
        formula.append("1");

        return formula.toString();
 
    }
}
