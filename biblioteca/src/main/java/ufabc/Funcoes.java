package ufabc;

import java.util.List;
import java.util.Scanner;

import entities.Emprestimo;
import entities.Historico;
import entities.Livro;
import entities.Usuario;
import jakarta.persistence.EntityManager;

public class Funcoes {
    public static boolean bool = true;
    private static String input;
    private static Scanner sc = new Scanner(System.in);

    public static void usuarioLogado(EntityManager em,long idUsuario){
        System.out.println("Escolha a opção desejada:\n[1] Buscar livro\n[2] Consultar histórico\n[3] Sair");
        System.out.print("Opção: ");
        input = sc.nextLine();  
        switch(input){
            case "1":
                System.out.println("Digite o título do livro ou o nome do autor: ");
                input = sc.nextLine();
                List<Livro> livros = Historico.buscaLivro(em, input);

                for (Livro livro : livros) {
                    String imprime = "Titulo: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() + "\nDisponibilidade: " + livro.getSituacao();
                    System.out.println(imprime+"\n");
                    }
                break;
            case "2":
                List<Emprestimo> emprestimos = Historico.getEmprestimosUsuario(em, idUsuario);

                for (Emprestimo emprestimo : emprestimos) {
                    String imprime = "Livro: " + emprestimo.getIdLivro() + "\nData de Retirada: " + emprestimo.getDataRetirada() +"\nData de Prevista: "+ emprestimo.getDevolucaoPrevista() +"\nData de Devolução: "+ emprestimo.getDevolucaoReal();
                    System.out.println(imprime+"\n");
                }

                break;
            case "3":
                System.out.println("Obrigado e volte sempre!");
                bool = false;
                break;
        }
    }

    public static void admLogado(EntityManager em){
        System.out.println("Escolha a opção desejada:\n[1] Consultar histórico\n[2] Verificar cadastro\n[3] Sair");
        System.out.print("Opção: ");
        input = sc.nextLine();  
        switch(input){
            case "1":
                System.out.print("Digite o CPF do Usuário: ");
                input = sc.nextLine();
                List<Emprestimo> emprestimos = Historico.getEmprestimosAdmin(em, input);

                for (Emprestimo emprestimo : emprestimos) {
                    String imprime = "\nUsuário: " + emprestimo.getIdUsuario() + "\nLivro: "+ emprestimo.getIdLivro()+ "\nData de Retirada: " + emprestimo.getDataRetirada() + "\nData de Prevista: "+ emprestimo.getDevolucaoPrevista() + "\nData de Devolução: "+ emprestimo.getDevolucaoReal();
                    System.out.println(imprime+"\n");
                }
                break;
            case "2":
                System.out.print("Digite o CPF do Usuário: ");
                input = sc.nextLine();
                List<Usuario> usuario = Historico.buscaUsuario(em, input);
                for (Usuario u : usuario) {
                    String imprime = "\nUsuário: " + u.getNome() + "\ne-mail: "+ u.getEmail() + "\nSituação Cadastral: "+ u.isSituacaoCadastral();
                    System.out.println(imprime+"\n");
                }
                break;
            case "3":
                System.out.println("Obrigado e volte sempre!");
                bool = false;
                break;
        }
    }
}
