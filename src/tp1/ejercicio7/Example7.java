package tp1.ejercicio7;

import java.util.Scanner;

/*
 *Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
 *valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
 *metros de alambre para cercarlo completamente a tres alturas distintas.
 */
public class Example7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int width;
        int large;
        int valueOfSqrMeter;

        System.out.println("Ingrese el ancho total del terreno");
        width = Integer.parseUnsignedInt(scanner.nextLine());
        System.out.println("Ingrese el largo total del terreno");
        large = Integer.parseUnsignedInt(scanner.nextLine());
        System.out.println("Ingrese el valor total del metro cuadrado");
        valueOfSqrMeter = Integer.parseUnsignedInt(scanner.nextLine());

        System.out.printf(
                "El valor total del terreno es: %n%s",
                width * large * valueOfSqrMeter
        );
        scanner.close();
    }
}
