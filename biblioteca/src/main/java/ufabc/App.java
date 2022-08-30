package ufabc;


import java.util.List;
import java.util.Scanner;

import entities.Cadastro;
import entities.Emprestimo;
import entities.Historico;
import entities.Livro;
//import entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        int i = sc.nextInt();
        System.out.println("Bem-vindo!");

        while(Funcoes.bool){
            if(i == 0){
                Funcoes.usuarioLogado(em, 2);
            }
            else{
                Funcoes.admLogado(em);
            }
        }

        em.close();
        emf.close();
        sc.close();
    }
}
