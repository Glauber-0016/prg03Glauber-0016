/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Glauber
 */
public class Main {
    public static void main(String[] args) {
        
        Livro livro = new Livro("Assassinato na Rua Morgue", "Edgar Alan Poe", 70, 1, true, "Glauber" );
        Pessoa pessoa = new Pessoa("Glauber", 21, "Masculino");
        
        System.out.println(pessoa.getIdade());
        pessoa.fazerAniversario();
        System.out.println(pessoa.getIdade());
        
        livro.detalhes();
        
        
    }
    
}
