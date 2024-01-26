package Practica;

import java.util.Scanner;

public class vector {
    public  static   void main (String args[]) {

        int[] vector = new int[5];

        Scanner arreglo = new Scanner(System.in);

        for (int v = 0; v < 5; v++) {
            System.out.println("Ingrese un numero de posicion :");
            vector[v] = arreglo.nextInt();
        }

        for (int i = vector.length -1; i >= 0 ; i--) {
            System.out.println("Posición del vector " + i + ": " + vector[i]);

        }

    }
}
