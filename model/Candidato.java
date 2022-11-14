package model;

public class Candidato {
    private int numero;
    private String nome;
    private int idpartido;
    private int idcargo;

    public Candidato(int numero, String nome, int idpartido, int idcargo) {
        this.numero = numero;
        this.nome = nome;
        this.idpartido = idpartido;
        this.idcargo = idcargo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(int idpartido) {
        this.idpartido = idpartido;
    }

    public int getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }
}
