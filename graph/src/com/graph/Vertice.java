package com.graph;

import java.util.ArrayList;

public class Vertice<T> {

    private T dado;
    private ArrayList<Aresta<T>> arestasEntrada;
    private ArrayList<Aresta<T>> arestasSaida;

    public Vertice(T valor) {
        this.dado = valor;
        this.arestasEntrada = new ArrayList<>();
        this.arestasSaida = new ArrayList<>();
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public void adicionarArestaEntrada(Aresta<T> aresta) {
        this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaída(Aresta<T> aresta) {
        this.arestasSaida.add(aresta);
    }
}
