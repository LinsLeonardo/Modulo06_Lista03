package com.letscode.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    Scanner scan = new Scanner(System.in);
    int[] todosOsNumeros = new int[5];


    public void iniciaFuncao() {
        preencheArray();
        printImpares();
        printPares();
    }

    public void preencheArray(){
        for(int i = 0; i < todosOsNumeros.length; i++){
            System.out.printf("Insira o %s º número: ", i+1);
            todosOsNumeros[i] = scan.nextInt();
        }
    }

    public void printImpares(){
        System.out.println("Números Ímpares: ");
        for(int i = 0; i < todosOsNumeros.length; i++){
            if(todosOsNumeros[i] % 2 != 0){
                System.out.println(todosOsNumeros[i]);
            }
        }
    }
    public void printPares(){
        System.out.println("Números Pares: ");
        for(int i = 0; i < todosOsNumeros.length; i++){
            if(todosOsNumeros[i] % 2 == 0){
                System.out.println(todosOsNumeros[i]);
            }
        }
    }
}
