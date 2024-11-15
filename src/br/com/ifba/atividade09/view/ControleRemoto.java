/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Glauber
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private Boolean ligado;
    
    @Override
    public void ligar (){
        this.setLigado(true);
    }
    
    @Override
    public void desligar () {
       this.setLigado(false);
    }
    
    @Override
    public void abrirMenu () {
        
    }
    
    @Override
    public void fecharMenu() {
        
    }
    
    @Override
    public void maisVolume () {
        
    }
    
    @Override
    public void menosVolume () {
       
    }
    
    @Override
    public void ligarMudo () {
       
    }
    

    @Override
    public void desligarMudo () {
        
    }
    
    @Override
    public void play () {
        
    }
    
    @Override
    public void pause () {
        
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
