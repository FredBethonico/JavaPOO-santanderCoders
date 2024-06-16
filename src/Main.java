import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Bob", "Preto", 30, 5.2, 5, "Nada");

        Gato gato1  = new Gato("Fanon", "Cinza", 15, 5.0, "Nada");

        Passaro passaro1 = new Passaro("Dudu", "Verde", 8, 0.8, "Nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}