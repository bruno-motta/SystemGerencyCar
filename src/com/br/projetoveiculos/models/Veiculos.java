package com.br.projetoveiculos.models;


public class Veiculos {
    private String marca;
    private int anoFabricacao;
    protected String modelo;
    protected double preco;
    protected boolean diference;

    public Veiculos(){

    }

    public Veiculos(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
        this.preco = preco;
    }

    public Veiculos(String marca, String modelo){
        this(marca, modelo, 0, 0.0);
    }

    public Veiculos(int ano, double preco){
        this(null, null, ano, preco);
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDiference() {
        return diference;
    }

    public void setDiference(boolean diference) {
        this.diference = diference;
    }
}
