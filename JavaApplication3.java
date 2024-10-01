/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Aluno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro(" Toyota", "Corolla");
        carro.andar();
        // TODO code application logic here
    }
    
}

class Carro {
    private String marca;
    private String nome;
    public Carro(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
            }
    public void andar() {
        System.out.println("O carro" + marca + " " + nome + " esta andando");
    }
    }

class Carro {
  private String marca;
  private String nome;
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
public class App {
  public static void main(String[] args) {
    Carro carro = new Carro("Fiat", "Gol");
    carro.marca = "VW"; // Irá apresentar um erro de compilação
    carro.andar();
  }
}
