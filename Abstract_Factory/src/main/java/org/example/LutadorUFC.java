package org.example;

public class LutadorUFC implements Lutador {
    private String nome;
    private CategoriaDePeso categoria;

    public LutadorUFC(String nome, CategoriaDePeso categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public CategoriaDePeso getCategoria() {
        return categoria;
    }

    @Override
    public String lutar() {
        return nome + " está lutando na categoria " + categoria.getDescricao();
    }
}