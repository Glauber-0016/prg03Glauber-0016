/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author Glauber
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        ContaBanco conta = new ContaBanco();
        
        //Criando uma conta e testando as funcionalidades
        conta.abrirConta("cc", "Glauber");
       
        System.out.println(conta.getTipo());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getStatus());
        System.out.println(conta.getDono());
        
        System.out.println("+---------------------+");
        conta.depositar(50);
        
        System.out.println(conta.getSaldo());
        
        System.out.println("+---------------------+");
        conta.sacar(50);
        
        System.out.println(conta.getSaldo());
        System.out.println("+---------------------+");
        
        conta.setStatus(false);
        System.out.println(conta.getStatus());
        
    }
}
