package com.letscode.Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    Scanner scan = new Scanner(System.in);
    String palavra;
    String palavraAoContrario = "";
    char[] palavraEmChar;

    public void iniciaFuncao(){
        System.out.println("Insira uma palavra para escrever ao contrário: ");
        palavra = scan.next();
        palavraEmChar = palavra.toCharArray();
        for(int i = palavraEmChar.length - 1; i >= 0; i--){
            palavraAoContrario += palavraEmChar[i];
        }
        System.out.println(palavraAoContrario);
    }
}
