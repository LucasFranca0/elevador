package org.example;

import org.example.elevador.Elevador;

public class Main {
    public static void main(String[] args) {
        Elevador.entrar();
        System.out.println("\n");
        Elevador.sair();
        System.out.println("\n");
        Elevador.subir();
        System.out.println("\n");
        Elevador.descer();

    }
}