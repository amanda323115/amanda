/**
     * @param args the command line arguments
     */
       /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scr/iti32vivi;

/**
 *
 * @author Aluno
 */
public class iti32vivi.java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Carro carro = new Carro("Fiat", "Gol");
    carro.andar();
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
