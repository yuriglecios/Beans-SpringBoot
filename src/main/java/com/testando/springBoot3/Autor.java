package com.testando.springBoot3;

public class Autor implements AutorLivro {
    private String nomeAutor;

    public void exibirAutor(){
        System.out.println(nomeAutor);
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

}
