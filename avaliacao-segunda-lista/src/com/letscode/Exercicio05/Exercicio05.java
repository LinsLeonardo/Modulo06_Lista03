package com.letscode.Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    Scanner scan = new Scanner(System.in);
    String[] nomes = new String[5];
    char[] letras;
    String maiorNome;

    public void iniciaFuncao(){
        preencherNomes();
        verificaMaiorNome();
    }

    public void preencherNomes(){
        for(int i = 0; i < nomes.length; i++){
            System.out.printf("Preencha o %d º convidado: ", i+1);
            nomes[i] = scan.next();
        }
    }

    public void verificaMaiorNome(){
        for (int i = 0; i < nomes.length; i++){
            if(i == 0){
                maiorNome = nomes[i];
            }
            if(nomes[i].length() > maiorNome.length()){
                maiorNome = nomes[i];
            }
        }
        System.out.printf("O maior nome presenta na lista é: %s", maiorNome);
    }
}
