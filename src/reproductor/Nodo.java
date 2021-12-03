package reproductor;

public class Nodo {
    private Cancion dato;
    private Nodo siguiente;
    private Nodo anterior;
   
    public Nodo(){
        dato = null;
        siguiente = null;
        anterior = null;
    }

    public Cancion getDato() {
        return dato;
    }

    public void setDato(Cancion dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
