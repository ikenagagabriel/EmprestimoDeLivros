package entities;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Usuario> usuarios = new ArrayList<Usuario>();
    private static List<Administrador> funcionarios = new ArrayList<Administrador>();;
    private static List<Livro> livros = new ArrayList<Livro>();;
    
    public static int buscaLivro(String titulo) {
        return 0;
    }

    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void cadastrarFuncionario(Administrador funcionario) {
        funcionarios.add(funcionario);
    }
    
    public static void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }
}
