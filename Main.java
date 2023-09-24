import java.util.Scanner;

import com.Sistemabancario.banco.Banco;
import com.Sistemabancario.banco.ContaBancaria;
import com.Sistemabancario.usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        boolean userlogado = false;
        int opcao;
        Usuario usuarioNovoLogin = null;
        Usuario newUsuario = new Usuario(null, null, null, null, null);
        ContaBancaria contaBancaria = new ContaBancaria(null, null, null, null, newUsuario);

        Scanner ler = new Scanner(System.in);
        System.out.println("=====Seja bem vindo ao Sistema Bancário !!=====\n");
        System.out.println(" ===Faça seu cadastro para acessar os serviços===\n");

        do {
            if (!userlogado) {// se o usuário não tiver login, crie nesse menu
                System.out.println("[1]--> Realizar Cadastro\n" + "[2]--> Logar no sistema\n"
                        + "[3]--> Sair do sistema");
                System.out.print("-->");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:

                        if (usuarioNovoLogin == null) {
                            usuarioNovoLogin = newUsuario.cadastrarUsuario();

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
                                userlogado = true;// Após verificar a senha, usuário está logado no sistema

                            } else {
                                System.out.println("Senha incorreta. Tente novamente.");
                            }
                        } else {
                            System.out.println("Você precisa realizar o cadastro primeiro.");
                        }
                        if (usuarioNovoLogin != null) {

                        }

                        break;
                    default:
                        System.out.println("Sistema encerrado!!");
                        break;
                }

            } else { // se tiver o osuário estiver logado, aparece esse Menu
                System.out.println("_____________________________________________");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                Banco newBanco = new Banco(null);
                System.out.println("Agora que você possui o seu cadastro\n" + "Desfrute dos nossos serviços");
                System.out.println("[1]--> Vincule-se à um banco\n" + "[2]--> Crie sua conta bancária\n"
                        + "[3]--> Realizar Deposito\n" + "[4]--> Realizar Saque");
                System.out.print("-->:");
                opcao = ler.nextInt();
                Banco contaBanco = null;
                switch (opcao) {
                    case 1:
                        if (contaBanco == null) {
                            contaBanco = newBanco.selecionarBanco();

                        }

                        break;
                    case 2:
                        contaBancaria.criarContaBancaria();
                        break;
                    case 3:
                        contaBancaria.depositarValor(newUsuario);
                        break;
                    case 4:
                        contaBancaria.sacarValor(newUsuario);
                        break;
                    default:
                        break;
                }
            }
        } while (opcao != 4);
    }
}