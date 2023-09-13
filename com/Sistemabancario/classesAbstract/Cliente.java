package com.Sistemabancario.classesAbstract;

public abstract class Cliente {

    private String nome;
    protected Integer idade;
    private String cpf;

    public Cliente(String nome, Integer idade, String cpf) {

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
