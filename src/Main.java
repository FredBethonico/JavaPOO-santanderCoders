import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Bob", "Preto", 30, 5.2, 5, "Nada");

        Gato gato1  = new Gato("Fanon", "Cinza", 15, 5.0, "Nada");

        Passaro passaro1 = new Passaro("Dudu", "Verde", 8, 0.8, "Nada");

        Petshop petshop = new Petshop();

        petshop.darBanho(gato1);
        System.out.printf(gato1.getNome() + ": "+  gato1.getEstadoDeEspirito() + "%n");

        petshop.tosar(cachorro1);
        System.out.printf(cachorro1.getNome() + ": " + cachorro1.getEstadoDeEspirito() + "%n");

        petshop.deixarNoHotel(passaro1);
        System.out.printf(passaro1.getNome() + ": " + passaro1.getEstadoDeEspirito() + "%n");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}