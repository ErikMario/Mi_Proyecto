package Ejercicio2;

import java.util.Scanner;

 import java.util.Scanner;

public class CalculadoraPaginas {

    public static void main(String[] args) {
        Scanner p2 = new Scanner(System.in);


        System.out.print("Introduce el tamaño del archivo (en bytes): ");
        long tamanoArchivo = p2.nextLong();

        System.out.print("Introduce el tamaño de la página (en bytes): ");
        long tamanoPagina = p2.nextLong();


        long numPaginas = tamanoArchivo / tamanoPagina;
        if (tamanoArchivo % tamanoPagina != 0) {
            numPaginas++;
        }

        // Mostrar el resultado
        System.out.println("Número total de páginas necesarias: " + numPaginas);

        p2.close();
    }
}

