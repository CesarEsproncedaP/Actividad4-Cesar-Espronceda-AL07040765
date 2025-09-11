//Lo que hace esta clase es que con el árbol binario se búbusca a los empleados porsu ID. 
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

    /**
     * Método  recursivo para buscar un nodo por el ID.
     * @param nodo Es el nodo actual de la recursión.
     * @param id Es el numero identificador del empleado que se esta buscando.
     * @return Da de retorno el nodo encontrado o null en caso de que no se encuentre dicho ID.
     */
    private Nodo buscarRec(Nodo nodo, int id) {
        if (nodo == null || nodo.id == id) {
            return nodo;
        }
        if (id < nodo.id) {
            return buscarRec(nodo.izquierda, id);
        }
        return buscarRec(nodo.derecha, id);
    }

    /**
     * Elimina del árbol a un empleado por su ID.
     * @param id Es el numero identificador del empleado que se desea eliminar.
     */
    void eliminar(int id) {
        raíz = eliminarRec(raíz, id);
    }

    /**
     * Método recursivo para eliminar un nodo por el ID.
     * @param nodo Es el nodo actual de la recursión.
     * @param id Es el numero identificador del empleado que se esta buscando.
     * @return Es el nuevo nodo después de eliminar el ID.
     */
    private Nodo eliminarRec(Nodo nodo, int id) {
        if (nodo == null) {
            return null;
        }
        if (id < nodo.id) {
            nodo.izquierda = eliminarRec(nodo.izquierda, id);
        } else if (id > nodo.id) {
            nodo.derecha = eliminarRec(nodo.derecha, id);
        } else {
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }
            Nodo mínimo = encontrarMínimo(nodo.derecha);
            nodo.id = mínimo.id;
            nodo.nombre = mínimo.nombre;
            nodo.derecha = eliminarRec(nodo.derecha, mínimo.id);
        }
        return nodo;
    }

    /**
     * Encuentra el nodo con el ID mínimo en un subárbol.
     * @param nodo Raíz del subárbol donde buscar.
     * @return Nodo con el ID mínimo.
     */
    private Nodo encontrarMínimo(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    //Realiza un recorrido preorden del árbol (raíz, izquierda, derecha).
    void preorden() {
        System.out.print("Preorden: ");
        preordenRec(raíz);
        System.out.println();
    }

    /**
     * Método recursivo para el recorrido preorden.
     * @param nodo Nodo actual en la recursión.
     */
    private void preordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print("[" + nodo.id + ": " + nodo.nombre + "] ");
            preordenRec(nodo.izquierda);
            preordenRec(nodo.derecha);
        }
    }

    //Realiza un recorrido inorden del árbol (izquierda, raíz, derecha).
    void inorden() {
        System.out.print("Inorden: ");
        inordenRec(raíz);
        System.out.println();
    }

    /**
     * Método recursivo para el recorrido inorden.
     * @param nodo Nodo actual en la recursión.
     */
    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierda);
            System.out.print("[" + nodo.id + ": " + nodo.nombre + "] ");
            inordenRec(nodo.derecha);
        }
    }

    //Realiza un recorrido postorden del árbol (izquierda, derecha, raíz).
    void postorden() {
        System.out.print("Postorden: ");
        postordenRec(raíz);
        System.out.println();
    }

    /**
     * Método recursivo para el recorrido postorden.
     * @param nodo Nodo actual en la recursión.
     */
    private void postordenRec(Nodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierda);
            postordenRec(nodo.derecha);
            System.out.print("[" + nodo.id + ": " + nodo.nombre + "] ");
        }
    }
}