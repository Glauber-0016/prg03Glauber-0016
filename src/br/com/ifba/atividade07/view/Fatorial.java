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
    public int getFatorial (int n) {
        int fatorial = 1;
          
        for (int i = valor; i > 1; i--) {
            fatorial *= i;
        }
        
        return fatorial;
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
