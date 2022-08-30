package entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue
    private long idEmprestimo;

    private long idUsuario;
    private long idLivro;
    private Date dataRetirada;
    private Date dataReservada;
    private Date devolucaoPrevista;
    private Date devolucaoReal;

    public Emprestimo(){}

    public Emprestimo(long idUsuario, long idLivro, Date dataReservada){
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.dataReservada = dataReservada;
    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataReservada() {
        return dataReservada;
    }

    public void setDataReservada(Date dataReservada) {
        this.dataReservada = dataReservada;
    }

    public Date getDevolucaoPrevista() {
        return devolucaoPrevista;
    }

    public void setDevolucaoPrevista(Date devolucaoPrevista) {
        this.devolucaoPrevista = devolucaoPrevista;
    }

    public Date getDevolucaoReal() {
        return devolucaoReal;
    }

    public void setDevolucaoReal(Date devolucaoReal) {
        this.devolucaoReal = devolucaoReal;
    }

    public String toString(Livro l) {
        return "Livro: " + getIdLivro() + ", "+ l.getTitulo()+ "\nData de Retirada: " + getDataRetirada() +"\nData de Prevista: "+ getDevolucaoPrevista() +"\nData de Devolução: "+ getDevolucaoReal() + "\n";
    }
}
