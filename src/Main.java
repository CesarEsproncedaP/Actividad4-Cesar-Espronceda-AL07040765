/**
 * Clase principal que prueba la funcionalidad del árbol binario.
 */
import java.util.Scanner;

//Esta claase "Main" es la que hace que se pruebeel programa del árbol binario. 
//Básicamente es el método principal que ejecuta las operaciones básicas tal como, eliminar, buscar e insertar,al igual maneja los tipos de recorridos.

public class Main {
    public static void main(String[] args) {
        ArbolBinario árbol = new ArbolBinario();
        Scanner scanner = new Scanner(System.in);

        // Se insertan los 150 empleados requeridos
        System.out.println("--- SISTEMA DE GESTIÓN DE EMPLEADOS ---");
        System.out.println("| Cargando 150 empleados...            |");
        System.out.println("----------------------------------------");
        
        // Primeros 50 empleados
        árbol.insertar("AL001", "Cesar Espronceda");
        árbol.insertar("AL002", "Aroa Guerra");
        árbol.insertar("AL003", "Daniel Gonzalez");
        árbol.insertar("AL004", "Omar Salas");
        árbol.insertar("AL005", "Andre Gignac");
        árbol.insertar("AL006", "Juan Brunetta");
        árbol.insertar("AL007", "Jesus Angulo");
        árbol.insertar("AL008", "Javier Aquino");
        árbol.insertar("AL009", "Fernando Gorriarán");
        árbol.insertar("AL010", "Nahuel Guzmán");
        árbol.insertar("AL011", "Sebastián Córdova");
        árbol.insertar("AL012", "Joaquim Pereira");
        árbol.insertar("AL013", "Nicolas Ibáñez");
        árbol.insertar("AL014", "Rafael Carioca");
        árbol.insertar("AL015", "German Berterame");
        árbol.insertar("AL016", "Sergio Canales");
        árbol.insertar("AL017", "Jesus Gallardo");
        árbol.insertar("AL018", "Santiago Mele");
        árbol.insertar("AL019", "Joaquin Moxica");
        árbol.insertar("AL020", "Maxi Meza");
        árbol.insertar("AL021", "Luis Romo");
        árbol.insertar("AL022", "Brandon Vazquez");
        árbol.insertar("AL023", "Franco Mastantuono");
        árbol.insertar("AL024", "Victor Guzman");
        árbol.insertar("AL025", "Kylian Mbappe");
        árbol.insertar("AL026", "Vini Jr");
        árbol.insertar("AL027", "Jude Bellingham");
        árbol.insertar("AL028", "Dani Carvajal");
        árbol.insertar("AL029", "Thibaut Courtois");
        árbol.insertar("AL030", "Federico Valverde");
        árbol.insertar("AL031", "Aurelien Tchouameni");
        árbol.insertar("AL032", "Rodrygo Goes");
        árbol.insertar("AL033", "Eder Militao");
        árbol.insertar("AL034", "Antonio Rudiger");
        árbol.insertar("AL035", "Bradley Barcola");
        árbol.insertar("AL036", "Vitinha Ferreira");
        árbol.insertar("AL037", "Achraf Hakimi");
        árbol.insertar("AL038", "Gianluigi Donnarumma");
        árbol.insertar("AL039", "Ousmane Dembele");
        árbol.insertar("AL040", "Joao Neves");
        árbol.insertar("AL041", "Zaire Emery");
        árbol.insertar("AL042", "Marquinhos Aoas");
        árbol.insertar("AL043", "Fabian Ruiz");
        árbol.insertar("AL044", "Nuno Mendes");
        árbol.insertar("AL045", "Erling Haaland");
        árbol.insertar("AL046", "Kevin De Bruyne");
        árbol.insertar("AL047", "Phil Foden");
        árbol.insertar("AL048", "Rodri Hernandez");
        árbol.insertar("AL049", "Ederson Moraes");
        árbol.insertar("AL050", "Ruben Dias");

        // Empleados del 51 al 100
        árbol.insertar("AL051", "Bernardo Silva");
        árbol.insertar("AL052", "Jack Grealish");
        árbol.insertar("AL053", "Josko Gvardiol");
        árbol.insertar("AL054", "Mateo Kovacic");
        árbol.insertar("AL055", "Bruno Fernandes");
        árbol.insertar("AL056", "Marcus Rashford");
        árbol.insertar("AL057", "Andre Onana");
        árbol.insertar("AL058", "Rasmus Hojlund");
        árbol.insertar("AL059", "Diogo Dalot");
        árbol.insertar("AL060", "Carlos Casemiro");
        árbol.insertar("AL061", "Kobbie Mainoo");
        árbol.insertar("AL062", "Lisandro Martínez");
        árbol.insertar("AL063", "Alejandro Garnacho");
        árbol.insertar("AL064", "Matthijs de Ligt");
        árbol.insertar("AL065", "Henry Martin");
        árbol.insertar("AL066", "Luis Malagon");
        árbol.insertar("AL067", "Alvaro Fidalgo");
        árbol.insertar("AL068", "Diego Valdes");
        árbol.insertar("AL069", "Jonathan dos Santos");
        árbol.insertar("AL070", "Julián Quiñones");
        árbol.insertar("AL071", "Kevin Alvarez");
        árbol.insertar("AL072", "Israel Reyes");
        árbol.insertar("AL073", "Cristian Calderon");
        árbol.insertar("AL074", "Brian Rodriguez");
        árbol.insertar("AL075", "Tiago Volpi");
        árbol.insertar("AL076", "Jean Meneses");
        árbol.insertar("AL077", "Alexis Vega");
        árbol.insertar("AL078", "Marco Farfan");
        árbol.insertar("AL079", "Marcel Ruiz");
        árbol.insertar("AL080", "Angel Correa");
        árbol.insertar("AL081", "Paulinho Dias");
        árbol.insertar("AL082", "Maximiliano Araujo");
        árbol.insertar("AL083", "Guido Pizarro");
        árbol.insertar("AL084", "Federico Pereira");
        árbol.insertar("AL085", "Robert Lewandowski");
        árbol.insertar("AL086", "Lamine Yamal");
        árbol.insertar("AL087", "Marc ter Stegen");
        árbol.insertar("AL088", "Pedri González");
        árbol.insertar("AL089", "Frenkie de Jong");
        árbol.insertar("AL090", "Raphinha Belloli");
        árbol.insertar("AL091", "Gavi Paez");
        árbol.insertar("AL092", "Jules Kounde");
        árbol.insertar("AL093", "Ronald Araujo");
        árbol.insertar("AL094", "Alejandro Balde");
        árbol.insertar("AL095", "Jesus Garza");
        árbol.insertar("AL096", "Juan Purata");
        árbol.insertar("AL097", "Romulo Swarg");
        árbol.insertar("AL098", "Osvaldo Rodriguez");
        árbol.insertar("AL099", "Rodrigo Aguirre");
        árbol.insertar("AL100", "Hector Moreno");

        // Empleados del 101 al 150
        árbol.insertar("AL101", "Stefan Medina");
        árbol.insertar("AL102", "Jordi Cortizo");
        árbol.insertar("AL103", "Eduardo Camavinga");
        árbol.insertar("AL104", "David Alaba");
        árbol.insertar("AL105", "Lucas Vazquez");
        árbol.insertar("AL106", "Goncalo Ramos");
        árbol.insertar("AL107", "Ozziel Herrera");
        árbol.insertar("AL108", "Jeremy Doku");
        árbol.insertar("AL109", "Kyle Walker");
        árbol.insertar("AL110", "John Stones");
        árbol.insertar("AL111", "Joshua Zirkzee");
        árbol.insertar("AL112", "Amad Diallo");
        árbol.insertar("AL113", "Christian Eriksen");
        árbol.insertar("AL114", "Ramon Juarez");
        árbol.insertar("AL115", "Nestor Araujo");
        árbol.insertar("AL116", "Javairo Dilrosun");
        árbol.insertar("AL117", "Brian Garcia");
        árbol.insertar("AL118", "Cesar Huerta");
        árbol.insertar("AL119", "Ferran Torres");
        árbol.insertar("AL120", "Ilkay Gundogan");
        árbol.insertar("AL121", "Dani Olmo");
        árbol.insertar("AL122", "Fernando Tapia");
        árbol.insertar("AL123", "Vladimir Loroña");
        árbol.insertar("AL124", "Edgar Games");
        árbol.insertar("AL125", "Oliver Torres");
        árbol.insertar("AL126", "Fran Garcia");
        árbol.insertar("AL127", "Brahim Diaz");
        árbol.insertar("AL128", "Lee Kang-in");
        árbol.insertar("AL129", "Matheus Nunes");
        árbol.insertar("AL130", "Mason Mount");
        árbol.insertar("AL131", "Richard Sanchez");
        árbol.insertar("AL132", "Diego Lainez");
        árbol.insertar("AL133", "Andreas Christensen");
        árbol.insertar("AL134", "Diego Reyes");
        árbol.insertar("AL135", "Jesus Corona");
        árbol.insertar("AL136", "Luka Modric");
        árbol.insertar("AL137", "Presnel Kimpembe");
        árbol.insertar("AL138", "Rico Lewis");
        árbol.insertar("AL139", "Antony Santos");
        árbol.insertar("AL140", "Erick Sanchez");
        árbol.insertar("AL141", "Isaias Violante");
        árbol.insertar("AL142", "Iñigo Martinez");
        árbol.insertar("AL143", "Eduardo Tercero");
        árbol.insertar("AL144", "Gerardo Arteaga");
        árbol.insertar("AL145", "Arda Guler");
        árbol.insertar("AL146", "Randal Kolo Muani");
        árbol.insertar("AL147", "Savinho Moreira");
        árbol.insertar("AL148", "Noussair Mazraoui");
        árbol.insertar("AL149", "Alejandro Zendejas");
        árbol.insertar("AL150", "Luis Quiñones");

        System.out.println("¡Se han cargado exitosamente 150 empleados en el código!\n");

        int opcion;
        do {
            // Se muestr el menú inicial
             System.out.println("------------------ MENÚ GESTIÓN DE EMPLEADOS --------------------");
            System.out.println("| 1. Mostrar recorridos del árbol (Preorden, Inorden, Postorden)|");
            System.out.println("| 2. Buscar empleado por ID en árbol                            |");
            System.out.println("| 3. Eliminar empleado por ID                                   |");
            System.out.println("| 4. Insertar nuevo empleado                                    |");
            System.out.println("| 5. Salir                                                      |");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("Elija una opción (1-5): ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            //Por medio del número que el usuario ingrese se ejecuta una de las siguientes opciones
            switch (opcion) {
                case 1:
                    System.out.println("\n--- RECORRIDOS DEL ÁRBOL ---");
                    árbol.preorden();
                    árbol.inorden();
                    árbol.postorden();
                    System.out.println("--- Fin de recorridos ---\n");
                    break;
                case 2:
                    System.out.print("Ingrese el ID a buscar: ");
                    String idBuscar = scanner.nextLine();
                    System.out.println("Resultado: " + árbol.buscar(idBuscar));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Ingrese el ID a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    árbol.eliminar(idEliminar);
                    System.out.println("Empleado eliminado. Árbol actualizado (Inorden):");
                    árbol.inorden();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Ingrese ID del nuevo empleado: ");
                    String idNuevo = scanner.nextLine();
                    System.out.print("Ingrese nombre del nuevo empleado: ");
                    String nombreNuevo = scanner.nextLine();
                    árbol.insertar(idNuevo, nombreNuevo);
                    System.out.println("Nuevo empleado insertado. Árbol actualizado (Inorden):");
                    árbol.inorden();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema! Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, eliga una opción del 1 al 5.\n");
            }
        } while (opcion != 5);

        scanner.close();
    }
}