package com.Sistemabancario.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner ler = new Scanner(System.in);
    private String nomeDoBanco;

    public Banco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public void selecionarBanco() {
        boolean bancoEncontrado = false;

        ArrayList<String> bancosDisponiveis = new ArrayList<>();
        System.out.println("   ===Bancos Disponíveis===\n");
        bancosDisponiveis.add("Banco do Povo");
        bancosDisponiveis.add("Banco do Estado");
        bancosDisponiveis.add("Banco Municípal");
        bancosDisponiveis.add("Banco Governamental ");
        for (String elementos : bancosDisponiveis) {
            System.out.println(elementos);

        }
        System.out.println("_____________________________________________");

        System.out.println();
        System.out.println("   ===Escolha um banco de sua escolha===");
        System.out.print("Nome do banco:");
        String nomeDoBancoEscolhido = ler.nextLine();
        for (String banco : bancosDisponiveis) {
            if (banco.equals(nomeDoBancoEscolhido)) {
                bancoEncontrado = true;
                break;

            }

        }
        if (bancoEncontrado) {
            System.out.println("   Verificando......");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Você escolheu:" + nomeDoBancoEscolhido);
        } else {
            System.out.println("Banco não encontrado");
        }

    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

}
