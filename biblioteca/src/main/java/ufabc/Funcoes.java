package ufabc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import entities.Administrador;
import entities.Emprestimo;
import entities.Historico;
import entities.Livro;
import entities.Usuario;
import entities.enums.Idioma;
import jakarta.persistence.EntityManager;

public class Funcoes {
    public static boolean bool = true;
    private static String input;
    private static Scanner sc = new Scanner(System.in);

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
                    System.out.println(livro.toString());
                }
                break;
            case "2":
                List<Emprestimo> emprestimos = Historico.getEmprestimosUsuario(em, idUsuario);

                for (Emprestimo emprestimo : emprestimos) {
                    Livro l = Historico.buscaLivroId(em, emprestimo.getIdLivro());
                    System.out.println(emprestimo.toString(l));
                }
                break;
            case "3":
                System.out.println("Saindo...");
                bool = false;
                break;
        }
    }

    public static void admLogado (EntityManager em) throws ParseException{
        System.out.println("Escolha a opção desejada:\n[1] Consultar histórico\n[2] Verificar cadastro\n[3] Cadastrar usuário\n[4] Cadastrar funcionário\n[5] Cadastrar livro\n[6] Sair");
        System.out.print("Opção: ");
        input = sc.nextLine();  
        switch(input){
            case "1":
                System.out.print("Digite o CPF do Usuário: ");
                input = sc.nextLine();
                List<Emprestimo> emprestimos = Historico.getEmprestimosAdmin(em, input);

                for (Emprestimo emprestimo : emprestimos) {
                    Usuario u = Historico.buscaUsuarioId(em, emprestimo.getIdUsuario());
                    Livro l = Historico.buscaLivroId(em, emprestimo.getIdLivro());

                    String imprime = "\nUsuário: " + emprestimo.getIdUsuario() + ", " + u.getNome() + "\nLivro: "+ emprestimo.getIdLivro() + ", "+ l.getTitulo()+ "\nData de Retirada: " + emprestimo.getDataRetirada() + "\nData de Prevista: "+ emprestimo.getDevolucaoPrevista() + "\nData de Devolução: "+ emprestimo.getDevolucaoReal();
                    System.out.println(imprime+"\n");
                }
                break;
            case "2":
                System.out.print("Digite o CPF do Usuário: ");
                input = sc.nextLine();
                Usuario usuario = Historico.buscaUsuario(em, input);
                System.out.println(usuario);
                break;
            case "3":
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Data de nascimento (dd/MM/yyyy): ");
                String dataNascimento = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                System.out.print("E-mail: ");
                String email = sc.nextLine();
                System.out.print("Telefone: ");
                String telefone = sc.nextLine();
                System.out.print("Endereço: ");
                String endereco = sc.nextLine();

                Usuario novoUsuario = new Usuario(nome, sdf.parse(dataNascimento), cpf, email, telefone, endereco);
                break;
            case "4":
                System.out.print("Nome: ");
                String nomeAdm = sc.nextLine();
                System.out.print("Data de nascimento (dd/MM/yyyy): ");
                String dataNascimentoAdm = sc.nextLine();
                System.out.print("CPF: ");
                String cpfAdm = sc.nextLine();
                System.out.print("E-mail: ");
                String emailAdm = sc.nextLine();
                System.out.print("Telefone: ");
                String telefoneAdm = sc.nextLine();
                System.out.print("Endereço: ");
                String enderecoAdm = sc.nextLine();

                Administrador novoAdministrador = new Administrador(nomeAdm, sdf.parse(dataNascimentoAdm), cpfAdm, emailAdm, telefoneAdm, enderecoAdm);
                break;
            case "5":
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("Gênero: ");
                String genero = sc.nextLine();
                System.out.print("Resumo: ");
                String resumo = sc.nextLine();
                System.out.print("Idioma: ");
                String idioma = sc.nextLine();
                System.out.print("Editora: ");
                String editora = sc.nextLine();
                System.out.print("Data de publicação (dd/MM/yyyy): ");
                String dataPublicacao = sc.nextLine();
                System.out.print("Número de páginas: ");
                int nPaginas = sc.nextInt();
                System.out.print("Situação: ");
                String situacao = sc.nextLine();

                Livro livroNovo = new Livro(idTitulo, titulo, autor, genero, resumo, idioma, editora, dataPublicacao, nPaginas, situacao);

                break;
            case "6":
                System.out.println("Saindo...");
                bool = false;
                break;
        }
    }
}
