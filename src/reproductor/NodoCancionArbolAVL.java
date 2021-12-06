package reproductor;

public class NodoCancionArbolAVL {

    int dato;
    private Cancion song;
    public int fe;
    public NodoCancionArbolAVL HIzq, Hder;

    public NodoCancionArbolAVL(int d) {
        this.dato = d;
        this.fe = 0;
        this.HIzq = null;
        this.Hder = null;
    }

    public Cancion getSong() {
        return song;
    }

    public void setSong(Cancion song) {
        this.song = song;
    }

    public void setDato() {
        this.dato = song.getId();
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void setHIzq(NodoCancionArbolAVL HIzq) {
        this.HIzq = HIzq;
    }

    public void setHder(NodoCancionArbolAVL Hder) {
        this.Hder = Hder;
    }

    public int getDato() {
        return dato;
    }

    public int getFe() {
        return fe;
    }

    public NodoCancionArbolAVL getHIzq() {
        return HIzq;
    }

    public NodoCancionArbolAVL getHder() {
        return Hder;
    }

}
