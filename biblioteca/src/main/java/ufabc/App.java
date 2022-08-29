package ufabc;


import java.util.List;

//import java.util.Date;

import entities.Cadastro;
import entities.Livro;
//import entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        // Date dataNascimento = new Date();
        // Usuario usuario = new Usuario("Lucas Lima", dataNascimento, "789542684-01", "lucas.lima@gmail.com", "(11)944445555", "Rua dos Bobos");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        List<Livro> resultados = Cadastro.buscaLivro("Boulos", em);

        em.close();
        emf.close();

        for (Livro resultado : resultados) {
            String imprime = resultado.getTitulo() + ", " + resultado.getAutor();
            System.out.println(imprime);
        }
    }
}
