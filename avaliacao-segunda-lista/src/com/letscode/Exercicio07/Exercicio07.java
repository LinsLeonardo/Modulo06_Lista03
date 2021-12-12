package com.letscode.Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    Scanner scan = new Scanner(System.in);
    Pessoa[] pessoas = new Pessoa[5];
    int indiceDoMaisNovo;
    int indiceDoMaisVelho;
    int maiorIdade;
    int menorIdade;

    float soma;
    float media;

    public void iniciaFuncao(){

        preenchePessoas();
        defineMaisNovoEMaisVelho();
        imprimirValores();
    }

    public void preenchePessoas(){
        for(int i = 0; i < pessoas.length; i++){
            System.out.println("Entre com o nome e, em seguida, a idade");
            pessoas[i] = new Pessoa(scan.next(), scan.nextInt());
        }
    }

    public void defineMaisNovoEMaisVelho(){
        for (int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() > maiorIdade){
                maiorIdade = pessoas[i].getIdade();
                indiceDoMaisVelho = i;
            }

            if(i == 0){
                menorIdade = pessoas[i].getIdade();
                indiceDoMaisNovo = i;
            }
            if(pessoas[i].getIdade() < menorIdade){
                menorIdade = pessoas[i].getIdade();
                indiceDoMaisNovo = i;
            }

            soma += pessoas[i].getIdade();
        }
        media = soma / pessoas.length;
    }

    public void imprimirValores(){
        System.out.printf("\nO mais novo é %s, e tem %d anos", pessoas[indiceDoMaisNovo].getNome(),
                pessoas[indiceDoMaisNovo].getIdade());
        System.out.printf("\nO mais velho é %s, e tem %d anos", pessoas[indiceDoMaisVelho].getNome(),
                pessoas[indiceDoMaisVelho].getIdade());
        System.out.printf("\nA média de idades é %.2f", media);
    }
}
