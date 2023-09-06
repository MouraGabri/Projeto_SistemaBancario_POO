package com.Sistemabancario.usuario;

import java.util.Scanner;

import com.Sistemabancario.classesAbstract.Cliente;

public class Usuario extends Cliente {

    private String login;
    private Integer senha;

    public Usuario(String nome, Integer idade, String cpf, String login, Integer senha, String gmail) {
        super(nome, idade, cpf, gmail);
        this.login = login;
        this.senha = senha;
    }

    public static Usuario cadastrarUsuario() {
        System.out.println("_____________________________________________");
        Scanner ler = new Scanner(System.in);
        System.out.println("Seja bem vindo!!, Realize seu cadastro");
        System.out.print("Nome:");
        String nome = ler.nextLine();
        System.out.print("Idade");
        Integer idade = ler.nextInt();
        System.out.print("Cpf:");
        String cpf = ler.next();
        System.out.print("Gmail");
        String gmail = ler.nextLine();
        System.out.println("_____________________________________________");
        System.out.println("Crie seu Login de acesso");
        System.out.print("Login:");
        String login = ler.next();
        System.out.print("Senha:");
        Integer senha = ler.nextInt();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return new Usuario(nome, idade, cpf, cpf, idade, cpf);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

}
