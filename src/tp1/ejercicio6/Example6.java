package tp1.ejercicio6;

import java.util.Scanner;

/*
 *Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
 *vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
 *por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
 *cobrar por el vendedor.
 */
public class Example6 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final double FIXED_SALARY = 44000.00;

    public static void main(String[] args) {
        System.out.println("Ingrese el monto total por ventas realizadas este mes");
        double totalSalesAmount = Double.parseDouble(scanner.nextLine());
        double commissions = totalSalesAmount * 0.16;
        System.out.printf("El sueldo total del vendedor es :%n%s", FIXED_SALARY + commissions);
        scanner.close();
    }
}
