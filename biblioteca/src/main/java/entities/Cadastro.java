package entities;

import java.util.List;

import jakarta.persistence.EntityManager;

public class Cadastro {
    
    public static List<Livro> buscaLivro(EntityManager em, String consulta) {
        String consultaLivro = "select * from livro where titulo like '%" + consulta + "%' or autor like '%" + consulta + "%'";
        List<Livro> resultados = em.createNativeQuery(consultaLivro, Livro.class).getResultList();

        return resultados;
    }

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
