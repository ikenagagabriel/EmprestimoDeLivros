package entities;

import java.util.Date;
import java.util.Calendar;

public abstract class Perfil{
    protected String nome;
    protected Date dataNascimento;
    protected int idade;
    protected String cpf;
    protected String email;
    protected String telefone;
    protected String endereco;

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
		idade = calculaIdade(dataNascimento);
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