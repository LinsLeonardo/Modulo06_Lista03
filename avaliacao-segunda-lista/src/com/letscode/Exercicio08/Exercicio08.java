package com.letscode.Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    Scanner scan = new Scanner(System.in);

    Pessoa[] pessoas = new Pessoa[5];

    public void iniciaFuncao(){

        preencherPessoas();
        verificaIMC();
    }

    public void preencherPessoas(){
        for(int i = 0; i < pessoas.length; i++){
            System.out.printf("\nPreencha os dados da %d ª pessoa\n", i+1);
            System.out.println("Ordem: Nome -> peso (kg - 60,3) -> altura (m -> 1,80)");
            pessoas[i] = new Pessoa(scan.next(), scan.nextFloat(), scan.nextFloat());
        }
    }

    public void verificaIMC(){
        for (Pessoa pessoa : pessoas){
            if(pessoa.getImc() < 18.5){
                System.out.printf("\nO usuário %s está abaixo do peso ideal, com imc de %.2f",
                        pessoa.getNome(), pessoa.getImc());
            }
            else if (pessoa.getImc() > 25){
                System.out.printf("\nO usuário %s está acima do peso ideal, com imc de %.2f",
                        pessoa.getNome(), pessoa.getImc());
            }
            else {
                System.out.printf("\nO usuário %s está dentro do peso ideal, com imc de %.2f",
                        pessoa.getNome(), pessoa.getImc());
            }
        }
    }
}
