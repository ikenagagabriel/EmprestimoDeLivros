package ufabc;

import java.text.ParseException;
import java.util.Scanner;

import entities.Historico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args ) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        System.out.println("Bem-vindo! Degite seu Login e Senha:");
        System.out.print("Login (cpf): ");
        String login = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        long[] perfil = Historico.buscaPerfil(em, login);

        while(Funcoes.bool){
            if(perfil[0] == 0){
                Funcoes.usuarioLogado(em, perfil[1]);
            }
            else if(perfil[0] == 1){
                Funcoes.admLogado(em);
            }
            else{
                System.out.println("Usuário não encontrado!");
                Funcoes.bool = false;
            }
        }

        em.close();
        emf.close();
        sc.close();
    }
}
