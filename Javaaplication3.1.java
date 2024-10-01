class Caminhao extends Carro {
    private int carga;
    public Caminhao(String marca, String nome, int carga) {
        super(marca, nome);
        this.carga = carga;
    }
    public void mostraCarga() {
        System.out.println("O caminhão " + super.nomeCompleto() +
        " carrega " + carga + " toneladas");
    }
}
public class App {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);
        // O caminhão Mercedes 1318 carrega 16 toneladas
        caminhao.mostraCarga();
    }
}

class Caminhao extends Carro {
    private int carga;
    public Caminhao(String marca, String nome, int carga) {
        super(marca, nome);
        this.carga = carga;
    }
    public void andar() {
        System.out.println("O caminhão " + super.nomeCompleto() +
        " está carregando " + carga + " toneladas");
    }
    public void andar(boolean deRe) {
        if (deRe)
            System.out.println("O caminhão " + super.nomeCompleto() +
            " está carregando " + carga + " toneladas de ré");
        else
            andar();
    }
