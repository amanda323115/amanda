/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scr/iti32vivi;

/**
 *
 * @author Aluno
 */
public class iti32vivi.1.1.java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);
        // O caminhão Mercedes 1318 carrega 16 toneladas
        caminhao.mostraCarga();
    }
    
}
class Carro {
  private final String marca;
  private final String nome;
  public Carro(String marca, String nome) {
    this.marca = marca;
    this.nome = nome;
  }
  protected String nomeCompleto() {
    return marca + " " + nome;
  }
  public void andar() {
    System.out.println("O carro " + nomeCompleto() + " está andando");
  }
}

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

}
