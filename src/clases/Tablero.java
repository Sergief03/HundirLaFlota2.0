package clases;

public class Tablero {
    private int totalFilas;
    private int totalColumnas;
    private Flota flota;
    public Tablero(int f, int c){
        if(f>6&&c>6){
            this.totalFilas=f;
            this.totalColumnas = c;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public Tablero(int n){
        if(n>6){
            this.totalFilas=n;
            this.totalColumnas = n;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public Tablero(){
        this.totalFilas=7;
        this.totalColumnas=7;
    }
    public int getTotalFilas(){
        return this.totalFilas;
    }
    public int getTotalColumnas(){
        return this.totalColumnas;
    }
    public Flota getFlota(){
        return this.flota;
    }
    public char getEstado(int f, int c){
        this.flota = getFlota();
        if(this.flota.hayBarco(f,c)){

        }
        throw new UnsupportedOperationException("Sin programar");
    }
    public void dibujar(boolean mostrarBarcos){
        throw new UnsupportedOperationException("Sin programar");
    }
}
