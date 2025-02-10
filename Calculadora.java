/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculadora;
import java.util.Scanner;

/**
 *
 * @author Denisse
 */
public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calculadora en Java");
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("Elige una operación: +, -, *, /");
            char operacion = scanner.next().charAt(0);
            
            double resultado;
            
            switch (operacion) {
                case '+' -> resultado = num1 + num2;
                case '-' -> resultado = num1 - num2;
                case '*' -> resultado = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                        return;
                    }
                }
                default -> {
                    System.out.println("Operación no válida.");
                    return;
                }
            }
            
            System.out.println("El resultado es: " + resultado);
        }
    }
}

