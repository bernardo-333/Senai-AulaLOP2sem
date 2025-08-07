package livro;

public class Livro {
private String titulo;
private String autor;
private int numPaginas;

public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas >= 5) {
            System.out.println("Dados do livro guardado com sucesso em nosso sistema!!");
        } else {
            System.err.println("O livro não pode ter menos de 5 paginas!!");
        }
    }
}
