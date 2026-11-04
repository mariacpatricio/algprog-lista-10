public class Pessoa {
    public int idade;
    public String cpf, nome, email;

    Pessoa(String nome, String cpf, String email, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }
    public void mostrardados() {
        System.out.println("O nome é " + nome);
        System.out.println("O cpf é " + cpf);
        System.out.println("O email é " + email);
        System.out.println("A idade é " + idade);
    }
}