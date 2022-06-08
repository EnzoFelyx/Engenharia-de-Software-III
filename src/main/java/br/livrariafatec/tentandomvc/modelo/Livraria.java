package br.livrariafatec.tentandomvc.modelo;

public class Livraria {

    private String nome;
    private String autor;
    private float preco;
    private int codigo;

    public Livraria(String nome, String autor, float preco, int codigo) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
