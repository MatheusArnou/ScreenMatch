package br.com.alura.desafios.encapsulamento;

public class Livro {
    private String titulo;
    private String autor;

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

    public void exibirDetalhes(){
        String texto = """
                Detalhes do livro:
                Titulo: %s
                Autor: %s
                """.formatted(getTitulo(),getAutor());

        System.out.println(texto);
    }
}
