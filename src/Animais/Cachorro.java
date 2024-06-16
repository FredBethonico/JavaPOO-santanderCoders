package Animais;

public class Cachorro extends Animal {

    static int numeroDeCachorros;

    // Método construtor
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);

        numeroDeCachorros ++;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Método herdado da superclasse Animal
    @Override
    public void soar() {
        System.out.println("AU AU");
    }
}
