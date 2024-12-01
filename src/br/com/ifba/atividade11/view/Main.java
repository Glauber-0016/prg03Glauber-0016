/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Glauber
 */
public class Main {
     public static void main(String[] args) {
        // Criando o vetor de formas
        Formas[] vetorFormas = new Formas[4];
        
        // Inicializando o vetor com instâncias de classes concretas
        vetorFormas[0] = new Circulo(3.5);
        vetorFormas[1] = new Quadrado(2.2);
        vetorFormas[2] = new Esfera(5);
        vetorFormas[3] = new Cubo(1.2);
        
        // Processando cada forma no vetor
        for (Formas forma : vetorFormas) {
             
            // Cores para os diferentes tipos de forma
            String corTitulo = "\u001B[32m";    // Ciano para título
            String corResultado = "\u001B[35m"; // Verde para resultados
            String reset = "\u001B[0m";         // Reset de cor
            
            // Título da forma
            System.out.println(corTitulo + forma.toString() + reset); 
            
            // Verifica o tipo de forma
            if (forma instanceof FormaBidimensional) {
                
                System.out.print(corResultado); // Define cor para o resultado
                ((FormaBidimensional) forma).obterArea(); // Calcula área
                
            } else if (forma instanceof FormaTridimensional) {
                
                FormaTridimensional forma3D = (FormaTridimensional) forma;
                System.out.print(corResultado); // Define cor para o resultado
                forma3D.obterArea(); // Calcula área
                System.out.print(corResultado);
                forma3D.obterVolume(); // Calcula volume
            }
            
            System.out.println(reset); // Reseta cor após o processamento
        }
    }
}
