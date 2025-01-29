package com.br.projetoveiculos.service;

import com.br.projetoveiculos.models.Veiculos;
import java.text.DecimalFormat;

public class DiferenceLogic  {
    DecimalFormat decimalFormat = new DecimalFormat("00.000");

    public boolean isEspecial(Veiculos veiculo){
        return  veiculo.isDiference();
    }

    public void printInicial(Veiculos veiculo) {
        String precoFormatado = decimalFormat.format(veiculo.getPreco());
        System.out.println("Carro modelo: " + veiculo.getModelo() +
                ", ano: " + veiculo.getAnoFabricacao() +
                ", preço: R$ " + precoFormatado +
                (isEspecial(veiculo) ? " (Especial)" : ""));
    }



}
