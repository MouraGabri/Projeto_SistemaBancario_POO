package com.Sistemabancario.usuario;

import java.util.Scanner;

import com.Sistemabancario.classesAbstract.Cliente;

public class Usuario extends Cliente {

    private String login;
    private String senha;

    public Usuario(String nome, Integer idade, String cpf, String login, String senha) {
        super(nome, idade, cpf);
        this.login = login;
        this.senha = senha;
    }

    public static Usuario cadastrarUsuario() {
        Scanner ler = new Scanner(System.in);
        System.out.println("_____________________________________________");
        System.out.println("Seja bem-vindo!! Realize seu cadastro");
        System.out.print("Nome:");
        String nome = ler.nextLine();
        System.out.print("Idade:");
        Integer idade = ler.nextInt();

        // Consumir a quebra de linha pendente
        ler.nextLine();

        System.out.print("Cpf:");
        String cpf = ler.nextLine();
        System.out.println("_____________________________________________");
        System.out.println("Crie seu Login de acesso");
        System.out.print("Login:");
        String login = ler.next();
        System.out.print("Senha:");
        String newsenha = ler.next();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        Usuario newUsuario = new Usuario(nome, idade, cpf, login, newsenha);
        System.out.println("Usuário cadastrado com sucesso:\n" + newUsuario.toString());

        return newUsuario; // Retorna o novo usuário cadastrado
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        System.out.println("_____________________________________________");

        return "Nome:" + getNome() + "\n" + "Idade:" + getIdade() + "\n" + "Cpf:" + getCpf();
    }

    public boolean loginUsuario(String newsenha) {
        return this.senha.equals(newsenha);

    }
}
