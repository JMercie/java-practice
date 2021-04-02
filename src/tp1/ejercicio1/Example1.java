package tp1.ejercicio1;

import java.util.Scanner;

public class Example1 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hola, cual es tu nombre?");
        String name = input.nextLine();
        System.out.printf("Hola, %s", name);
        input.close();
    }
}
