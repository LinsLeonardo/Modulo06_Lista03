package com.letscode.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    Scanner scan = new Scanner(System.in);
    String palavra;
    String palavraEstilizada = "";
    char[] letrasDaPalavra;

    public void iniciaFuncao(){
        System.out.println("Digite uma palavra: ");
        palavra = scan.next();
        estilizaPalavra();

    }

    public void estilizaPalavra(){
        letrasDaPalavra = palavra.toCharArray();
        for (int i = 0; i < palavra.length(); i++){
           palavraEstilizada += i % 2 == 0 ?
                   Character.toUpperCase(letrasDaPalavra[i])
                   : Character.toLowerCase(letrasDaPalavra[i]);
        }
        System.out.printf("Sua palavra estilizada é: %s", palavraEstilizada);
    }

}
