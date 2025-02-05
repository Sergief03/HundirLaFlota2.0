package clases;

import java.util.Random;

public class GeneradorFlota {
    private Tablero tablero;

    public GeneradorFlota(Tablero t){
        this.tablero=t;
    }

    public Tablero getTablero(){
        return this.tablero;
    }

    public void rellenarBarcos(){


    }

    private Barco crearBarco(int tam){
        Random random=new Random();
        boolean vertical=random.nextBoolean();
        int fila=random.nextInt();
        int columna=random.nextInt();
        int filasTablero=this.tablero.getTotalFilas();
        int columnasTablero=this.tablero.getTotalColumnas();

        if (vertical){
            for (int i=fila;i<fila+tam;i++){
                this.tablero.getFlota().getBarco(i,columna);
            }
        }else {
            for (int i=columna;i<columna+tam;i++){

            }
        }

        return new Barco(1,1,true,2);
    }

}
