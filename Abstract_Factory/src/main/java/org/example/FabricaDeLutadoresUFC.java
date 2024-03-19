package org.example;

public class FabricaDeLutadoresUFC implements FabricaDeLutadores {
    private CategoriaDePeso categoria;

    public FabricaDeLutadoresUFC(CategoriaDePeso categoria) {
        this.categoria = categoria;
    }

    @Override
    public Lutador criarLutador(String nome) {
        return new LutadorUFC(nome, categoria);
    }
}

