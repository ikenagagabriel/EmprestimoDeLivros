package entities;

import java.util.List;

import jakarta.persistence.EntityManager;

public class Cadastro {
    
    public static List<Livro> buscaLivro(String consulta, EntityManager em) {
        String consultaLivro = "select * from livro where titulo like '%" + consulta + "%' or autor like '%" + consulta + "%'";
        List<Livro> resultados = em.createNativeQuery(consultaLivro, Livro.class).getResultList();

        return resultados;
    }

    public static void cadastrarUsuario(Usuario usuario, EntityManager em) {
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }

    public static void cadastrarFuncionario(Administrador funcionario, EntityManager em) {
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }
    
    public static void cadastrarLivro(Livro livro, EntityManager em) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }
}
