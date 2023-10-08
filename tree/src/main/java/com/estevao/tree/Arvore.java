package com.estevao.tree;

import javax.swing.text.Element;

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

    public boolean remover(T valor) {
        // buscar o elemento na árvore
        Elemento<T> atual = this.raiz;
        Elemento<T> paiAtual = null;
        while(atual != null) {
            if (atual.getValor().equals(valor)) {
                break;
            } else if (valor.compareTo(atual.getValor()) < 0) { // valor menor que o valor atual
                paiAtual = atual;
                atual = atual.getEsquerda();
            } else { // valor maior que o valor atual
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        // verifica se existe o elemento
        if (atual != null) {

            // elemento tem 2 filhos
            if (atual.getDireita() != null && atual.getEsquerda() != null) {

            // tem 1 filho à esquerda
            } else if (atual.getEsquerda() != null) {

                Elemento<T> substituto = atual.getEsquerda();
                Elemento<T> paiSubstituto = atual;

                // procure o elemento mais à direita do galho à esquerda
                while(substituto.getDireita() != null) {
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }

                // coloca o substituto dentro do nó trocado da árvore
                if (atual.getValor().compareTo(paiAtual.getValor()) < 0) {
                    paiAtual.setEsquerda(substituto);
                } else {
                    paiAtual.setDireita(substituto);
                }

                //remove o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) < 1) {
                    paiSubstituto.setEsquerda(null);
                } else {
                    paiSubstituto.setDireita(null);
                }


            // tem 1 filho á direita
            } else if (atual.getDireita() != null) {

                Elemento<T> substituto = atual.getDireita();
                Elemento<T> paiSubstituto = atual;

                // procure o elemento mais à esquerda do galho à direita
                while(substituto.getEsquerda() != null) {
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }

                // coloca o substituto dentro do nó trocado da árvore
                if (atual.getValor().compareTo(paiAtual.getValor()) < 0) {
                    paiAtual.setEsquerda(substituto);
                } else {
                    paiAtual.setDireita(substituto);
                }

                //remove o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) < 1) {
                    paiSubstituto.setEsquerda(null);
                } else {
                    paiSubstituto.setDireita(null);
                }


            // não tem filhos
            } else {
                if (paiAtual.getDireita() != null) {
                    paiAtual.setDireita(null);
                } else {
                    paiAtual.setEsquerda(null);
                }
            }
            return true;
        }
        return false;
    }

    public void excluirElemento(Elemento<T> valor) {
        if (this.raiz == valor) {
            this.raiz = null;
        }
        Elemento<T> atual = this.raiz;
        while(true) {
            if (valor.getValor().compareTo(atual.getValor()) < 0) {
                if (atual.getEsquerda().getValor() != valor.getValor())  {
                    atual = atual.getEsquerda();
                } else {
                    atual.setEsquerda(null);
                    break;
                }
            }
            if (valor.getValor().compareTo(atual.getValor()) > 0) {
                if (atual.getDireita().getValor() != valor.getValor())  {
                    atual = atual.getDireita();
                } else {
                    atual.setDireita(null);
                    break;
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
}
