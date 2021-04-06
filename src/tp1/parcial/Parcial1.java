package tp1.parcial;

import java.util.Scanner;

public class Parcial1 {
    private static final Scanner input = new Scanner(System.in);
    private static final int NRO_BRASIL = 1;
    private static final int NRO_CARIBE = 2;
    private static final int NRO_DISNEY = 3;
    private static final int NRO_EUROPA = 4;
    private static final int PRECIO_BRASIL = 6000;
    private static final int PRECIO_CARIBE = 15000;
    private static final int PRECIO_DISNEY = 35000;
    private static final int PRECIO_EUROPA = 70000;
    private static final String DESTINO_PROMO = "Disney";

    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        boolean exit = false;
        int count = 0;
        String cliente;
        int numPaqueteDeseado;
        int numPasajeros;
        int totalDeVentas = 0;
        int montoDelPaquete = 0;
        int paqueteDeMayorMonto = 0;
        String nombrePaqueteMayorMonto = "";
        int cantidadDePaquetesConDescuento = 0;
        String clientePorMayorMonto = "";
        int totalPasajeros = 0;

        while (!exit) {
            System.out.printf("***Destinos y precios ***%n" +
                            "Nro de Paquete | Destino | Precio por pasajero%n" +
                            "%s | Brasil | %s%n" +
                            "%s | Caribe | %s%n" +
                            "%s | Disney | %s%n" +
                            "%s | Europa | %s%n" +
                            "0 | TERMINAR CARGA |%n" +
                            "%nAtencion, precio promocional a %s%n" +
                            "Elija el Paquete que desea adquirir:%n",
                    NRO_BRASIL,
                    PRECIO_BRASIL,
                    NRO_CARIBE,
                    PRECIO_CARIBE,
                    NRO_DISNEY,
                    PRECIO_DISNEY,
                    NRO_EUROPA,
                    PRECIO_EUROPA,
                    DESTINO_PROMO);

            numPaqueteDeseado = Integer.parseInt(input.nextLine());
            if (numPaqueteDeseado == 0) {
                exit = true;
            } else if (numPaqueteDeseado < 0 || numPaqueteDeseado > 5) {
                System.out.printf("Estos son nuestro numeros de paquete validos: %n%s%n%s%n%s%n%s", NRO_BRASIL, NRO_CARIBE, NRO_DISNEY, NRO_EUROPA);
            } else {
                System.out.println("Ingrese el nombre del Cliente:");
                cliente = input.nextLine();
                System.out.println("Ingrese la cantidad de Pasajeros:");
                numPasajeros = Integer.parseInt(input.nextLine());
                if (numPasajeros == 0) {
                    System.out.println("Ingrese una cantidad de pasajeros mayor a 0, por favor.");
                } else {
                    switch (numPaqueteDeseado) {
                        case NRO_BRASIL:
                            montoDelPaquete = PRECIO_BRASIL * numPasajeros;
                            System.out.printf(
                                    "Destino del paquete: Brasil%n" +
                                            "Cantidad de pasajeros: %s%n" +
                                            "Monto total del paquete: %s%n",
                                    numPasajeros,
                                    montoDelPaquete
                            );
                            if (montoDelPaquete > paqueteDeMayorMonto) {
                                paqueteDeMayorMonto = montoDelPaquete;
                                nombrePaqueteMayorMonto = "Brasil";
                                clientePorMayorMonto = cliente;
                            }
                            break;
                        case NRO_CARIBE:
                            montoDelPaquete = PRECIO_CARIBE * numPasajeros;
                            System.out.printf(
                                    "%nDestino del paquete: Caribe%n" +
                                            "Cantidad de pasajeros: %s%n" +
                                            "Monto total del paquete: %s%n",
                                    numPasajeros,
                                    montoDelPaquete
                            );
                            if (montoDelPaquete > paqueteDeMayorMonto) {
                                paqueteDeMayorMonto = montoDelPaquete;
                                nombrePaqueteMayorMonto = "Caribe";
                                clientePorMayorMonto = cliente;
                            }
                            break;
                        case NRO_DISNEY:
                            montoDelPaquete = PRECIO_DISNEY * numPasajeros;
                            System.out.printf(
                                    "Destino del paquete: Disney%n" +
                                            "Cantidad de pasajeros: %s%n" +
                                            "Monto total del paquete: %s%n",
                                    numPasajeros,
                                    montoDelPaquete
                            );
                            cantidadDePaquetesConDescuento++;
                            if (montoDelPaquete > paqueteDeMayorMonto) {
                                paqueteDeMayorMonto = montoDelPaquete;
                                nombrePaqueteMayorMonto = "Disney";
                                clientePorMayorMonto = cliente;
                            }
                            break;
                        case NRO_EUROPA:
                            montoDelPaquete = PRECIO_EUROPA * numPasajeros;
                            System.out.printf(
                                    "Destino del paquete: Europa%n" +
                                            "Cantidad de pasajeros: %s%n" +
                                            "Monto total del paquete: %s%n",
                                    numPasajeros,
                                    montoDelPaquete
                            );
                            if (montoDelPaquete > paqueteDeMayorMonto) {
                                paqueteDeMayorMonto = montoDelPaquete;
                                nombrePaqueteMayorMonto = "Europa";
                                clientePorMayorMonto = cliente;
                            }
                            break;
                    }
                    totalPasajeros += numPasajeros;
                    totalDeVentas += montoDelPaquete;
                    count++;
                }
            }
        }
        int promedioPorPasajero;
        if (count == 0) {
            System.out.println("Esperamos saber de usted pronto, Saludos!");
        } else {
            System.out.printf(
                    "Total de paquetes hoy: %s%n" +
                            "Total recaudado: %s%n" +
                            "Paquete de mayor monto: %s %s a nombre de : %s%n" +
                            "Monto promedio invertido por pasajero: %s%n" +
                            "Cantidad de paquetes vendidos a %s: %s %s p",
                    count,
                    totalDeVentas,
                    nombrePaqueteMayorMonto,
                    paqueteDeMayorMonto,
                    clientePorMayorMonto,
                    totalDeVentas / totalPasajeros,
                    DESTINO_PROMO,
                    cantidadDePaquetesConDescuento,
                    (cantidadDePaquetesConDescuento * 100) / count
            );
        }
        input.close();
    }
}
