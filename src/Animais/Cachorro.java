package Animais;

public class Cachorro extends Animal {
    // atributos
    static int numeroDeCachorros;

    private int tamanhoDoRabo;

    // construtores

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros ++;
    }

    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }

    // métodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        //enum
        switch (acao){
            case "Carinho": this.estadoDeEspirito = "Feliz"; break;
            case "Vai dormir": this.estadoDeEspirito = "Bravo"; break;
            case "Pisar na patinha": this.estadoDeEspirito = "Triste"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }
            return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }
}
