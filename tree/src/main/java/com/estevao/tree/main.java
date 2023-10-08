package com.estevao.tree;

public class main {

    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.adicionarElemento(10);
        arvore.adicionarElemento(8);
        arvore.adicionarElemento(5);
        arvore.adicionarElemento(9);
        arvore.adicionarElemento(7);
        arvore.adicionarElemento(18);
        arvore.adicionarElemento(13);
        arvore.adicionarElemento(20);
        System.out.println("Em Ordem");
        arvore.percorrerArvoreEmOrdem(arvore.getRaiz());
        System.out.println();

        arvore.remover(20);
        System.out.println();
        System.out.println("Em Ordem");
        arvore.percorrerArvoreEmOrdem(arvore.getRaiz());
        System.out.println();

        arvore.remover(5);
        System.out.println();
        System.out.println("Em Ordem");
        arvore.percorrerArvoreEmOrdem(arvore.getRaiz());
        System.out.println();


//        System.out.println("Pré Ordem");
//        arvore.percorrerArvorePreOrdem(arvore.getRaiz());
//        System.out.println();
//        System.out.println();
//        System.out.println("Pós Ordem");
//        arvore.percorrerArvorePosOrdem(arvore.getRaiz());


    }
}