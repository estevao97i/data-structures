package com.estevao.tree;

public class Elemento<T> {

    private T valor;
    private Elemento<T> esquerda;
    private Elemento<T> direita;

    public Elemento(T novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Elemento<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<T> novoEsquerda) {
        this.esquerda = novoEsquerda;
    }

    public Elemento<T> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<T> novoDireita) {
        this.direita = novoDireita;
    }
}
