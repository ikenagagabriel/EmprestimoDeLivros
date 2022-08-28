package entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Cadastro {
    //private static List<Usuario> usuarios = new ArrayList<Usuario>();
    private static List<Administrador> funcionarios = new ArrayList<Administrador>();;
    private static List<Livro> livros = new ArrayList<Livro>();;
    
    public static int buscaLivro(String titulo) {
        return 0;
    }

    public static void cadastrarUsuario(Usuario usuario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Deu certo!");
    }

    public static void cadastrarFuncionario(Administrador funcionario) {
        funcionarios.add(funcionario);
    }
    
    public static void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }
}
