/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Glauber
 */
public class Main {
    public static void main(String[] args) {
        
        ControleRemoto Controle = new ControleRemoto();
        
        Controle.abrirMenu();
        Controle.maisVolume();
        Controle.maisVolume();
 
        Controle.ligarMudo();
        
        Controle.desligarMudo();
        Controle.fecharMenu();
    }
}
