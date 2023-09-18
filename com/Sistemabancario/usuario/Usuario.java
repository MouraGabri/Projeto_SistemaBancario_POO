package com.Sistemabancario.usuario;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.Sistemabancario.classesAbstract.Cliente;

public class Usuario extends Cliente {

    private String login;
    private String senha;

    public Usuario(String nome, Integer idade, Long cpf, String login, String senha) {
        super(nome, idade, cpf);
        this.login = login;
        this.senha = senha;
    }

    public Usuario cadastrarUsuario() {
        Scanner ler = new Scanner(System.in);
        System.out.println("_____________________________________________");
        System.out.println("Seja bem-vindo!! Realize seu cadastro");
        System.out.print("Nome:");
        String nome = ler.nextLine();
        this.setNome(nome);

        try {
            System.out.print("Idade:");
            Integer idade = ler.nextInt();
            if (idade <= 0 || idade >= 100) {
                System.out.println("{===Erro: A idade deve ser um número inteiro positivo.===}");
                idade = null;
                System.out.print("Informe uma idade válida:");
                idade = ler.nextInt();
            }

        } catch (Exception e) {
            System.out.println("{===Idade é inválida===}");
            System.out.print("Informe uma idade válida:");

            ler.nextLine(); // Consumir a quebra de linha pendente
            idade = ler.nextInt();
        }
        ler.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Cpf:");
        Long cpf = ler.nextLong();

        System.out.println("_____________________________________________");
        System.out.println("Crie seu Login de acesso");
        System.out.print("Login:");
        String login = ler.next();
        System.out.print("Senha:");
        String newsenha = ler.next();

        Date dataAtual = new Date(); // criando uma nova instância da classe Date
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // criando uma nova instância da classe SimpleDateFormat e formatando para a
        // data e o horário atual

        String dataFormatada = formatoData.format(dataAtual); // formatando a data atual usando o objeto formatoData da
                                                              // classe acima com

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        Usuario newUsuario = new Usuario(nome, idade, cpf, login, newsenha);
        System.out.println("Usuário cadastrado com sucesso:\n" + newUsuario.toString() + "\n" + "Data do cadastro:"
                + dataFormatada);

        return newUsuario; // Retorna um novo usuário cadastrado
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