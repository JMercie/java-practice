package tp1.ejercicio2;

import java.util.Scanner;

public class Example2 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int score;
        int acc = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una nota");
            score = Integer.parseInt(input.nextLine());
            acc += score;
        }
        System.out.printf("El promedio es : %s", (acc / 3));
        input.close();
    }
}
