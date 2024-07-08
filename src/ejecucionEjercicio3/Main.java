package ejecucionEjercicio3;

import java.util.Scanner;

import modulo.ProcessManager;
import modulo.Process;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessManager processQueue = new ProcessManager();

        while (true) {
            System.out.println(" Menu:");
            System.out.println("1  Crear proceso");
            System.out.println("2  Ejecutar procesos");
            System.out.println("3  Salir");
            System.out.print("Selecciona una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nombre del proceso: ");
                    String name = scanner.nextLine();
                    System.out.print("Tiempo de ejecución (segundos): ");
                    int executionTime = scanner.nextInt();
                    processQueue.addProcess(new Process());

                    break;
                case 2:
                    System.out.println(processQueue.executeProcesses());
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}
