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

        public boolean hayBarco(int f, int c) {
            for (Barco b : barquitos) {
                int fila = b.getFila();
                int columna = b.getColumna();
                if (fila == f && columna == c) {
                    return true;
                }
            }
            return false;
        }

        public int recibirDisparo(int f, int c) {
            throw new UnsupportedOperationException("Sin programar");
        }
    }


