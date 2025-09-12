// Esta clase es la que implementa la lista de empleados para la búsqueda.
public class ListaEmpleados {
    String[] nombres = new String[150]; //Se limita a los 150 empleados iniciales.
    String[] ids = new String[150]; //Se puso String en lugar de int para que soportara el "AL" al inicio de la matrícula.
    int contador = 0;

    /**
     *  Se agrega un empleado a la lista.
     * @param id Es el número identificador del empleado, tal como una matrícula. 
     * @param nombre Es el nombre del empleado.
     */
    void agregar(String id, String nombre) {
        if (contador < 150) {
            ids[contador] = id;
            nombres[contador] = nombre;
            contador++;
        }
    }

    /**
     * Busca a un empleado por su ID en la lista.
     * @param id Es el número identificador del empleado, tal como una matrícula. 
     * @return Regresa el nombre del empleado si se encuentra o "No encontrado" en caso de que no se encuentre dicho ID.
     */
    String buscar(String id) {
        for (int i = 0; i < contador; i++) {
            if (ids[i].equals(id)) {
                return nombres[i];
            }
        }
        return "No encontrado";
    }
}