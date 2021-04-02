package tp1.ejercicio3;

import java.util.Scanner;

public class Example3 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un numero, por favor");
        int num= Integer.parseInt(input.nextLine());
        System.out.printf("El resultado de %s  multiplicado por 5 es : %s y divido por 2 es: %s"
                    , num
                    , (num * 5)
                    , (num / 2));
        input.close();
    }
}
