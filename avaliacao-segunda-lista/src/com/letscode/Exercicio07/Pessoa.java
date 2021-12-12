package com.letscode.Exercicio07;

public class Pessoa {
    public String nome;
    public int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }
}
