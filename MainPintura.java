package Act4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPintura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("-------------------");
            System.out.println("Antes de empezar: Introduce cobertura de pintura");

            double cobertura = 0.0;

            try {
                cobertura = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido.");
                sc.nextLine(); // Limpiar el buffer del scanner
                continue; // Vuelve al inicio del bucle
            }

            Pintura pintura = new Pintura(cobertura);

            System.out.println("------------------");

            // Mostrar menú
            System.out.println("Menú: Elige según número");
            System.out.println("1. Calcular cantidad de pintura para Rectángulo");
            System.out.println("2. Calcular cantidad de pintura para Esfera");
            System.out.println("3. Calcular cantidad de pintura para Cilindro");
            System.out.println("4. Salir");

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                sc.nextLine(); // Limpiar el buffer del scanner
                opcion = 0; // Asignar un valor por defecto
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Introduce longitud de rectángulo");
                        int longRect = sc.nextInt();
                        System.out.println("Introduce ancho de rectángulo");
                        int anchRect = sc.nextInt();
                        Rectangulo rectangulo = new Rectangulo(longRect, anchRect);
                        System.out.println("Pintura para rectángulo: " + pintura.calculoPintura(rectangulo));
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir un número entero para las dimensiones del rectángulo.");
                        sc.nextLine(); // Limpiar el buffer del scanner
                    }
                    break;
                case 2:
                    try {
                        System.out.println("------------------");
                        System.out.println("Introduce radio de esfera");
                        int radEsf = sc.nextInt();
                        Esfera esfera = new Esfera(radEsf);
                        System.out.println("Pintura para esfera: " + pintura.calculoPintura(esfera));
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir un número entero para el radio de la esfera.");
                        sc.nextLine(); // Limpiar el buffer del scanner
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Introduce radio del cilindro");
                        int radCilin = sc.nextInt();
                        System.out.println("Introduce la altura del cilindro");
                        int altCilin = sc.nextInt();
                        Cilindro cilindro = new Cilindro(radCilin, altCilin);
                        System.out.println("Pintura para cilindro: " + pintura.calculoPintura(cilindro));
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir números enteros para las dimensiones del cilindro.");
                        sc.nextLine(); // Limpiar el buffer del scanner
                    }
                    break;
                case 4:
                    System.out.println("Saliendo programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!salir);

        sc.close();
    }
}


/*
El polimorfismo se produce en el método calcularPintura, pasandole como parámetro una instancia de tipo forma

 */
