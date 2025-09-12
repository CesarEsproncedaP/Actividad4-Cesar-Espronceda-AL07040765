/**
 * Clase que implementa un árbol binario para gestionar empleados.
 */
public class ArbolBinario {
    private Nodo raiz;

    /**
     * Inserta un nuevo empleado en el árbol binario.
     * @param id Identificador del empleado.
     * @param nombre Nombre del empleado.
     */
    public void insertar(String id, String nombre) {
        raiz = insertarRec(raiz, id, nombre);
    }

    /**
     * Método recursivo para insertar un nodo en el árbol.
     * @param nodo Nodo actual en la recursión.
     * @param id Identificador del empleado.
     * @param nombre Nombre del empleado.
     * @return Nodo actualizado.
     */
    private Nodo insertarRec(Nodo nodo, String id, String nombre) {
        if (nodo == null) {
            return new Nodo(id, nombre);
        }
        if (id.compareTo(nodo.id) < 0) {
            nodo.izquierda = insertarRec(nodo.izquierda, id, nombre);
        } else if (id.compareTo(nodo.id) > 0) {
            nodo.derecha = insertarRec(nodo.derecha, id, nombre);
        }
        return nodo;
    }

    /**
     * Busca un empleado por su ID en el árbol.
     * @param id Identificador del empleado.
     * @return Nombre del empleado o "No encontrado" si no existe.
     */
    public String buscar(String id) {
        return buscarRec(raiz, id);
    }

    /**
     * Método recursivo para buscar un empleado.
     * @param nodo Nodo actual en la recursión.
     * @param id Identificador del empleado.
     * @return Nombre del empleado o "No encontrado".
     */
    private String buscarRec(Nodo nodo, String id) {
        if (nodo == null) {
            return "No encontrado";
        }
        if (id.equals(nodo.id)) {
            return nodo.nombre;
        }
        if (id.compareTo(nodo.id) < 0) {
            return buscarRec(nodo.izquierda, id);
        }
        return buscarRec(nodo.derecha, id);
    }

    /**
     * Verifica si un ID existe en el árbol.
     * @param id Identificador del empleado.
     * @return true si el ID existe, false si no.
     */
    private boolean existe(String id) {
        return existeRec(raiz, id);
    }

    /**
     * Método recursivo para verificar si un ID existe.
     * @param nodo Nodo actual en la recursión.
     * @param id Identificador del empleado.
     * @return true si el ID existe, false si no.
     */
    private boolean existeRec(Nodo nodo, String id) {
        if (nodo == null) {
            return false;
        }
        if (id.equals(nodo.id)) {
            return true;
        }
        if (id.compareTo(nodo.id) < 0) {
            return existeRec(nodo.izquierda, id);
        }
        return existeRec(nodo.derecha, id);
    }

    /**
     * Elimina un empleado por su ID.
     * @param id Identificador del empleado.
     * @return true si el empleado fue eliminado, false si no se encontró.
     */
    public boolean eliminar(String id) {
        if (!existe(id)) {
            return false;
        }
        raiz = eliminarRec(raiz, id);
        return true;
    }

    /**
     * Método recursivo para eliminar un nodo.
     * @param nodo Nodo actual en la recursión.
     * @param id Identificador del empleado.
     * @return Nodo actualizado.
     */
    private Nodo eliminarRec(Nodo nodo, String id) {
        if (nodo == null) {
            return null;
        }
        if (id.compareTo(nodo.id) < 0) {
            nodo.izquierda = eliminarRec(nodo.izquierda, id);
        } else if (id.compareTo(nodo.id) > 0) {
            nodo.derecha = eliminarRec(nodo.derecha, id);
        } else {
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }
            Nodo sucesor = encontrarMin(nodo.derecha);
            nodo.id = sucesor.id;
            nodo.nombre = sucesor.nombre;
            nodo.derecha = eliminarRec(nodo.derecha, sucesor.id);
        }
        return nodo;
    }

    /**
     * Encuentra el nodo con el ID mínimo.
     * @param nodo Nodo actual.
     * @return Nodo con el ID mínimo.
     */
    private Nodo encontrarMin(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    /**
     * Imprime el árbol en recorrido preorden.
     */
    public void preorden() {
        System.out.println("Recorrido Preorden:");
        preordenRec(raiz);
        System.out.println();
    }

    /**
     * Método recursivo para recorrido preorden.
     * @param nodo Nodo actual.
     */
    private void preordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.println("[" + nodo.id + ": " + nodo.nombre + "]");
            preordenRec(nodo.izquierda);
            preordenRec(nodo.derecha);
        }
    }

    /**
     * Imprime el árbol en recorrido inorden.
     */
    public void inorden() {
        System.out.println("Recorrido Inorden:");
        inordenRec(raiz);
        System.out.println();
    }

    /**
     * Método recursivo para recorrido inorden.
     * @param nodo Nodo actual.
     */
    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierda);
            System.out.println("[" + nodo.id + ": " + nodo.nombre + "]");
            inordenRec(nodo.derecha);
        }
    }

    /**
     * Imprime el árbol en recorrido postorden.
     */
    public void postorden() {
        System.out.println("Recorrido Postorden:");
        postordenRec(raiz);
        System.out.println();
    }

    /**
     * Método recursivo para recorrido postorden.
     * @param nodo Nodo actual.
     */
    private void postordenRec(Nodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierda);
            postordenRec(nodo.derecha);
            System.out.println("[" + nodo.id + ": " + nodo.nombre + "]");
        }
    }
}