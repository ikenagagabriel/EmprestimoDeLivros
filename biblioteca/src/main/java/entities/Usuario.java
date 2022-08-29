package entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario extends Perfil{

    @Id
    @GeneratedValue
    private long idUsuario;
    private boolean situacaoCadastral;

    public Usuario(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco){
        super(nome, dataNascimento, cpf, email, telefone, endereco);
        this.situacaoCadastral = true;
    }

    public long getId() {
        return idUsuario;
    }

    public boolean isSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(boolean situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }  
}