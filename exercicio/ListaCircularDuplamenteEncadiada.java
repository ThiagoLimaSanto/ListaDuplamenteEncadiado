package com.mycompany.exercicio;

public class ListaCircularDuplamenteEncadiada {

    No inicio = null;
    No fim = null;

    No sentinela;

    public ListaCircularDuplamenteEncadiada() {
        sentinela = new No(0);
        sentinela.next = sentinela;
        sentinela.prev = sentinela;
    }

    public void add(int data) {
        No novoNo = new No(data);
        No atual = sentinela.next;

        while (atual != sentinela && atual.data < data) {
            atual = atual.next;
        }

        novoNo.prev = atual.prev;
        novoNo.next = atual;
        atual.prev.next = novoNo;
        atual.prev = novoNo;
    }

    public void display() {

        No current = sentinela.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != sentinela);
        System.out.println();
    }

    public void remove(No no) {
        no.prev.next = no.next;
        no.next.prev = no.prev;
    }

    public void removePrimos() {
        No atual = sentinela.next;
        while (atual != sentinela) {
            if (ePrimo(atual.data)) {
                No remove = atual;
                atual = atual.next;
                remove(remove);
            } else {
                atual = atual.next;
            }
        }
    }

    public boolean ePrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
