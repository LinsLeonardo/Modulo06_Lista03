package com.letscode.Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    String[] frutas = new String[5];
    Scanner scan = new Scanner(System.in);
    public void iniciaFuncao(){
        for(int i = 0; i < frutas.length; i++){
            System.out.println("Insira o nome de uma fruta");
            frutas[i] = scan.next();
        }
        printarNomes();
    }

    public void printarNomes(){
        System.out.println("Seus itens são: ");
        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
}
