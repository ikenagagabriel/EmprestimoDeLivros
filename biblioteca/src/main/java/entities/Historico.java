package entities;

import java.util.List;


import jakarta.persistence.EntityManager;


public class Historico {
    public static List<Emprestimo> getEmprestimosAdmin(EntityManager em, String consulta) {
        String consultaLivro;

        if(consulta!=""){
            consultaLivro = "select e.* from emprestimo e join usuario u on e.idusuario=u.idusuario where u.cpf like '" + consulta +"'";
        }
        else {
            consultaLivro = "select * from emprestimo";
        }
        List<Emprestimo> resultados = em.createNativeQuery(consultaLivro, Emprestimo.class).getResultList();

        return resultados;
    }

    public static List<Emprestimo> getEmprestimosAdmin(EntityManager em) {
        List<Emprestimo> resultados = getEmprestimosAdmin(em, "");

        return resultados;
    }

    public static List<Emprestimo> getEmprestimosUsuario(EntityManager em, long idusuario) {
        String consultaLivro = "select * from emprestimo where idusuario=" + idusuario;
        List<Emprestimo> resultados = em.createNativeQuery(consultaLivro, Emprestimo.class).getResultList();

        return resultados;
    }

    public static List<Livro> buscaLivro(EntityManager em, String consulta) {
        String consultaLivro = "select * from livro where titulo like '%" + consulta + "%' or autor like '%" + consulta + "%'";
        List<Livro> resultados = em.createNativeQuery(consultaLivro, Livro.class).getResultList();

        return resultados;
    }

    public static Livro buscaLivroId(EntityManager em, long consulta) {
        String consultaLivro = "select * from livro where idlivro=" + consulta;
        Livro resultados = (Livro) em.createNativeQuery(consultaLivro, Livro.class).getSingleResult();

        return resultados;
    }

    public static Usuario buscaUsuario(EntityManager em, String consulta) {
        String consultaUsuario = "select * from usuario where cpf like '" + consulta + "'";
        Usuario resultados = (Usuario) em.createNativeQuery(consultaUsuario, Usuario.class).getSingleResult();

        return resultados;
    }

    public static Usuario buscaUsuarioId(EntityManager em, long consulta) {
        String consultaLivro = "select * from usuario where idusuario=" + consulta;
        Usuario resultados = (Usuario) em.createNativeQuery(consultaLivro, Usuario.class).getSingleResult();

        return resultados;
    }

    public static void registraEmprestimos(EntityManager em, Emprestimo emprestimo) {
        em.getTransaction().begin();
        em.persist(emprestimo);
        em.getTransaction().commit();
    }

}