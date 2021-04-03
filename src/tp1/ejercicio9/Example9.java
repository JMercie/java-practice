package tp1.ejercicio9;

import java.util.Scanner;

/*
 *Realizá un programa que permita ingresar dos números que representan las medidas en
 *grados de dos ángulos interiores de cierto triángulo. A partir de los valores de
 *estos dosángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
 *suma de los ángulos interiores de cualquier triángulo es de 180o.
 */
public class Example9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese un numero representando uno de los angulos del triangulo");
        int angle1 = Integer.parseUnsignedInt(scanner.nextLine());
        System.out.println("ingrese otro numero representando uno de los angulos del triangulo");
        int angle2 = Integer.parseUnsignedInt(scanner.nextLine());

        if (angle1 + angle2 > 180){
            System.out.println("Parece que no estamos dibujando un triangulo aqui...");
        }else{
            System.out.printf("El tercer angulo tiene un valor de: %n%s", 180 - angle1 - angle2);
        }
        scanner.close();
    }
}
