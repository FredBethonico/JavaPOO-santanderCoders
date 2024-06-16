package Animais;

public class Gato extends Animal {

    static int numeroDeGatos;

    // Método construtor
    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);

        numeroDeGatos++;
    }

    // Método toString
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Método herdado da superclasse Animal
    @Override
    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
