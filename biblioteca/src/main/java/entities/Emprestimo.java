package entities;

import java.util.Date;

public class Emprestimo {
    private int idEmprestimo;
    private int idUsuario;
    private int idLivro;
    private Date dataRetirada;
    private Date dataReservada;
    private Date devolucaoPrevista;
    private Date devolucaoReal;

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
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
}
