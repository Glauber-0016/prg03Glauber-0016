/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Glauber
 */

//Classe de Controle Remoto com funcionalidades simples
public class ControleRemoto implements Controlador {
    private int volume;
    private Boolean ligado;
    
    @Override
    public void ligar (){
        this.setLigado(true);
        System.out.println("Ligado");
    }
    
    @Override
    public void desligar () {
       this.setLigado(false);
        System.out.println("Desligado");
    }
    
    @Override
    public void abrirMenu () {
        System.out.println("Menu Aberto");
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado");
    }
    
    @Override
    public void maisVolume () {
        int volume = this.getVolume();
        volume += 1;
        this.setVolume(volume);
        System.out.println("Volume aumentado " + this.getVolume());
    }
    
    @Override
    public void menosVolume () {
        int volume = this.getVolume();
        volume -= 1;
        this.setVolume(volume);
        System.out.println("Volume diminuido em " + this.getVolume());
    }
    
    @Override
    public void ligarMudo () {
       this.setVolume(0);
       System.out.println("Volume mudo...");
    }
    

    @Override
    public void desligarMudo () {
        this.setVolume(1);
        System.out.println("Mudo desligado");
    }
    
    @Override
    public void play () {
        System.out.println("Play...");
    }
    
    @Override
    public void pause () {
        System.out.println("Pausado...");
    }
    
    private int getVolume () {
        return this.volume;
    }
    
    private void setVolume (int volume) {
        this.volume = volume;
    }
    
    private Boolean getligado () {
        return this.ligado;
    }
    
    private void setLigado(Boolean ligado){
        this.ligado = ligado;
    }
}
