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

    /**
     * @return int return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * @return Usuario return the usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return Livro return the livro
     */
    public int getLivro() {
        return idLivro;
    }

    /**
     * @param livro the livro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    /**
     * @return Date return the dataRetirada
     */
    public Date getDataRetirada() {
        return dataRetirada;
    }

    /**
     * @param dataRetirada the dataRetirada to set
     */
    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    /**
     * @return Date return the dataReservada
     */
    public Date getDataReservada() {
        return dataReservada;
    }

    /**
     * @param dataRetirada the dataReservada to set
     */
    public void setDataReservada(Date dataReservada) {
        this.dataReservada = dataReservada;
    }

    /**
     * @return Date return the devolucaoPrevista
     */
    public Date getDevolucaoPrevista() {
        return devolucaoPrevista;
    }

    /**
     * @param devolucaoPrevista the devolucaoPrevista to set
     */
    public void setDevolucaoPrevista(Date devolucaoPrevista) {
        this.devolucaoPrevista = devolucaoPrevista;
    }

    /**
     * @return Date return the devolucaoReal
     */
    public Date getDevolucaoReal() {
        return devolucaoReal;
    }

    /**
     * @param devolucaoReal the devolucaoReal to set
     */
    public void setDevolucaoReal(Date devolucaoReal) {
        this.devolucaoReal = devolucaoReal;
    }

}
