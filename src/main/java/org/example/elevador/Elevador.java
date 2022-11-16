package org.example.elevador;

import java.util.Scanner;

import static java.util.Locale.US;

public class Elevador {
    static Scanner scan = new Scanner(System.in).useLocale(US);
    static int andarAtual = 0;
    static int totalAndares = 5;
    static double capacidadeTotal = 12;
    static int pessoas = 10;


    public static void entrar() {
        System.out.println("Atualmente temos " + pessoas + " pessoas no elevador.");
        System.out.println("Quantas pessoas irão entrar?");
        int entrar = scan.nextInt();

        if ((pessoas + entrar) > capacidadeTotal) {
            System.out.println(" Não permitido. O elevador comporta até 12 pessoas.");
        } else {
            pessoas += entrar;
            System.out.println("Entraram mais " + entrar + " no elevador. No total, temos " + pessoas + " pessoas no elevador.");
        }
    }

    public static void sair() {
        System.out.println("Atualmente temos " + pessoas + " pessoas no elevador.");
        System.out.println("Quantas pessoas irão sair?");
        int sair = scan.nextInt();

        if (sair > pessoas || sair < 1){
            System.out.println(" Não permitido. Número de pessoas dentro do elevador é menor do que o solicitado para sair.");
        } else {
            pessoas -= sair;
            System.out.println("Saiu " + sair + " do elevador. No total, temos " + pessoas + " pessoas no elevador.");
        }
    }

    public static void subir() {
        System.out.println("Atualmente estamos no " + andarAtual + "º andar");
        System.out.println("Para qual andar deseja subir?");
        int subir = scan.nextInt();

        if (subir == andarAtual) {
            System.out.println(" Não permitido, pois o elevador já está neste andar.");
        } else if (subir < 1 || subir > totalAndares) {
            System.out.println(" Andar inválido. O elevador atende do 0 até o 5º andar.");
        } else {
            andarAtual = subir;
            System.out.println("Estamos agora no " + subir + "º andar.");
        }
    }

    public static void descer() {
        System.out.println("Atualmente estamos no " + andarAtual + "º andar");
        System.out.println("Para qual andar deseja descer?");
        int descer = scan.nextInt();

        if (descer == andarAtual) {
            System.out.println(" Não permitido, pois o elevador já está neste andar.");
        } else if (descer > andarAtual || descer < 0) {
            System.out.println(" Andar inválido. O elevador atende do 0 até o 5º andar.");
        } else {
            andarAtual = descer;
            System.out.println("Estamos agora no " + descer + "º andar.");
        }
    }
}
