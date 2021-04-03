package tp1.ejercicio8;

import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
 * resultados para las 4 operaciones matemáticas básicas con los números ingresados.
 */
public class Example8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        int num1 = Integer.parseUnsignedInt(scanner.nextLine());
        System.out.println("ingrese otro numero");
        int num2 = Integer.parseUnsignedInt(scanner.nextLine());

        System.out.printf(
                "La suma de esos numeros es igual a: %s%n" +
                        "La resta de esos numeros es igual a: %s%n" +
                        "La multiplicacion de esos numeros es igual a: %s%n" +
                        "La division de esos numeros es igual a: %s%n",
                num1 + num2,
                num1 - num2,
                num1 * num2,
                num1 / num2
        );
        scanner.close();
    }
}
