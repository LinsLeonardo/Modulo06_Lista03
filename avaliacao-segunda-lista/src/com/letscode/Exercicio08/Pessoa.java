package com.letscode.Exercicio08;

public class Pessoa {
    public String nome;
    public float peso;
    public float altura;
    public float imc;

    Pessoa(String nome, float peso, float altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = (peso/(altura * altura));
    }

    public float getPeso(){
        return peso;
    }

    public float getAltura(){
        return altura;
    }

    public String getNome(){
        return nome;
    }

    public float getImc(){
        return imc;
    }
}
