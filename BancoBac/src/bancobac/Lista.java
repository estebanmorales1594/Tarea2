package bancobac;

/**
 *
 * @author Esteban
 */
public class Lista {
    // atributos
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int size;

    /**
    * La clase Nodo es usada únicamente a nivel interno dentro de la lista
    * Tiene dos atributos: el dato y el enlace al siguiente nodo
    *
    */
    private class Nodo
    {

        private Object dato;
        private Nodo siguiente;

        public Nodo()
        {
            this.dato = null;
            this.siguiente = null;
        }

        public Nodo(Object inputDato)
        {
            this.dato = inputDato;
            this.siguiente = null;
        }

        public Object obtenerDato()
        {
            return dato;
        }

        public void establecerDato(Object dato)
        {
            this.dato = dato;
        }

        public Nodo obtenerSiguiente()
        {
            return siguiente;
        }

        public void establecerSiguiente(Nodo siguiente)
        {
            this.siguiente = siguiente;
        }
        
        public Nodo obtenerActual(){
            return this.nodoActual;
        }
        
        public Object getDatoActual(){
            Nodo n=this.obtenerActual();
            if(n.obtenerSiguiente()==null){
                throw new Exception();
            }
            this.nodoActual =n.obtenerSiguiente();
        }
    }

    // Métodos

    /**
    * Constructor predeterminado
    */
    public Lista()
    {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.size = 0;
    }

    /**
     * Construye una lista con base en otra lista
     * Nota: hacer deep-copy, no shallow copy
     */
     public Lista(Lista lista)
     {
         ...
     }

    /**
    * Construye una lista con base en un arreglo
    * @param arreglo the nodes to start with
    */
    public Lista(Object [] arreglo)
    {
        // Se invoca al constructor predeterminado
        this();

        if (arreglo.length > 0)
        {
            for (int i = 0; i < arreglo.length; i++) {
                this.agregar(arreglo[i]);
            }
        }
    }

    /**
    * Devuelve la representación en string de la lista
    */
    public String toString()
    {
        Nodo nodoActual = this.primerNodo;

        StringBuffer resultado = new StringBuffer();

        for (int i = 0; nodoActual != null; i++)
        {
            if (i > 0)
            {
                resultado.append(",");
            }
            Object dato = nodoActual.obtenerDato();

            resultado.append(dato == null ? "" : dato);
            nodoActual = nodoActual.obtenerSiguiente();
        }
        return resultado.toString();
    }

    /**
    * Agrega un nuevo elemento a la lista
    * @param elemento El elemento a agregar
    */
    public void agregar(Object elemento)
    {
        Nodo nodo = new Nodo(elemento);

        // caso de lista vacía
        if (this.primerNodo.obtenerDato() == null)
        {
            this.primerNodo = nodo;
            this.ultimoNodo = nodo;
            this.next= nodo:
            this.prev= nodo;
            
        }
        else
        {
            this.ultimoNodo.establecerSiguiente(node);
            this.ultimoNodo = nodo;
        }

        this.size++;
    }

    /**
    * Devuelve la posición de un elemento (en caso de encontrarlo)
    */
    
    public void imprimirLista(){
        Nodo n=primerNodo;
        if (primerNodo!=null){
            for(int i=0; i<this.size;i++){
                System.out.println(n.obtenerDato());
                n=n.obtenerSiguiente();
            }
        }
    }
    public int obtenerIndice(Object elemento)
    {
        Nodo nodoActual = this.primerNodo;
        int posicion = 0;
        boolean encontrado = false;

        for (; ; posicion++)
        {
            if (nodoActual == null)
            {
                break;
            }
            if (elemento.equals(nodoActual.obtenerDato()))
            {
                encontrado = true;
                break;
            }
            nodoActual = nodoActual.obtenerSiguiente();
        }
        if (!encontrado)
        {
            posicion = -1;
        }
        return posicion;
    }

    /**
    * Devuelve el tamaño de la lista
    * @return Número de elementos de la lista
    */
    public int size()
    {
        return this.size;
    }

    /**
    * Obtiene el elemento que está en la posición especificada por el parámetro
    * @param posicion Posición del elemento
    * @return Elemento en la posición especificada
    */
    public Object obtenerElementoEnPosicion(int posicion)
    {
        if (posicion >= this.size || posicion < 0)
        {
            return null;
        }
        Nodo nodoActual = this.primerNodo;
        for (int i = 0; i < posicion ; i++)
        {
            nodoActual = nodoActual.obtenerSiguiente();
        }
        return nodoActual.obtenerDato();
    }

    /**
    * Elimina un elemento de la lista
    */
    public void delete(Object elemento)
    {
        // Tarea: implementar
    }

    /**
    * Elimina todos los elementos de la lista
    */
    public void empty(){
        // implementar
    }
    
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.agregar(8);
        lista.agregar(6);
        lista.agregar(5);
        lista.imprimirLista();
        lista.agregar(2);
        lista.imprimirLista();
    }
}
