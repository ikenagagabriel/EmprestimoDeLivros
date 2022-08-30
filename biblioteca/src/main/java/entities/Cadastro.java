package entities;

import jakarta.persistence.EntityManager;

public class Cadastro {

    public static void cadastrarUsuario(EntityManager em, Usuario usuario) {
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }

    public static void cadastrarFuncionario(EntityManager em, Administrador funcionario) {
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }
    
    public static void cadastrarLivro(EntityManager em, Livro livro) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }
}
