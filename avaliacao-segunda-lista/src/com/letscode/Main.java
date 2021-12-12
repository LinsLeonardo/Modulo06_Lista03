package com.letscode;

import com.letscode.Exercicio01.Exercicio01;
import com.letscode.Exercicio02.Exercicio02;
import com.letscode.Exercicio03.Exercicio03;
import com.letscode.Exercicio04.Exercicio04;
import com.letscode.Exercicio05.Exercicio05;
import com.letscode.Exercicio06.Exercicio06;
import com.letscode.Exercicio07.Exercicio07;
import com.letscode.Exercicio08.Exercicio08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma questão para executar (1 a 8): ");
        int questao = scan.nextInt();

        switch (questao) {

            case 1:
                Exercicio01 exe01 = new Exercicio01();
                exe01.iniciaFuncao();
                break;
            case 2:
                Exercicio02 exe02 = new Exercicio02();
                exe02.iniciaFuncao();
                break;
            case 3:
                Exercicio03 exe03 = new Exercicio03();
                exe03.iniciaFuncao();
                break;
            case 4:
                Exercicio04 exe04 = new Exercicio04();
                exe04.iniciaFuncao();
                break;
            case 5:
                Exercicio05 exe05 = new Exercicio05();
                exe05.iniciaFuncao();
                break;
            case 6:
                Exercicio06 exe06 = new Exercicio06();
                exe06.iniciaFuncao();
                break;
            case 7:
                Exercicio07 exe07 = new Exercicio07();
                exe07.iniciaFuncao();
                break;
            case 8:
                Exercicio08 exe08 = new Exercicio08();
                exe08.iniciaFuncao();
                break;
            default:
                System.out.println("Questão inválida, escolha um número de 1 à 8!");
        }
    }
}
