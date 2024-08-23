package Aplicacao;

import Entidade.Forma;
import Entidade.Triangulo;
import Entidade.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o tipo de forma (1 para Triângulo, 2 para Retângulo):");
        int escolha = scanner.nextInt();
        
        if (escolha == 1) {
        
            System.out.println("Digite a altura do triângulo:");
            int altura = scanner.nextInt();
            
            System.out.println("Digite a largura da base do triângulo:");
            double largura = scanner.nextDouble();
            
            Triangulo triangulo = new Triangulo(altura, largura);
            triangulo.mostrarInfo("Triângulo");
            
        } else if (escolha == 2) {
           
            System.out.println("Digite a largura do retângulo:");
            double largura = scanner.nextDouble();
            
            System.out.println("Digite a base do retângulo:");
            double base = scanner.nextDouble();
            
            Retangulo retangulo = new Retangulo(largura, base);
            retangulo.mostrarInfo("Retângulo");
            
        } else {
            System.out.println("Escolha inválida. Por favor, escolha 1 para Triângulo ou 2 para Retângulo.");
        }
        
        scanner.close();
    }
}
