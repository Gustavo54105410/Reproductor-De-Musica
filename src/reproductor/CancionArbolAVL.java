package reproductor;

import javax.swing.JOptionPane;

public class CancionArbolAVL {
    
    private NodoCancionArbolAVL raiz;
//consructor
    public CancionArbolAVL() {
        raiz = null;
    }

    public NodoCancionArbolAVL ObtenerRaiz() {
        return raiz;
    }
//Buscar
    public NodoCancionArbolAVL buscar(int d, NodoCancionArbolAVL A) {
        if (raiz == null) {                              
            return null;                                    //si la raiz es null no hay nada por eso se retorna null
        } else if (A.dato==d) {                       
            return A;                                       //Si dato es igual a d es porque ya lo encontró, retorna A
        } else if (A.dato<d) {
            return buscar(d, A.Hder);               //si es menor tenemos que buscar por la derecha
        } else {
            return buscar(d, A.HIzq);               //si es mayor tenemos que buscar por la izquierda
        }
    }

//Factor de equilibrio
    public int FE(NodoCancionArbolAVL r) {
        if (r==null) {
            return -1;                                    //
        } else {
            return r.fe;
        }
    }

//Rotacion Simple Izq
    public NodoCancionArbolAVL RotacionSimpleIzq(NodoCancionArbolAVL c) {                                                                      
        NodoCancionArbolAVL aux = c.HIzq;                                               //puntero
        c.HIzq=aux.Hder;                                                       //reacomodamos los punteros (Hijo derecho)
        aux.Hder=c;                                                               //
        c.fe=Math.max(FE(c.HIzq),FE(c.Hder))+1;                     //max obtiene el maximo de dos valores. Lo
        aux.fe=Math.max(FE(aux.HIzq),FE(aux.Hder))+1;          //utilizamos para obtener el factor de equilibrio.
                                                                                        //Ponemos +1 para obtener el factor de equilibrio correcto
        return aux;
    }

//Rotacion Simple der
    public NodoCancionArbolAVL RotacionSimpleDer(NodoCancionArbolAVL c) {             //
        NodoCancionArbolAVL aux = c.Hder;                                              //Puntero
        c.Hder=aux.HIzq;                                                      //reacomodamos los punteros (Hijo izquierdo)
        aux.HIzq=c;                                                               
        c.fe=Math.max(FE(c.HIzq),FE(c.Hder))+1;                    
        aux.fe=Math.max(FE(aux.HIzq),FE(aux.Hder))+1;        
        return aux;
    }

    //Rotacion doble izq
    public NodoCancionArbolAVL RotacionDobleIzq(NodoCancionArbolAVL c) {              
        NodoCancionArbolAVL temp;                                                        //La rotacion doble izquierda consiste en rotar
       c.HIzq=RotacionSimpleDer(c.HIzq);                            //simple derecha y rotar simple izquierda
        temp = RotacionSimpleIzq(c);                                   
        return temp;                                                            
    }

    //Rotacion doble der
    public NodoCancionArbolAVL RotacionDobleDer(NodoCancionArbolAVL c) {           //La rotacion doble derecha consiste en rotar
        NodoCancionArbolAVL temp;                                                     //simple izquierda y rotar simple izquierda
        c.Hder=RotacionSimpleIzq(c.Hder);
        temp = RotacionSimpleDer(c);
        return temp;
    }

    //Metodo insertar AVL
    public NodoCancionArbolAVL insertarAVL(NodoCancionArbolAVL N, NodoCancionArbolAVL SA) {   //Recibe de parámetro un nodo nuevo (N) y un subárbol (SA)
        NodoCancionArbolAVL newPadre = SA;                                         
        if (N.dato < SA.dato) {                                             //Si el dato nuevo es MENOR al subarbol:
            if (SA.HIzq==null) {                                              //Si el subárbol es nulo, se inserta ahí el nuevo 
                SA.HIzq=N;
            } else {                                                               
                SA.HIzq=insertarAVL(N, SA.HIzq);                     //De otra forma insertamos un subárbol con recursividad
                if ((FE(SA.HIzq) - FE(SA.Hder)==2)) {               //Si la condición se cumple, estamos ante un desbalanceo
                    if (N.dato < SA.HIzq.dato) {                        //Ponemos una condicional para balancear el árbol sin
                        newPadre = RotacionSimpleIzq(SA);        //perder la estructura de un AVL. Izquierda para numero menor
                    } else {                                                    //derecha para numero mayor
                        newPadre = RotacionDobleIzq(SA);
                    }
                }
            }
        } else if (N.dato > SA.dato) {                                 //Si el dato nuevo es MAYOR al subarbol:
            if (SA.Hder == null) {                                         //Si el subarbol es nulo, se inserta ahí el nuevo
                SA.Hder=N;
            } else {
                SA.Hder=insertarAVL(N, SA.Hder);           
                if ((FE(SA.Hder) - FE(SA.HIzq) == 2)) {           //De otra forma insertamos un subárbol con recursividad
                    if (N.dato > SA.Hder.dato) {                      //Si la condición se cumple, estamos ante un desbalanceo
                        newPadre = RotacionSimpleDer(SA);      //Ponemos una condicional para balancear el árbol sin
                    } else {                                                   //perder la estructura de un AVL. Izquierda para numero menor
                        newPadre = RotacionDobleDer(SA);       //derecha para numero mayor
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nodo Duplicado",      //Si el dato no es mayor ni menor quiere decir que es el mismo
                    "Error",JOptionPane.INFORMATION_MESSAGE);             //valor, por lo tanto es un nodo duplicado
                                                                              
        }
//Actualizar altura
        if ((SA.HIzq == null) && (SA.Hder != null)) {                //Ponemos condicional para balancear
            SA.fe=SA.Hder.fe+1;                                             //Balanceamos aumentando 1 unidad
        } else if ((SA.Hder == null) && (SA.HIzq != null)) {      //Ponemos condicional para balancear
            SA.fe=SA.HIzq.fe+1;                                             //Balanceamos aumentando 1 unidad
        } else {                                                                   //
            SA.fe=Math.max(FE(SA.HIzq),FE(SA.Hder))+1;         //Nos obtiene el factor de equilibrio
        }                                                                             //y aumentamos 1 unidad para que este
        return newPadre;                                                    // correctamente balanceado
    }
//Metodo para insertar
    public void Insertar(NodoCancionArbolAVL nodo) {                                        
        NodoCancionArbolAVL nn = nodo;                                
        if (raiz == null) {                                                     //Si la raiz es nula no había nodos
            raiz = nn;                                                            //insertaremos un nuevo nodo (nn)
        } else {                                                                  //En otro caso, solo asignamos la raiz para
            raiz = insertarAVL(nn, raiz);                                 //insertar el AVL
        }
    }

    public void InOrden(NodoCancionArbolAVL r) {
        if (r != null) {
            InOrden(r.HIzq);
            System.out.print(r.dato+", ");
            InOrden(r.Hder);
        }
    }

    public void PreOrden(NodoCancionArbolAVL r) {
        if (r != null) {
            System.out.print(r.dato + ", ");
            PreOrden(r.HIzq);
            PreOrden(r.Hder);
        }
    }

    public void PostOrden(NodoCancionArbolAVL r) {
        if (r != null) {
            PostOrden(r.HIzq);
            PostOrden(r.Hder);
            System.out.print(r.dato+", ");
        }
    }

}
