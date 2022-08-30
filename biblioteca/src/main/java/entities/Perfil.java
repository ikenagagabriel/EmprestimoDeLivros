package entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.util.Calendar;

@MappedSuperclass
public abstract class Perfil{
    @Column
    protected String nome;

    @Column
    protected Date dataNascimento;
    
    @Column
    protected int idade;
    
    @Column
    protected String cpf;
    
    @Column
    protected String email;
    
    @Column
    protected String telefone;

    @Column
    protected String endereco;

    public Perfil(){}

	public Perfil(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = calculaIdade(dataNascimento);
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

    public static int calculaIdade(Date dataNascimento) {
		Calendar dataFornecida = Calendar.getInstance();
		Calendar hoje = Calendar.getInstance();
		dataFornecida.setTime(dataNascimento);
		dataFornecida.set(Calendar.YEAR, hoje.get(Calendar.YEAR));
		int idade = dataFornecida.after(hoje) ? -1 : 0;
		dataFornecida.setTime(dataNascimento);
		idade += hoje.get(Calendar.YEAR) - dataFornecida.get(Calendar.YEAR);
		return idade;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
		this.idade = calculaIdade(dataNascimento);
    }

	public int getIdade(){
		return idade;
	}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}