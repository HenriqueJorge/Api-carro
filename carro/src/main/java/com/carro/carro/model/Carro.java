package com.carro.carro.model;

public class Carro {
    
    //#region variaveis
    private Integer id;
    private String modelo;
    private Double valor;
    private boolean isStep;
    private String observacao;
    //#endregion

    //#region metodos
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isStep() {
        return isStep;
    }
    public void setStep(boolean isStep) {
        this.isStep = isStep;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //#endregion

    
}
