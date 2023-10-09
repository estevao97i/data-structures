package com.graph;

public class main {

    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        grafo.adicionarVertice("estevao");
        grafo.adicionarVertice("sofia");
        grafo.adicionarVertice("tereza");
        grafo.adicionarVertice("gabriel");
        grafo.adicionarVertice("pedro");
        grafo.adicionarVertice("barbara");
        grafo.adicionarVertice("wilson");
        grafo.adicionarVertice("patricia");

        grafo.adicionarAresta(1.0, "estevao", "sofia");
        grafo.adicionarAresta(2.0, "sofia", "tereza");
        grafo.adicionarAresta(2.0, "tereza", "pedro");
        grafo.adicionarAresta(4.0, "pedro", "wilson");
        grafo.adicionarAresta(3.0, "patricia", "barbara");
        grafo.adicionarAresta(8.0, "gabriel", "sofia");

        grafo.buscarEmLargura();
    }
}
