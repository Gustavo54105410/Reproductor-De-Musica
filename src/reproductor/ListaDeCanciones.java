package reproductor;

public class ListaDeCanciones {
    private Nodo nodoInicial, nodoFinal;
    private Nodo nodoAux;
    private int size;
    int cont;

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
        
        cont++;
        if(cont > getSize()){
            cont = 0;
            return null;
        }
        System.out.println("Aux: " + nodoAux.getDato().getNombre());
        //System.out.println("Inicial: " + nodoInicial.getDato().getNombre());
        System.out.println("cont-------" + cont);
        if(nodoInicial != null && cont == 1){    // Se elimino del if ---> nodoAux == null && 
            nodoAux = nodoInicial;
            System.out.println("PRIMER AGREGADO");
            System.out.println("DEVUELTO: " + nodoAux.getDato().getNombre());
            return nodoAux.getDato().getNombre();
        }else{
            if(nodoAux != null){
                if(nodoAux.getSiguiente() != null){
                    System.out.println("SEGUNDO AGREGADO");
                    nodoAux = nodoAux.getSiguiente();
                    System.out.println("DEVUELTO: " + nodoAux.getDato().getNombre());
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
    
    public void listaTotal(){
        String texto = "";
        nodoAux = nodoInicial;
        do{
            texto += nodoAux.getDato().getNombre() + "\n";
            nodoAux = nodoAux.getSiguiente();
        }while(nodoAux != null);
        System.out.println("////////////////////LISTA/////////////////");
        System.out.println(texto);
        System.out.println("7777777777777777777777777777777777777777777");
    }

    public int getSize() {
        return size;
    }
}
