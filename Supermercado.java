public class Supermercado {
    public String produto;
    public int preco, total, quantidade;

    public void alimentos() {
        total = quantidade * preco;
        System.out.println("O total é " + total);
    }
    public Supermercado(String produto, int preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}
