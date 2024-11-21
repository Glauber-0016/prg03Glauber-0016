/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author Glauber
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private Boolean aberto;
    private String leitor;

    public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, Boolean aberto, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }
    
    
    
    
    public void detalhes() {
        System.out.println(this.getTitulo());
        System.out.println(this.getAutor());
        System.out.println(this.getTotalPaginas());
        System.out.println(this.getPaginaAtual());
        System.out.println(this.getLeitor());
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro Aberto");
    }
    
    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro Fechado");
    }
    
    @Override
    public void folhear() {
        this.setPaginaAtual(this.getPaginaAtual() + 10);
        System.out.println("Folheado...");
    }
    
    @Override
    public void avancarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() + 1);
        System.out.println("Pagina avançada");
    }
    
    @Override
    public void voltarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() - 1);
        System.out.println("Pagina Voltada");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
    
}
