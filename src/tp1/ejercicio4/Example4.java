package tp1.ejercicio4;

import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
 * cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
 * semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
 * sábados. (Todas las horas valen lo mismo.)
 */
public class Example4 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese los honorarios de su hora de trabajo");
        int ratePerHour = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad de horas que realiza por dia");
        int workHours = Integer.parseInt(input.nextLine());
        int ratePerDay = ratePerHour * workHours;
        System.out.printf("Su sueldo semanal es: %s"
                , ratePerDay * 5 + ratePerDay / 2);
        input.close();
    }
}
