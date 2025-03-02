package clases;

import java.util.ArrayList;
import java.util.List;

    public class Flota {
        //Propiedades
        private List<Barco> barquitos;

        //Métodos
        public Flota() {
            this.barquitos = new ArrayList<>();
        }

        public void añadirBarco(Barco b) {
            this.barquitos.add(b);
        }

        public int getNumeroBarcos() {
            return barquitos.size();
        }

        public int getNumeroBarcosActivos() {
            int activos = 0;
            for (Barco b : this.barquitos) {
                if (!b.estaHundido()) {
                    activos++;
                }
            }
            return activos;
        }

        public int getNumeroBarcosHundidos() {
            return getNumeroBarcos() - getNumeroBarcosActivos();
        }

        public boolean todosBarcosHundidos() {
            int contador = 0;
            for (Barco b : barquitos) {
                if (b.estaHundido() == true) {
                    contador++;
                }
            }
            if(contador==barquitos.size()){
                return true;
            }else{
                return false;
            }
        }

        public Barco getBarco(int f, int c) {
            int fila = 0;
            int columna = 0;
            for (Barco b : barquitos) {
                if (b.hayBarco(f, c)) {
                    return b;
                }
            }
            return null;
        }

        public int recibirDisparo(int f, int c) {
            Barco b = getBarco(f, c);
            if (b == null){
                return -1;
            }
            b.recibirDisparo(f, c);
            if (b.estaHundido()){
                return 2;
            }
            return 1;
        }
    }


