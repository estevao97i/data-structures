package com.estevao.tree;

public class Arvore<T extends Comparable> {

    private Elemento<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void adicionarElemento(T valor) {
        Elemento<T> elemento = new Elemento<>(valor);
        if (raiz == null) {
            this.raiz = elemento;
        } else {
            Elemento<T> atual = this.raiz;
            while (true) {
                if (elemento.getValor().compareTo(atual.getValor()) < 0) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(elemento);
                        break;
                    }
                } else if (elemento.getValor().compareTo(atual.getValor()) > 0) {
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(elemento);
                        break;
                    }
                }
            }
        }
    }

    public void percorrerArvoreEmOrdem(Elemento<T> atual) {
        if(atual != null) {
            percorrerArvoreEmOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            percorrerArvoreEmOrdem(atual.getDireita());
        }
    }

    public void percorrerArvorePreOrdem(Elemento<T> atual) {
        if(atual != null) {
            System.out.println(atual.getValor());
            percorrerArvorePreOrdem(atual.getEsquerda());
            percorrerArvorePreOrdem(atual.getDireita());
        }
    }

    public void percorrerArvorePosOrdem(Elemento<T> atual) {
        if(atual != null) {
            percorrerArvorePreOrdem(atual.getEsquerda());
            percorrerArvorePreOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

    public Elemento<T> getRaiz() {
        return raiz;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
