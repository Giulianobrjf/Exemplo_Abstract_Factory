package org.example;

public class FabricaPesado implements FabricaAbstrata {
    @Override
    public TorneioUFC createTorneioUFC() {
        return new CategoriaPesoPesado() {
        };
    }

    @Override
    public Relatorio createRelatorio() {
        return new RelatorioPesoPesado() {
        };
    }
}