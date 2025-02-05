package clases;

public class Barco {
    private int fila;
    private int columna;
    private boolean vertical;
    private boolean[] daño;

    public Barco(int f, int c, boolean v, int tam) {
        this.fila = f;
        this.columna = c;
        this.vertical = v;
        this.daño = new boolean[tam];
    }

    public int getFila() {
        return this.fila;
    }

    public int getColumna() {
        return this.columna;
    }

    public int getTamaño() {
        return this.daño.length;
    }

    public boolean esVertical() {
        return this.vertical;
    }

    public boolean estaHundido() {
        for (boolean e : this.daño) {
            if (!e) {
                return false;
            }
        }
        return true;
    }

    public boolean hayBarco(int f, int c) {
        if (!vertical) {
            return (f == this.fila && c >= this.columna && c < this.columna + this.daño.length);
        } else {
            return (c == this.columna && f >= this.fila && f < this.fila + this.daño.length);
        }
    }

    public int recibirDisparo(int f, int c) {
        if (!hayBarco(f, c)) {
            return -1;
        }

        if (!vertical) {
            this.daño[c - this.columna] = true;
        } else {
            this.daño[f - this.fila] = true;
        }

        return estaHundido() ? 2 : 1;
    }

    public int getEstado(int f, int c) {
        if (!hayBarco(f, c)) {
            return -1;
        }

        boolean impacto = !vertical ? this.daño[c - this.columna] : this.daño[f - this.fila];

        if (impacto) {
            return estaHundido() ? 2 : 1;
        } else {
            return 0;
        }
    }
}
