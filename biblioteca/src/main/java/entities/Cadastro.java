package entities;

import java.util.List;

public class Cadastro {
    private static List<Usuario> usuarios;
    private static List<Administrador> funcionarios;
    private static List<Livro> livros;
    
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
