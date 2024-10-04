import java.text.MessageFormat;
import java.util.Arrays;

public class Estoque {
    private Livro[] livros = new Livro[100];
    int contador = 0;

    public void add(Livro livro) {
        boolean atualizado = false;
        for (Livro item : livros) {
            if (item != null && item.getIsbn() == livro.getIsbn()) {
                item.setQtdLivro(item.getQtdLivro()+livro.getQtdLivro());
                atualizado = true;
                System.out.println("Livro já cadastrado, a quantidade será atualizada");
                break;
            }   
        }
        if(!atualizado){
            livros[contador] = livro;
            contador++;
        }
    }

    public void remover(String isbn) {
        int cont_livro = 0;
        for (Livro livro : livros) {
            if (livro != null && livro.getIsbn() == isbn) {
                this.livros[cont_livro] = null;
                break;
            } else {
                cont_livro++;
            }
        }
    }

    public void buscar(String isbn) {
        boolean encontrado = false;
        String msg = MessageFormat.format("\nISBN procurado: {0}", isbn);
        System.out.println(msg);
        for (Livro livro : livros) {
            if (livro != null && livro.getIsbn() == isbn) {
                System.out.println("Livro encontrado:");
                System.out.println(livro.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Livro não encontrado!");
        }
    }

    public void listar(){
        for (Livro livro : livros) {
            if(livro != null){
                System.out.println(livro.toString());
            }
        }
    }

    public void atualizarQuantidade(String isbn, int qtd_livros){
        boolean encontrado = false;
        String msg = MessageFormat.format("\nISBN procurado: {0}", isbn);
        System.out.println(msg);
        for (Livro livro : livros) {
            if (livro != null && livro.getIsbn() == isbn) {
                System.out.println("Quantidade atualizada");
                livro.setQtdLivro(qtd_livros);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Livro não encontrado!");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(livros);

    }

}
