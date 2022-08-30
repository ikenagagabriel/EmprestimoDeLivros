package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import entities.enums.Idioma;
import entities.enums.Situacao;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

@Entity
public class Livro {
    @Id
    @GeneratedValue
    private long idLivro;

    private int idTitulo;
    private String titulo;
    private String autor;
    private String genero;
    private String resumo;
    private Idioma idioma;
    private String editora;
    private Date dataPublicacao;
    private int nPaginas;
    private double nota;
    private Situacao situacao;

    public Livro(){}

    public Livro(int idTitulo, String titulo, String autor, String genero, String resumo, String idioma,
            String editora, String dataPublicacao2, int nPaginas) throws ParseException {

        this.idTitulo = idTitulo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.resumo = resumo;
        this.idioma = Idioma.valueOf(idioma);
        this.editora = editora;
        this.dataPublicacao = new SimpleDateFormat("dd/MM/yyyy").parse(dataPublicacao2);
        this.nPaginas = nPaginas;
        this.nota = 0; // Começa em '0', ou seja, sem avaliações
        this.situacao = Situacao.valueOf("DISPONIVEL");
    }

    public long getIdLivro() {
        return idLivro;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public static int geraIdTitulo(EntityManager em, String titulo){
        try{
            String consultaLivro = "select idtitulo from livro where titulo like '"+ titulo + "'";
            int resultados = (int) em.createNativeQuery(consultaLivro).getSingleResult();        
            return resultados;
        }
        catch (NoResultException e){
            String consultaLivro = "select max(idtitulo) from livro";
            int resultados = (int) em.createNativeQuery(consultaLivro).getSingleResult();
            return resultados+1;
        }

        
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getNPaginas() {
        return nPaginas;
    }

    public void setNPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString(){
        return "Id: " + getIdTitulo() + "Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getSituacao() + "\n";
    }
}
