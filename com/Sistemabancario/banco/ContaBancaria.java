package com.Sistemabancario.banco;

import java.util.Date;
import java.util.Random;
import com.Sistemabancario.usuario.Usuario;

public class ContaBancaria {
    private Integer numeroDaConta;
    private Date dataDeAbertura;
    private Integer saldoDaConta;
    private Double saldoDisponivel;
    private String nomeUsuario; // Adicionando um atributo para armazenar o nome do usuário

    public ContaBancaria(Integer numeroDaConta, Date dataDeAbertura, Integer saldoDaConta, Double saldoDisponivel,
            String nomeUsuario, Usuario usuario) {
        this.numeroDaConta = numeroDaConta;
        this.dataDeAbertura = dataDeAbertura;
        this.saldoDaConta = saldoDaConta;
        this.saldoDisponivel = saldoDisponivel;
        this.nomeUsuario = usuario.getNome();
    }

    public void criarContaBancaria() {
        Random random = new Random();
        Integer senhaContaBancaria = random.nextInt(10000);
        System.out.println("=== Crie sua conta bancária ===");
        // Restante do código para criar a conta bancária...
        System.out.print("Número da sua conta:" + senhaContaBancaria);
    }

    @Override
    public String toString() {
        return "Nome do usuário associado à conta bancária: " + nomeUsuario;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Date dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public Integer getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Integer saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(Double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

}
