/**
 * Clase principal que prueba la funcionalidad del árbol binario.
 */
import java.util.Scanner;

//Esta claase "Main" es la que hace que se pruebeel programa del árbol binario. 
//Básicamente es el método principal que ejecuta las operaciones básicas tal como, eliminar, buscar e insertar,al igual maneja los tipos de recorridos.

public class Main {
    public static void main(String[] args) {
        ArbolBinario árbol = new ArbolBinario();
        ListaEmpleados lista = new ListaEmpleados();
        Scanner scanner = new Scanner(System.in);

        // Se insertan los 150 empleados requeridos
        System.out.println("--- SISTEMA DE GESTIÓN DE EMPLEADOS ---");
        System.out.println("| Cargando 150 empleados...            |");
        System.out.println("----------------------------------------");
        
        // Primeros 50 empleados
        árbol.insertar("AL001", "Cesar Espronceda");
        lista.agregar("AL001", "Cesar Espronceda");
        árbol.insertar("AL002", "Aroa Guerra");
        lista.agregar("AL002", "Aroa Guerra");
        árbol.insertar("AL003", "Daniel Gonzalez");
        lista.agregar("AL003", "Daniel Gonzalez");
        árbol.insertar("AL004", "Omar Salas");
        lista.agregar("AL004", "Omar Salas");
        árbol.insertar("AL005", "Andre Gignac");
        lista.agregar("AL005", "Andre Gignac");
        árbol.insertar("AL006", "Juan Brunetta");
        lista.agregar("AL006", "Juan Brunetta");
        árbol.insertar("AL007", "Jesus Angulo");
        lista.agregar("AL007", "Jesus Angulo");
        árbol.insertar("AL008", "Javier Aquino");
        lista.agregar("AL008", "Javier Aquino");
        árbol.insertar("AL009", "Fernando Gorriaran");
        lista.agregar("AL009", "Fernando Gorriaran");
        árbol.insertar("AL010", "Nahuel Guzman");
        lista.agregar("AL010", "Nahuel Guzman");
        árbol.insertar("AL011", "Sebastian Cordova");
        lista.agregar("AL011", "Sebastian Cordova");
        árbol.insertar("AL012", "Joaquim Pereira");
        lista.agregar("AL012", "Joaquim Pereira");
        árbol.insertar("AL013", "Nicolas Ibanez");
        lista.agregar("AL013", "Nicolas Ibanez");
        árbol.insertar("AL014", "Rafael Carioca");
        lista.agregar("AL014", "Rafael Carioca");
        árbol.insertar("AL015", "German Berterame");
        lista.agregar("AL015", "German Berterame");
        árbol.insertar("AL016", "Sergio Canales");
        lista.agregar("AL016", "Sergio Canales");
        árbol.insertar("AL017", "Jesus Gallardo");
        lista.agregar("AL017", "Jesus Gallardo");
        árbol.insertar("AL018", "Santiago Mele");
        lista.agregar("AL018", "Santiago Mele");
        árbol.insertar("AL019", "Joaquin Moxica");
        lista.agregar("AL019", "Joaquin Moxica");
        árbol.insertar("AL020", "Maxi Meza");
        lista.agregar("AL020", "Maxi Meza");
        árbol.insertar("AL021", "Luis Romo");
        lista.agregar("AL021", "Luis Romo");
        árbol.insertar("AL022", "Brandon Vazquez");
        lista.agregar("AL022", "Brandon Vazquez");
        árbol.insertar("AL023", "Franco Mastantuono");
        lista.agregar("AL023", "Franco Mastantuono");
        árbol.insertar("AL024", "Victor Guzman");
        lista.agregar("AL024", "Victor Guzman");
        árbol.insertar("AL025", "Kylian Mbappe"); //Empleado número 25
        lista.agregar("AL025", "Kylian Mbappe");
        árbol.insertar("AL026", "Vini Jr");
        lista.agregar("AL026", "Vini Jr");
        árbol.insertar("AL027", "Jude Bellingham");
        lista.agregar("AL027", "Jude Bellingham");
        árbol.insertar("AL028", "Dani Carvajal");
        lista.agregar("AL028", "Dani Carvajal");
        árbol.insertar("AL029", "Thibaut Courtois");
        lista.agregar("AL029", "Thibaut Courtois");
        árbol.insertar("AL030", "Federico Valverde");
        lista.agregar("AL030", "Federico Valverde");
        árbol.insertar("AL031", "Aurelien Tchouameni");
        lista.agregar("AL031", "Aurelien Tchouameni");
        árbol.insertar("AL032", "Rodrygo Goes");
        lista.agregar("AL032", "Rodrygo Goes");
        árbol.insertar("AL033", "Eder Militao");
        lista.agregar("AL033", "Eder Militao");
        árbol.insertar("AL034", "Antonio Rudiger");
        lista.agregar("AL034", "Antonio Rudiger");
        árbol.insertar("AL035", "Bradley Barcola");
        lista.agregar("AL035", "Bradley Barcola");
        árbol.insertar("AL036", "Vitinha Ferreira");
        lista.agregar("AL036", "Vitinha Ferreira");
        árbol.insertar("AL037", "Achraf Hakimi");
        lista.agregar("AL037", "Achraf Hakimi");
        árbol.insertar("AL038", "Gianluigi Donnarumma");
        lista.agregar("AL038", "Gianluigi Donnarumma");
        árbol.insertar("AL039", "Ousmane Dembele");
        lista.agregar("AL039", "Ousmane Dembele");
        árbol.insertar("AL040", "Joao Neves");
        lista.agregar("AL040", "Joao Neves");
        árbol.insertar("AL041", "Zaire Emery");
        lista.agregar("AL041", "Zaire Emery");
        árbol.insertar("AL042", "Marquinhos Aoas");
        lista.agregar("AL042", "Marquinhos Aoas");
        árbol.insertar("AL043", "Fabian Ruiz");
        lista.agregar("AL043", "Fabian Ruiz");
        árbol.insertar("AL044", "Nuno Mendes");
        lista.agregar("AL044", "Nuno Mendes");
        árbol.insertar("AL045", "Erling Haaland");
        lista.agregar("AL045", "Erling Haaland");
        árbol.insertar("AL046", "Kevin De Bruyne");
        lista.agregar("AL046", "Kevin De Bruyne");
        árbol.insertar("AL047", "Phil Foden");
        lista.agregar("AL047", "Phil Foden");
        árbol.insertar("AL048", "Rodri Hernandez");
        lista.agregar("AL048", "Rodri Hernandez");
        árbol.insertar("AL049", "Ederson Moraes");
        lista.agregar("AL049", "Ederson Moraes");
        árbol.insertar("AL050", "Ruben Dias");
        lista.agregar("AL050", "Ruben Dias");

        // Empleados del 51 al 100
        árbol.insertar("AL051", "Bernardo Silva");
        lista.agregar("AL051", "Bernardo Silva");
        árbol.insertar("AL052", "Jack Grealish");
        lista.agregar("AL052", "Jack Grealish");
        árbol.insertar("AL053", "Josko Gvardiol");
        lista.agregar("AL053", "Josko Gvardiol");
        árbol.insertar("AL054", "Mateo Kovacic");
        lista.agregar("AL054", "Mateo Kovacic");
        árbol.insertar("AL055", "Bruno Fernandes");
        lista.agregar("AL055", "Bruno Fernandes");
        árbol.insertar("AL056", "Marcus Rashford");
        lista.agregar("AL056", "Marcus Rashford");
        árbol.insertar("AL057", "Andre Onana");
        lista.agregar("AL057", "Andre Onana");
        árbol.insertar("AL058", "Rasmus Hojlund");
        lista.agregar("AL058", "Rasmus Hojlund");
        árbol.insertar("AL059", "Diogo Dalot");
        lista.agregar("AL059", "Diogo Dalot");
        árbol.insertar("AL060", "Carlos Casemiro");
        lista.agregar("AL060", "Carlos Casemiro");
        árbol.insertar("AL061", "Kobbie Mainoo");
        lista.agregar("AL061", "Kobbie Mainoo");
        árbol.insertar("AL062", "Lisandro Martinez");
        lista.agregar("AL062", "Lisandro Martinez");
        árbol.insertar("AL063", "Alejandro Garnacho");
        lista.agregar("AL063", "Alejandro Garnacho");
        árbol.insertar("AL064", "Matthijs de Ligt");
        lista.agregar("AL064", "Matthijs de Ligt");
        árbol.insertar("AL065", "Henry Martin");
        lista.agregar("AL065", "Henry Martin");
        árbol.insertar("AL066", "Luis Malagon");
        lista.agregar("AL066", "Luis Malagon");
        árbol.insertar("AL067", "Alvaro Fidalgo");
        lista.agregar("AL067", "Alvaro Fidalgo");
        árbol.insertar("AL068", "Diego Valdes");
        lista.agregar("AL068", "Diego Valdes");
        árbol.insertar("AL069", "Jonathan dos Santos");
        lista.agregar("AL069", "Jonathan dos Santos");
        árbol.insertar("AL070", "Julian Quiñones");
        lista.agregar("AL070", "Julian Quiñones");
        árbol.insertar("AL071", "Kevin Alvarez");
        lista.agregar("AL071", "Kevin Alvarez");
        árbol.insertar("AL072", "Israel Reyes");
        lista.agregar("AL072", "Israel Reyes");
        árbol.insertar("AL073", "Cristian Calderon");
        lista.agregar("AL073", "Cristian Calderon");
        árbol.insertar("AL074", "Brian Rodriguez");
        lista.agregar("AL074", "Brian Rodriguez");
        árbol.insertar("AL075", "Tiago Volpi"); //Empleado número 75
        lista.agregar("AL075", "Tiago Volpi");
        árbol.insertar("AL076", "Jean Meneses");
        lista.agregar("AL076", "Jean Meneses");
        árbol.insertar("AL077", "Alexis Vega");
        lista.agregar("AL077", "Alexis Vega");
        árbol.insertar("AL078", "Marco Farfan");
        lista.agregar("AL078", "Marco Farfan");
        árbol.insertar("AL079", "Marcel Ruiz");
        lista.agregar("AL079", "Marcel Ruiz");
        árbol.insertar("AL080", "Angel Correa");
        lista.agregar("AL080", "Angel Correa");
        árbol.insertar("AL081", "Paulinho Dias");
        lista.agregar("AL081", "Paulinho Dias");
        árbol.insertar("AL082", "Maximiliano Araujo");
        lista.agregar("AL082", "Maximiliano Araujo");
        árbol.insertar("AL083", "Guido Pizarro");
        lista.agregar("AL083", "Guido Pizarro");
        árbol.insertar("AL084", "Federico Pereira");
        lista.agregar("AL084", "Federico Pereira");
        árbol.insertar("AL085", "Robert Lewandowski");
        lista.agregar("AL085", "Robert Lewandowski");
        árbol.insertar("AL086", "Lamine Yamal");
        lista.agregar("AL086", "Lamine Yamal");
        árbol.insertar("AL087", "Marc ter Stegen");
        lista.agregar("AL087", "Marc ter Stegen");
        árbol.insertar("AL088", "Pedri Gonzalez");
        lista.agregar("AL088", "Pedri Gonzalez");
        árbol.insertar("AL089", "Frenkie de Jong");
        lista.agregar("AL089", "Frenkie de Jong");
        árbol.insertar("AL090", "Raphinha Belloli");
        lista.agregar("AL090", "Raphinha Belloli");
        árbol.insertar("AL091", "Gavi Paez");
        lista.agregar("AL091", "Gavi Paez");
        árbol.insertar("AL092", "Jules Kounde");
        lista.agregar("AL092", "Jules Kounde");
        árbol.insertar("AL093", "Ronald Araujo");
        lista.agregar("AL093", "Ronald Araujo");
        árbol.insertar("AL094", "Alejandro Balde");
        lista.agregar("AL094", "Alejandro Balde");
        árbol.insertar("AL095", "Jesus Garza");
        lista.agregar("AL095", "Jesus Garza");
        árbol.insertar("AL096", "Juan Purata");
        lista.agregar("AL096", "Juan Purata");
        árbol.insertar("AL097", "Romulo Swarg");
        lista.agregar("AL097", "Romulo Swarg");
        árbol.insertar("AL098", "Osvaldo Rodriguez");
        lista.agregar("AL098", "Osvaldo Rodriguez");
        árbol.insertar("AL099", "Rodrigo Aguirre");
        lista.agregar("AL099", "Rodrigo Aguirre");
        árbol.insertar("AL100", "Hector Moreno");
        lista.agregar("AL100", "Hector Moreno");

        // Empleados del 101 al 150
        árbol.insertar("AL101", "Stefan Medina");
        lista.agregar("AL101", "Stefan Medina");
        árbol.insertar("AL102", "Jordi Cortizo");
        lista.agregar("AL102", "Jordi Cortizo");
        árbol.insertar("AL103", "Eduardo Camavinga");
        lista.agregar("AL103", "Eduardo Camavinga");
        árbol.insertar("AL104", "David Alaba");
        lista.agregar("AL104", "David Alaba");
        árbol.insertar("AL105", "Lucas Vazquez");
        lista.agregar("AL105", "Lucas Vazquez");
        árbol.insertar("AL106", "Goncalo Ramos");
        lista.agregar("AL106", "Goncalo Ramos");
        árbol.insertar("AL107", "Ozziel Herrera");
        lista.agregar("AL107", "Ozziel Herrera");
        árbol.insertar("AL108", "Jeremy Doku");
        lista.agregar("AL108", "Jeremy Doku");
        árbol.insertar("AL109", "Kyle Walker");
        lista.agregar("AL109", "Kyle Walker");
        árbol.insertar("AL110", "John Stones");
        lista.agregar("AL110", "John Stones");
        árbol.insertar("AL111", "Joshua Zirkzee");
        lista.agregar("AL111", "Joshua Zirkzee");
        árbol.insertar("AL112", "Amad Diallo");
        lista.agregar("AL112", "Amad Diallo");
        árbol.insertar("AL113", "Christian Eriksen");
        lista.agregar("AL113", "Christian Eriksen");
        árbol.insertar("AL114", "Ramon Juarez");
        lista.agregar("AL114", "Ramon Juarez");
        árbol.insertar("AL115", "Nestor Araujo");
        lista.agregar("AL115", "Nestor Araujo");
        árbol.insertar("AL116", "Javairo Dilrosun");
        lista.agregar("AL116", "Javairo Dilrosun");
        árbol.insertar("AL117", "Brian Garcia");
        lista.agregar("AL117", "Brian Garcia");
        árbol.insertar("AL118", "Cesar Huerta");
        lista.agregar("AL118", "Cesar Huerta");
        árbol.insertar("AL119", "Ferran Torres");
        lista.agregar("AL119", "Ferran Torres");
        árbol.insertar("AL120", "Ilkay Gundogan");
        lista.agregar("AL120", "Ilkay Gundogan");
        árbol.insertar("AL121", "Dani Olmo");
        lista.agregar("AL121", "Dani Olmo");
        árbol.insertar("AL122", "Fernando Tapia");
        lista.agregar("AL122", "Fernando Tapia");
        árbol.insertar("AL123", "Vladimir Lorona");
        lista.agregar("AL123", "Vladimir Lorona");
        árbol.insertar("AL124", "Edgar Games");
        lista.agregar("AL124", "Edgar Games");
        árbol.insertar("AL125", "Oliver Torres"); //Empleado número 125
        lista.agregar("AL125", "Oliver Torres");
        árbol.insertar("AL126", "Fran Garcia");
        lista.agregar("AL126", "Fran Garcia");
        árbol.insertar("AL127", "Brahim Diaz");
        lista.agregar("AL127", "Brahim Diaz");
        árbol.insertar("AL128", "Lee Kang-in");
        lista.agregar("AL128", "Lee Kang-in");
        árbol.insertar("AL129", "Matheus Nunes");
        lista.agregar("AL129", "Matheus Nunes");
        árbol.insertar("AL130", "Mason Mount");
        lista.agregar("AL130", "Mason Mount");
        árbol.insertar("AL131", "Richard Sanchez");
        lista.agregar("AL131", "Richard Sanchez");
        árbol.insertar("AL132", "Diego Lainez");
        lista.agregar("AL132", "Diego Lainez");
        árbol.insertar("AL133", "Andreas Christensen");
        lista.agregar("AL133", "Andreas Christensen");
        árbol.insertar("AL134", "Diego Reyes");
        lista.agregar("AL134", "Diego Reyes");
        árbol.insertar("AL135", "Jesus Corona");
        lista.agregar("AL135", "Jesus Corona");
        árbol.insertar("AL136", "Luka Modric");
        lista.agregar("AL136", "Luka Modric");
        árbol.insertar("AL137", "Presnel Kimpembe");
        lista.agregar("AL137", "Presnel Kimpembe");
        árbol.insertar("AL138", "Rico Lewis");
        lista.agregar("AL138", "Rico Lewis");
        árbol.insertar("AL139", "Antony Santos");
        lista.agregar("AL139", "Antony Santos");
        árbol.insertar("AL140", "Erick Sanchez");
        lista.agregar("AL140", "Erick Sanchez");
        árbol.insertar("AL141", "Isaias Violante");
        lista.agregar("AL141", "Isaias Violante");
        árbol.insertar("AL142", "Inigo Martinez");
        lista.agregar("AL142", "Inigo Martinez");
        árbol.insertar("AL143", "Eduardo Tercero");
        lista.agregar("AL143", "Eduardo Tercero");
        árbol.insertar("AL144", "Gerardo Arteaga");
        lista.agregar("AL144", "Gerardo Arteaga");
        árbol.insertar("AL145", "Arda Guler");
        lista.agregar("AL145", "Arda Guler");
        árbol.insertar("AL146", "Randal Kolo Muani");
        lista.agregar("AL146", "Randal Kolo Muani");
        árbol.insertar("AL147", "Savinho Moreira");
        lista.agregar("AL147", "Savinho Moreira");
        árbol.insertar("AL148", "Noussair Mazraoui");
        lista.agregar("AL148", "Noussair Mazraoui");
        árbol.insertar("AL149", "Alejandro Zendejas");
        lista.agregar("AL149", "Alejandro Zendejas");
        árbol.insertar("AL150", "Luis Quinones");
        lista.agregar("AL150", "Luis Quinones");

        System.out.println("¡Se han cargado exitosamente 150 empleados en el código!\n");

        int opcion = 0;
        do {
            // Se muestr el menú inicial
            System.out.println("-------------------- MENÚ GESTIÓN DE EMPLEADOS ----------------------");
            System.out.println("| 1. Mostrar recorridos del árbol (Preorden, Inorden, Postorden)    |");
            System.out.println("| 2. Buscar empleado por ID en árbol                                |");
            System.out.println("| 3. Eliminar empleado por ID                                       |");
            System.out.println("| 4. Insertar nuevo empleado                                        |");
            System.out.println("| 5. Comparacion de tiempo entre árbol binario y busqueda secuencial|");
            System.out.println("| 6. Salir                                                          |");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Elija una opción (1-6): ");
            
            try {
                String entrada = scanner.nextLine();
                opcion = Integer.parseInt(entrada);

                // Validar rango de la opción
                if (opcion < 1 || opcion > 6) {
                    System.out.println("Error: La opción debe estar entre 1 y 6.\n");
                    continue;
                }

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
                        if (árbol.eliminar(idEliminar)) {
                            System.out.println("Empleado eliminado. Árbol actualizado (Inorden):");
                            árbol.inorden();
                        } else {
                            System.out.println("ID no encontrado.\n");
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.print("Ingrese ID del nuevo empleado: ");
                        String idNuevo = scanner.nextLine();
                        System.out.print("Ingrese nombre del nuevo empleado: ");
                        String nombreNuevo = scanner.nextLine();
                        árbol.insertar(idNuevo, nombreNuevo);
                        lista.agregar(idNuevo, nombreNuevo);
                        System.out.println("Nuevo empleado insertado. Árbol actualizado (Inorden):");
                        árbol.inorden();
                        System.out.println();
                        break;
                    case 5:
                        System.out.print("Ingrese el ID para comparar tiempos de búsqueda: ");
                        String idComparacion = scanner.nextLine();
                        
                        // Tiempo para búsqueda en árbol
                        long inicioArbol = System.nanoTime();
                        String resultadoArbol = árbol.buscar(idComparacion);
                        long finArbol = System.nanoTime();
                        long tiempoArbol = finArbol - inicioArbol;

                        // Tiempo para búsqueda en lista secuencial
                        long inicioLista = System.nanoTime();
                        String resultadoLista = lista.buscar(idComparacion);
                        long finLista = System.nanoTime();
                        long tiempoLista = finLista - inicioLista;

                        System.out.println("Resultado en árbol: " + resultadoArbol);
                        System.out.println("Tiempo en árbol: " + tiempoArbol + " nanosegundos");
                        System.out.println("Resultado en lista secuencial: " + resultadoLista);
                        System.out.println("Tiempo en lista secuencial: " + tiempoLista + " nanosegundos");
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, porfavor ingresa un número válido (del 1 al 6).\n");
            }
        } while (opcion != 6);

        scanner.close();
    }
}