package com.Sistemabancario.banco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.Sistemabancario.usuario.Usuario;

public class ContaBancaria {
    private Integer numeroDaConta;
    private Date dataDeAbertura;
    private Double saldoDisponivel = 0.0;
    private String nomeUsuario; // Adicionando um atributo para armazenar o nome do usuário

    public ContaBancaria(Integer numeroDaConta, Date dataDeAbertura, Double saldoDisponivel,
            String nomeUsuario, Usuario usuario) {
        this.numeroDaConta = numeroDaConta;
        this.dataDeAbertura = dataDeAbertura;
        this.saldoDisponivel = saldoDisponivel;
        this.nomeUsuario = usuario.getNome();
    }

    public void criarContaBancaria() {
        Date dataDeAbertura = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = formatarData.format(dataDeAbertura);

        Random random = new Random();
        Integer senhaContaBancaria = random.nextInt(10000); // método random para gerar número da conta
        System.out.println("   === Crie sua conta bancária ===");
        // Restante do código para criar a conta bancária...
        System.out.println("Nome:" + nomeUsuario);
        System.out.println("Número da sua conta:" + senhaContaBancaria);
        System.out.println("Data de abertura:" + dataFormatada);
        System.out.println("Saldo Disponivel:" + saldoDisponivel);

    }

    public void depositarValor(Integer senhaContaBancaria) {

        Scanner ler = new Scanner(System.in);
        boolean vericarContaBancaria = false;
        System.out.println("   ===Para depositar valor um valor===");
        System.out.println("Informe sua conta Bancária:");
        Integer numContaBancaria = ler.nextInt();
        if (numContaBancaria.equals(senhaContaBancaria)) {
            System.out.println("Senha correta");
            System.out.println("Informe um valor para depósito:");
            Double adicioarSaldo = ler.nextDouble(); // lendo o novo saldo
            saldoDisponivel += adicioarSaldo;// atribuindo o novo saldo para a variavel saldo

            System.out.println("   ===Sua conta foi atualizada===");
            System.out.println("Nome:" + nomeUsuario);
            System.out.println("Saldo Disponivel:" + saldoDisponivel);
            vericarContaBancaria = true;

        } else {
            System.out.println("Senha incorreta");
            vericarContaBancaria = false;
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

}
