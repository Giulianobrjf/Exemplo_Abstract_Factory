package org.example;

public class PesoPesado implements CategoriaDePeso {
    @Override
    public String getDescricao() {
        return "Peso Pesado (acima de 84 kg)";
    }
}