package clases.test;

import clases.Barco;
import clases.Tablero;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableroTest {
    @Test
    public void Test1(){
        Tablero t = new Tablero(9,8);
        assertEquals(9,t.getTotalFilas());
        assertEquals(8,t.getTotalColumnas());
        t.getFlota().añadirBarco(new Barco(1,2,true,3));
        assertEquals('.',t.getEstado(2,1));
        assertEquals('B',t.getEstado(2,2));
        t.getFlota().getBarco(2,2).recibirDisparo(2,2);
        assertEquals('*',t.getEstado(2,2));
        t.getFlota().getBarco(1,2).recibirDisparo(1,2);
        t.getFlota().getBarco(3,2).recibirDisparo(3,2);
        assertEquals('x',t.getEstado(2,2));
        t.dibujar(true);
        t.dibujar(false);
    }

}