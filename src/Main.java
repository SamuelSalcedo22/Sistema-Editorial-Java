import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n==============================");
            System.out.println("   EDITORIAL - MENU PRINCIPAL");
            System.out.println("==============================");
            System.out.println("  1. Registrar Libro");
            System.out.println("  2. Registrar Disco");
            System.out.println("  3. Registrar Video");
            System.out.println("  4. Salir");
            System.out.println("==============================");
            System.out.print("Opcion: ");
            int opcion = Integer.parseInt(sc.nextLine().trim());

            switch (opcion) {
                case 1:
                    Libro libro = ingresarLibro(sc);
                    System.out.println("\n--- Datos registrados ---");
                    libro.mostrar();
                    break;
                case 2:
                    Disco disco = ingresarDisco(sc);
                    System.out.println("\n--- Datos registrados ---");
                    disco.mostrar();
                    break;
                case 3:
                    Video video = ingresarVideo(sc);
                    System.out.println("\n--- Datos registrados ---");
                    video.mostrar();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        sc.close();
    }

    static Libro ingresarLibro(Scanner sc) {
        System.out.println("\n>> Ingreso de LIBRO");
        System.out.print("Titulo        : "); String titulo = sc.nextLine();
        System.out.print("Precio        : "); double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Num. paginas  : "); int paginas = Integer.parseInt(sc.nextLine());
        System.out.print("Anio public.  : "); int anio = Integer.parseInt(sc.nextLine());
        return new Libro(paginas, anio, titulo, precio);
    }

    static Disco ingresarDisco(Scanner sc) {
        System.out.println("\n>> Ingreso de DISCO");
        System.out.print("Titulo        : "); String titulo = sc.nextLine();
        System.out.print("Precio        : "); double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Duracion (min): "); float min = Float.parseFloat(sc.nextLine());
        return new Disco(min, titulo, precio);
    }

    static Video ingresarVideo(Scanner sc) {
        System.out.println("\n>> Ingreso de VIDEO");
        System.out.print("Titulo         : "); String titulo = sc.nextLine();
        System.out.print("Precio         : "); double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Duracion (horas): "); float horas = Float.parseFloat(sc.nextLine());
        System.out.println("Idioma:");
        System.out.println("  1. Espanol");
        System.out.println("  2. Ingles");
        System.out.println("  3. Portugues");
        System.out.print("Opcion: ");
        int opIdioma = Integer.parseInt(sc.nextLine());
        Idioma idioma;
        switch (opIdioma) {
            case 2:  idioma = Idioma.INGLES;    break;
            case 3:  idioma = Idioma.PORTUGUES; break;
            default: idioma = Idioma.ESPAÑOL;   break;
        }
        return new Video(horas, idioma, titulo, precio);
    }
}