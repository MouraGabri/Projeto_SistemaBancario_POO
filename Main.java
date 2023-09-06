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
                        Usuario.cadastrarUsuario();

                    } else {
                        System.out.println("Usúario já possui cadastro");
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Sistema encerrado!!");
                    break;
            }

        } while (opcao != 3);

    }
}
