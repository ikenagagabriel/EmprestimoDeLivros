package entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Administrador extends Perfil{
    
    @Id
    @GeneratedValue
    private long idAdministrador;
    
    public Administrador(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco) {
        super(nome, dataNascimento, cpf, email, telefone, endereco);
    }

    public long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

}
