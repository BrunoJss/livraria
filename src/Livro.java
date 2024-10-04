import java.text.MessageFormat;

public class Livro {
    // título, autor, ISBN e quantidade em estoque
    private String titulo;
    private String autor;
    private String isbn;
    private int qtd_livro;
    
    public Livro(String titulo, String autor, String isbn, int qtd_livro){
        verificaIsbn(isbn);
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.qtd_livro = qtd_livro;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setQtdLivro(int qtd_livro){
        this.qtd_livro = qtd_livro;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public int getQtdLivro(){
        return this.qtd_livro;
    }

    @Override
    /*Ref: https://stackoverflow.com/questions/9643610/how-to-including-variables-within-strings*/
    public String toString() {
        String info_livro = MessageFormat.format("Título: {0} | Autor: {1} | ISBN: {2} | Qtd: {3}", this.titulo, this.autor, this.isbn, this.qtd_livro);
        return info_livro;
    }

    @Override
    public boolean equals(Object obj) {
        Livro param_livro = (Livro) obj;
        return this.isbn == param_livro.isbn;
    }

    /*Ref: https://www.baeldung.com/java-number-of-digits-in-int*/
    public void verificaIsbn(String isbn){
        if(isbn.length() != 10 && isbn.length() != 13){
            throw new IllegalArgumentException("Insida um ISBN válido!\n10 números para livros até 2006 e 13 números para livros a partir de 2007");
        }
    }
}
