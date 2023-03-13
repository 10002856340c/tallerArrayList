
package javaapplication16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transportes transportes = new Transportes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar taxi");
            System.out.println("2. Buscar taxis por modelo");
            System.out.println("3. Eliminar taxi");
            System.out.println("4. Modificar conductor de taxi");
            System.out.println("5. Listar taxis");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la placa del taxi:");
                    String placa = scanner.next();
                    System.out.println("Ingrese el número móvil del taxi:");
                    int movil = scanner.nextInt();
                    System.out.println("Ingrese el nombre del conductor del taxi:");
                    String conductor = scanner.next();
                    System.out.println("Ingrese el modelo del taxi:");
                    String modelo = scanner.next();
                    System.out.println("Ingrese la marca del taxi:");
                    String marca = scanner.next();
                    transportes.registrarTaxi(placa, movil, conductor, modelo, marca);
                    break;
                case 2:
                    System.out.println("Ingrese el modelo a buscar:");
                    String modeloABuscar = scanner.next();
                    transportes.buscarPorModelo(modeloABuscar);
                    break;
                case 3:
                    System.out.println("Ingrese la placa del taxi a eliminar:");
                    String placaAEliminar = scanner.next();
                    transportes.eliminarTaxi(placaAEliminar);
                    break;
                case 4:
                    System.out.println("Ingrese la placa del taxi a modificar:");
                    String placaAModificar = scanner.next();
                    System.out.println("Ingrese el nuevo nombre del conductor:");
                    String nuevoConductor = scanner.next();
                    transportes.modificarTaxi(placaAModificar, nuevoConductor);
                    break;
                case 5:
                    transportes.listarTaxis();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
