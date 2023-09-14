package com.Sistemabancario.banco;

import java.util.ArrayList;
import java.util.Date;

public class Banco {
    private String nomeDoBanco;
    private Date dataAberturaConta;

    public Banco(String nomeDoBanco, Date dataAberturaConta) {
        this.nomeDoBanco = nomeDoBanco;
        this.dataAberturaConta = dataAberturaConta;
    }

    public void selecionarBanco() {

        ArrayList<String> bancosDisponiveis = new ArrayList<>();

        bancosDisponiveis.add("Banco do Povo");
        bancosDisponiveis.add("Banco do Estado");
        bancosDisponiveis.add("Banco Municípal");
        bancosDisponiveis.add("Banco Governamental ");
        for (String elementos : bancosDisponiveis) {
            System.out.println("Bancos para se assosiar:" + elementos);
        }
    }

}
