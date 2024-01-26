package Practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public  static   void main (String args[]) {


        Scanner libros = new Scanner(System.in);
        Library biblioteca = new Library();

        while (true) {
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar por título");
            System.out.println("3. Buscar por autor");
            System.out.println("4. Listar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = libros.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el titulo del libro");
                    String titulo = libros.next();
                    break;
                case 2:
                    System.out.println("Ingrese el libro a buscar");
                    String buscar = libros.next();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del autor");
                    String nombre = libros.next();
                    break;
                case 4:
                    List<Library> listaElementos  = new ArrayList<>();

                    System.out.println("Los libros ingresados son:");
                    String registro = libros.next();
                    for (Library elemento : listaElementos ) {
                        System.out.println(elemento);
                        break;
                    }
                case 5:
                    System.out.println("Salir");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida\nInténtelo de nuevo");

            }
        }
    }
}
