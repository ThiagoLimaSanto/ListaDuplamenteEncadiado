package com.mycompany.exercicio;

import java.util.Random;

public class Exercicio {

    public static void main(String[] args) {
        ListaCircularDuplamenteEncadiada lista = new ListaCircularDuplamenteEncadiada();

        int[] numero = new int[10];
        Random aleatorio = new Random();
        int max = 10;
        int min = 0;

        for (int i = 0; i < 10; i++) {
            numero[i] = aleatorio.nextInt((max - min) + 1) + min;
        }
        
        for (int num : numero) {
            lista.add(num);
        }
        
        lista.display();
        
        lista.removePrimos();
        
        lista.display();
    }
}
