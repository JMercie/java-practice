package tp1.ejercicio5;

import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
 * num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
 * lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas.
 */
public class Example5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1;
        int num2;
        int container;

        System.out.println("Por favor ingrese un numero");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor ingrese otro numero");
        num2 = Integer.parseInt(scanner.nextLine());

        container = num2;
        num2 = num1;
        num1 = container;
        System.out.printf("Sus numeros al reverso son : %n%s%n%s", num1, num2);
        scanner.close();
    }
}
