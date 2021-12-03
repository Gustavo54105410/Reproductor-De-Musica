package reproductor;

public class ListaDeCanciones {
    private Nodo nodoInicial, nodoFinal;
    private Nodo nodoAux;
    private int size;


    public void añadirCancion(String nombreCancion){
        Nodo nuevoNodo = new Nodo();
        Cancion cancion = new Cancion(nombreCancion);
        nuevoNodo.setDato(cancion);
        nodoAux = nodoInicial;
        if(nodoAux == null){
            nodoInicial = nuevoNodo;
            nodoFinal = nuevoNodo;
            size++;
            System.out.println("SE AGREGO LA PRIMER CANCION");
        }else{
            System.out.println("SE AGREGO LA CANCION SIGUIENTE");
            nuevoNodo.setAnterior(nodoFinal);
            nodoFinal.setSiguiente(nuevoNodo);
            nodoFinal = nuevoNodo;
            size++;
        }
    }
    
    public String avanzar(){
        if(nodoAux.getSiguiente() != null){
            nodoAux = nodoAux.getSiguiente();
        }else{
            return "final";
        }
        return nodoAux.getDato().getNombre();
    }
    
    public String retroceder(){
        if(nodoAux.getAnterior() != null){
            nodoAux = nodoAux.getAnterior();
        }else{
            return "inicial";
        }
        return nodoAux.getDato().getNombre();
    }
    
    public Cancion buscarCancion(String dato){
        nodoAux = nodoInicial;
        
        do{
            if(nodoAux != null){
                if(nodoAux.getDato().getNombre().equals(dato)){
                    System.out.println(nodoAux.getDato().getNombre());
                    return nodoAux.getDato();
                }
                nodoAux = nodoAux.getSiguiente();
            }
        }while(nodoAux != null);
        
        return nodoAux.getDato();
    }
    
    public String recorrerLista(){

        if(nodoAux == null && nodoInicial != null){    //Se quito al principio del if -->  
            nodoAux = nodoInicial;
            System.out.println("PRIMER AGREGADO");
            return nodoAux.getDato().getNombre();
        }else{
            if(nodoAux != null){
                if(nodoAux.getSiguiente() != null){
                    System.out.println("SEGUNDO AGREGADO");
                    nodoAux = nodoAux.getSiguiente();
                    return nodoAux.getDato().getNombre();
                }else{
                    System.out.println("NULO");
                    return null;
                }
            }else{
                System.out.println("NULO 2");
                return null;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
