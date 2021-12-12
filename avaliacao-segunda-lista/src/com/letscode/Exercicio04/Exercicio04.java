package com.letscode.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    Scanner scan = new Scanner(System.in);
    float[] todosOsNumeros = new float[5];
    float menorNumero;
    float maiorNumero;
    float media;

    public void iniciaFuncao(){
        preencheNumeros();
        comparaNumeros();
        System.out.printf("\nMaior número: %.2f", maiorNumero);
        System.out.printf("\nMenor número: %.2f", menorNumero);
        System.out.printf("\nMédia: %.2f", media);
    }

    public void preencheNumeros(){
        for(int i = 0; i < todosOsNumeros.length; i++){
            System.out.printf("Insira o %s º número: ", i+1);
            todosOsNumeros[i] = scan.nextFloat();
        }
    }

    public void comparaNumeros() {
        for (int i = 0; i < todosOsNumeros.length; i++) {
            if(i == 0){
                menorNumero = todosOsNumeros[i];
            };
            if(todosOsNumeros[i] < menorNumero){
                menorNumero = todosOsNumeros[i];
            }
            if(todosOsNumeros[i] > maiorNumero){
                maiorNumero = todosOsNumeros[i];
            }
            media += todosOsNumeros[i];
        }
        media = media/todosOsNumeros.length;
    }
}
