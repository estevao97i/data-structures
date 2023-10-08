package com.estevao.tree;

public class main {

    public static void main(String[] args) {
        Arvore<Integer> novaArvore = new Arvore<>();
        novaArvore.adicionarElemento(12);
        novaArvore.adicionarElemento(5);
        novaArvore.adicionarElemento(7);
        novaArvore.adicionarElemento(9);
        novaArvore.adicionarElemento(22);
        novaArvore.adicionarElemento(4);
        novaArvore.adicionarElemento(99);
        novaArvore.adicionarElemento(1);
        System.out.println("Em Ordem");
        novaArvore.percorrerArvoreEmOrdem(novaArvore.getRaiz());
        System.out.println();
        System.out.println();
        System.out.println("Pré Ordem");
        novaArvore.percorrerArvorePreOrdem(novaArvore.getRaiz());
        System.out.println();
        System.out.println();
        System.out.println("Pós Ordem");
        novaArvore.percorrerArvorePosOrdem(novaArvore.getRaiz());
    }
}