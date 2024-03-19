package org.example;

public class FabricaPena implements FabricaAbstrata {
    @Override
    public TorneioUFC createTorneioUFC() {
        return new CategoriaPesoPena() {
        };
    }

    @Override
    public Relatorio createRelatorio() {
        return new RelatorioPesoPena() {
        };
    }
}