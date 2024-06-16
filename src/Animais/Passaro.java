package Animais;

public class Passaro extends Animal{

    static int numeroDePassaros;

    // Método construtor
    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);

        numeroDePassaros++;
    }

    // Método toString
    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Método herdado da superclasse Animal
    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }
}
