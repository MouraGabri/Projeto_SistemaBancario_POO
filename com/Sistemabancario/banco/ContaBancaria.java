package com.Sistemabancario.banco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.Sistemabancario.usuario.Usuario;

public class ContaBancaria {
    private Integer numeroDaConta;
    private Date dataDeAbertura;
    private Double saldoDisponivel;
    private String nomeUsuario; // Adicionando um atributo para armazenar o nome do usuário
    private Integer senhaContaBancaria;
    Random random = new Random();

    public ContaBancaria(Integer numeroDaConta, Date dataDeAbertura, Double saldoDisponivel,
            String nomeUsuario, Usuario usuario) {
        this.numeroDaConta = numeroDaConta;
        this.dataDeAbertura = dataDeAbertura;
        this.saldoDisponivel = (saldoDisponivel != null) ? saldoDisponivel : 0.0;
        this.nomeUsuario = usuario.getNome();
        this.senhaContaBancaria = random.nextInt(10000); // Gerando a senha aleatória

    }

    public void criarContaBancaria() {
        Date dataDeAbertura = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = formatarData.format(dataDeAbertura);

        System.out.println("Senha da conta bancária gerada: " + senhaContaBancaria);

        System.out.println("   === Crie sua conta bancária ===");
        // Restante do código para criar a conta bancária...
        System.out.println("Nome:" + nomeUsuario);
        System.out.println("Número da sua conta:" + senhaContaBancaria);
        System.out.println("Data de abertura:" + dataFormatada);
        System.out.println("Saldo Disponivel:" + saldoDisponivel);

    }

    public void depositarValor(Usuario usuario) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Valor do Deposito:");
        Double valorDeposito = ler.nextDouble();
        if (valorDeposito > 0) {
            saldoDisponivel += valorDeposito;
            System.out.println("   === Depósito realizado ===");
            System.out.println("Nome:" + usuario.getNome());
            System.out.println("Saldo Disponível:" + saldoDisponivel);
        } else {
            System.out.println("O valor de depósito deve ser positivo.");
        }

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

    public Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(Double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public void sacarValor(Usuario usuario) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor a ser sacado:");
        Double valorSaque = ler.nextDouble();
        // Verifica se o valor do saque é válido
        if (valorSaque <= 0) {
            System.out.println("O valor de saque deve ser positivo.");
            return;
        }

        // Verifica se há saldo suficiente para o saque
        if (saldoDisponivel < valorSaque) {
            System.out.println("Saldo insuficiente para o saque.");
            return;
        }

        // Realiza o saque
        saldoDisponivel -= valorSaque;
        System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Cpf:" + usuario.getCpf());
        System.out.println("Saldo Disponível: " + saldoDisponivel);
    }
}
