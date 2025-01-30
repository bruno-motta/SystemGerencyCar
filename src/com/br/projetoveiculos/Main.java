package com.br.projetoveiculos;

import com.br.projetoveiculos.models.Veiculos;
import com.br.projetoveiculos.service.DiferenceLogic;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Veiculos veiculo1 = new Veiculos("Tesla", "X", 2022, 50.000);
        veiculo1.setDiference(true);

        Veiculos veiculo2 = new Veiculos("Toyota", "Sedan", 204, 90.000);
        veiculo2.setDiference(false);

        DiferenceLogic logica = new DiferenceLogic();
        logica.printInicial(veiculo1);
        logica.printInicial(veiculo2);



    }
}