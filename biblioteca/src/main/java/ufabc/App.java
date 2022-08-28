package ufabc;

import java.util.Date;

import entities.Cadastro;
import entities.Usuario;

public class App 
{
    public static void main( String[] args )
    {
        Date dataNascimento = new Date();
        Usuario usuario = new Usuario("Gabriel", dataNascimento, "123321123-00", "gabriel@gmail.com", "(11)911110000", "Rua blablabla");
        Cadastro.cadastrarUsuario(usuario);
    }
}
