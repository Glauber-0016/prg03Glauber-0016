/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author Glauber
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;
    
    public void abrirConta (String c, String d) {
        this.setTipo(c);
        this.setStatus(true);
        this.setDono(d);
        
        if (c == "cc") {
            this.setSaldo(50);
        }
        else if (c == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Sua conta foi aberta com sucesso !!");
    }
    
    public void fecharConta () {
        if (this.saldo > 0){
            System.out.println("Ainda existe Saldo na conta!");
        }
        else if (this.saldo < 0){
            System.out.println("Sua conta esta negativada!");
        }
        else if (this.saldo == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
        }
        
    }
    
    public void depositar (float n) {
        if (this.status == true){
           this.saldo += n; 
           System.out.println("Saldo depositado!");
        }
        else if (this.status == false) {
            System.out.println("Conta não existe!");
        }
    }
    
    public void sacar (float n) {
        if (this.status == true){
            this.saldo -= n;
            System.out.println("Saldo sacado!");
        }
        else if (this.status == false){
            System.out.println("Conta não existe!");
        }
    }
    
    public void pagarMensal () {
        if (this.tipo == "cc" && this.status == true) {
            this.saldo -= 12;
            System.out.println("Mensalidade paga");
        }
        else if (this.tipo == "cp" && this.status == true){
            this.saldo -= 20;
            System.out.println("Mensalidade paga");
        }
        else if (this.status == false){
            System.out.println("Conta não existe");
        }
    }
    
    public int getNumConta () {
        return numConta;
    }
    
    public void setNumConta (int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo () {
        return tipo;
    }
    
    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono () {
        return dono;
    }
    
    public void setDono (String dono) {
        this.dono = dono;
    }
    
    public float getSaldo () {
        return saldo;
    }
    
    public void setSaldo (float saldo) {
        this.saldo = saldo;
    }
    
    public Boolean getStatus () {
        return status;
    }
    
    public void setStatus (Boolean status){
        this.status = status;
    }
}
