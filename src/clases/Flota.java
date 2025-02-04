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
            barquitos.add(b);
        }

        public int getNumeroBarcos() {
            return barquitos.size();
        }

        public int getNumeroBarcosActivos() {
            int contador = 0;
            for (Barco b : barquitos) {
                if (b.estaHundido() == false) {
                    contador++;
                }
            }
            return contador;
        }

        public int getNumeroBarcosHumdidos() {
            int contador = 0;
            for (Barco b : barquitos) {
                if (b.estaHundido() == true) {
                    contador++;
                }
            }
            return contador;

        }

        public boolean todosBarcosHundidos() {
            int contador = 0;
            for (Barco b : barquitos) {
                if (b.estaHundido() == true) {
                    contador++;
                }
            }
            if (contador == barquitos.size()) {
                return true;
            }
            return false;
        }

        public Barco getBarco(int f, int c) {
            int fila = 0;
            int columna = 0;
            for (Barco b : barquitos) {
                if (b.hayBarcp(f, c)) {
                    return b;
                }
            }
            return null;
        }

        public int recibirDisparo(int f, int c) {
            Barco b = getBarco(f, c);
            if(b != null){
                return 1;
            }
            if(b != null && b.estaHundido() == true){
                return 2;
            }
            return -1;
        }
    }


