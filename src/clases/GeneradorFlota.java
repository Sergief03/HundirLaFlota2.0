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
        for (int i=1;i<=10;i++){
            if (i<=2){
                this.tablero.getFlota().añadirBarco(crearBarco(4));
            }else if(i<=5){
                this.tablero.getFlota().añadirBarco(crearBarco(3));
            }else {
                this.tablero.getFlota().añadirBarco(crearBarco(2));
            }
        }

    }

    private Barco crearBarco(int tam){
        Random random=new Random();
        boolean vertical = false;
        int fila = 0;
        int columna = 0;
        int filasTablero=this.tablero.getTotalFilas();
        int columnasTablero=this.tablero.getTotalColumnas();

        boolean continuar=true;
        int contador=0;

        while (continuar&&contador<=1000){
            vertical=random.nextBoolean();
            fila=random.nextInt(filasTablero-1);
            columna=random.nextInt(columnasTablero-1);

            if (vertical){
                for (int i=fila;i<=fila+tam&&continuar;i++){
                    if (this.tablero.getFlota().getBarco(i,columna)==null){
                        continuar=false;
                    }
                }
            }else {
                for (int i=columna;i<=columna+tam&&continuar;i++){
                    if (this.tablero.getFlota().getBarco(fila,i)==null){
                        continuar=false;
                    }
                }
            }



            contador++;
        }



        return contador<1000? new Barco(fila,columna,vertical,tam):null;
    }

}
