/**
 * Lo que hace esta clase es que con el árbol binario se búbusca a los empleados porsu ID. 
 */
public class ArbolBinario {
    Nodo raíz;

    /**
     * @param id Es el número identificador del empleado, es como una matrícula. 
     * @param nombre Como se puede inferir, es para el nombre del empleado.
     */
    void insertar(int id, String nombre) {
        raíz = insertarRec(raíz, id, nombre);
    }

    /**
     * @param nodo Es el nodo en el que se encuentra.
     * @param id Es el número identificador del empleado, es como una matrícula. 
     * @param nombre Es para el nombre del empleado.
     * @return Nodo nuevo.
     */
    private Nodo insertarRec(Nodo nodo, int id, String nombre) {
        if (nodo == null) {
            return new Nodo(id, nombre);
        }
        if (id < nodo.id) {
            nodo.izquierda = insertarRec(nodo.izquierda, id, nombre);
        } else if (id > nodo.id) {
            nodo.derecha = insertarRec(nodo.derecha, id, nombre);
        }
        return nodo;
    }
    /**
    * Lo que se hace aquí básicamente es buscar a un empleado por su ID en el árbol.
    * @param id Es el número identificador del empleado a buscar.
    * @return Cuando se encuebtra un empleado aparece su nombre, cuando no aparece "No encontrado".
    */
    String buscar(int id) {
        Nodo resultado = buscarRec(raíz, id);
        return resultado != null ? resultado.nombre : "No encontrado";
        }
    //Falta muchas cosas en esta clase todavia pero es lo que pude avanzar por hoy
}