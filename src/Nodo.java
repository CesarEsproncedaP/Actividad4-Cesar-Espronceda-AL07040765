//Es la clase que representa el nodo del árbol binario de mi actividad, el cuál contiene un identificador o ID y un nombre.
public class Nodo {
    int id;
    String nombre;
    Nodo izquierda, derecha;

    /**
     * @param id Es el número identificador del empleado, es como una matrícula. 
     * @param nombre Como se puede inferir, es para el nombre del empleado.
     */
    Nodo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierda = null;
        this.derecha = null;
    }
}