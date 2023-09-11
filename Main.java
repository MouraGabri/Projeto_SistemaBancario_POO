import java.util.Scanner;

import com.Sistemabancario.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("=====Seja bem vindo ao Sistema Bancário !!=====\n");
        System.out.println(" ===Faça seu cadastro para acessar os serviços===\n");

        int opcao;
        Usuario usuarioNovoLogin = null;
        do {
            System.out.println("[1]--> Realizar Cadastro\n" + "[2]--> Logar no sistema\n"
                    + "[3]--> Sair do sistema");
            System.out.print("-->");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    if (usuarioNovoLogin == null) {
                        usuarioNovoLogin = Usuario.cadastrarUsuario();

                    } else {
                        System.out.println("Usúario já possui cadastro");
                    }

                    break;
                case 2:
                    if (usuarioNovoLogin != null) {
                        System.out.print("Senha: ");
                        ler.nextLine(); // Limpa o buffer de entrada

                        String senha = ler.nextLine();

                        if (usuarioNovoLogin.loginUsuario(senha)) {
                            System.out.println("Senha correta! Bem-vindo, " + usuarioNovoLogin.getNome()
                                    + "!");

                        } else {
                            System.out.println("Senha incorreta. Tente novamente.");
                        }
                    } else {
                        System.out.println("Você precisa realizar o cadastro primeiro.");
                    }
                    break;
                default:
                    System.out.println("Sistema encerrado!!");
                    break;
            }

        } while (opcao != 3);

    }
}
