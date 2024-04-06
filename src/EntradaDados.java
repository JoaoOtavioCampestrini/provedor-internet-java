import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
    // Entrada
    // Scanner
    Scanner scanner = new Scanner(System.in);


    // Texto
    System.out.print ("\nInforme seu nome:");
    String nome =  scanner.next();


    // Caractere
    System.out.print("\nEscolha uma cor: (Azul, Verde, Amarelo)");
    char cor = scanner.next().charAt(0);



    // Número
    System.out.print("\nInforme sua idade:");
    int idade = scanner.nextInt();


    // Altura
    System.out.print("\nInfome sua altura:");
    double altura = scanner.nextDouble();




    // Processamento
    nome = nome.toUpperCase();


    // Saída
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(altura);
    System.out.println(cor);


    scanner.close();


    }
}
