package org.example;

public class Lutador {
    private Relatorio relatorio;
    private  TorneioUFC torneioUFC;


    public Lutador (FabricaAbstrata fabrica) {
        this.relatorio = fabrica.createRelatorio();
        this.torneioUFC = fabrica.createTorneioUFC();
    }
    public String emitirRelatorio() {
        return this.relatorio.emitir();
    }

    public String emitirTorneioUFC() {
        return this.torneioUFC.emitir();
    }
}
