package Practica;

import java.util.ArrayList;
import java.util.Scanner;

    class Libro {

        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }

    public class BibliotecaVirtual {
        public static void main(String[] args) {
            Scanner libros = new Scanner(System.in);
            ArrayList<Libro> biblioteca = new ArrayList<>();

            while (true) {
                System.out.println("\n=== Menú ===");
                System.out.println("1. Agregar libro");
                System.out.println("2. Buscar por título");
                System.out.println("3. Buscar por autor");
                System.out.println("4. Listar todos los libros");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = libros.nextInt();
                libros.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = libros.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = libros.nextLine();
                        Libro nuevoLibro = new Libro(titulo, autor);
                        biblioteca.add(nuevoLibro);
                        System.out.println("Libro agregado con éxito.");
                        break;
                    case 2:
                        System.out.print("Ingrese el título a buscar: ");
                        String tituloBuscar = libros.nextLine();
                        boolean encontradoPorTitulo = false;
                        for (Libro libro : biblioteca) {
                            if (libro.getTitulo().equalsIgnoreCase(tituloBuscar)) {
                                System.out.println("Libro encontrado: " + libro.getTitulo() + " - " + libro.getAutor());
                                encontradoPorTitulo = true;
                                break;
                            }
                        }
                        if (!encontradoPorTitulo) {
                            System.out.println("Libro no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el autor a buscar: ");
                        String autorBuscar = libros.nextLine();
                        boolean encontradoPorAutor = false;
                        for (Libro libro : biblioteca) {
                            if (libro.getAutor().equalsIgnoreCase(autorBuscar)) {
                                System.out.println("Libro encontrado: " + libro.getTitulo() + " - " + libro.getAutor());
                                encontradoPorAutor = true;
                            }
                        }
                        if (!encontradoPorAutor) {
                            System.out.println("Libro no encontrado.");
                        }
                        break;
                    case 4:
                        System.out.println("Listado de todos los libros en la biblioteca:");
                        for (Libro libro : biblioteca) {
                            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
            }
        }
    }

