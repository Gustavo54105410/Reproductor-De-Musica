package reproductor;

public class ListaDeReproduccion {
    private ListaDeCanciones cola = new ListaDeCanciones();
     private String nombreLista;
     
     public ListaDeReproduccion(String nombreLista){
         this.nombreLista = nombreLista;
     }
     
     public Cancion buscarEnListaDeReproduccion(String nombreCancion){
         return cola.buscarCancion(nombreCancion);
     }

     public void añadirAListaDeReproduccion(String nombreCancion){
         cola.añadirCancionAListaDeReproduccion(nombreCancion);
     }
     
     public Cancion recorrerListaDeReproduccion(){
         return cola.recorrerLista();
     }
     
     public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }
    
    public ListaDeCanciones getCola(){
        return cola;
    }
    
    public int getSize(){
        return cola.getSize();
    }
}
