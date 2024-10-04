public class App {
    public static void main(String[] args) throws Exception {
        /*
          -Implemente os seguintes métodos na classe Estoque:
            -atualizarQuantidade(String isbn, int quantidade): atualiza a quantidade em estoque de um livro a partir do seu ISBN.*/
            Estoque e1 = new Estoque();
            Livro l1 = new Livro("TEste","tt", "1234567890111", 25);
            Livro l2 = new Livro("TEste2","tt", "1234567890222", 25);
            Livro l3 = new Livro("TEste3","tt", "1234567890333", 25);
            System.out.println(l1.toString());
            
            e1.add(l1);
            e1.add(l2);
            Livro l4 = new Livro("TEste","tt", "1234567890111", 25);
            e1.add(l3);
            e1.add(l4);
            e1.atualizarQuantidade("1234567890222", 250);

            e1.remover("1234567890333");
            e1.buscar("1234567890222");
            e1.buscar("1234567890223");
            e1.listar();
    }
}
