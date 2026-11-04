public class Classe {
    public static void main(String[] args) {
        Ativ ativ = new Ativ();
        ativ.nome = "Maria";
        ativ.falar();
        ativ.andar();
        ativ.comer();
        ativ.dormir();
        Carro carro = new Carro();
        carro.modelo = "Fiat";
        carro.ano = 2015;
        carro.portas = 4;
        carro.marca = "Fiat";
        carro.mostrarmodelo();
        Pessoa pessoa = new Pessoa("Maria", "01234567890", "email123@", 22);
        pessoa.mostrardados();
        Supermercado supermercado = new Supermercado("Agua", 2, 12);
            supermercado.alimentos();

    }
}
