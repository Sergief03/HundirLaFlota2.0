package clases;

public class Barco {
    private int fila;
    private int columna;
    private boolean vertical;
    private boolean[] daño;

    public Barco(int f, int c, boolean v, int tam){
        this.fila=f;
        this.columna=c;
        this.vertical=v;
        this.daño=new boolean[tam];

    }

    public int getFila(){
        return this.fila;
    }

    public int getColumna(){
        return this.columna;
    }

    public int getTamaño(){
        return this.daño.length;
    }

    public boolean estaHundido(){
        boolean hundido=false;
        for (Boolean e:daño){
            if (e==false){
                hundido=false;
            }
        }
        return hundido;
    }

    public boolean hayBarcp(int f,int c){
        boolean barco=false;
        if (vertical){
            if (c==this.columna||(c>=this.columna&&c<=this.daño.length)){
                barco=true;
            }
        }else {
            if (f==this.fila||(f>=this.fila&&c<=this.daño.length)){
                barco=true;
            }
        }


        return barco;
    }

    public int recibirDisparo(int f, int c){
        if (hayBarcp(f,c)){
            if (vertical){
                this.daño[(c-this.columna)]=true;
            }else {
                this.daño[(f-this.fila)]=true;
            }

        }else {
            return -1;
        }

        if (estaHundido()){
            return 2;
        }else {
            return 1;
        }
    }

    public int getEstado(int f, int c){
        if (hayBarcp(f,c)){
            if (vertical){
                if (this.daño[(c-this.columna)]==true){
                    if (estaHundido()){
                        return 2;
                    }else {
                        return 1;
                    }
                }else {
                    return 0;
                }

            }else {
                if (this.daño[(f-this.fila)]==true){
                    if (estaHundido()){
                        return 2;
                    }else {
                        return 1;
                    }
                }else {
                    return 0;
                }
            }
        }else {
            return -1;
        }
    }
}
