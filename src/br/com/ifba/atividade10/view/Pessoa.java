/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Glauber
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Aumentar a idade da pessoa
    public void fazerAniversario () {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Feliz Aniversario");
    }

    //Construtor de pessoa, para inicializar com variaveis ja preenchidas
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
