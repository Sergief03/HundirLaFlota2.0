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
        t.getFlota().recibirDisparo(2,2);
        assertEquals('*',t.getEstado(2,2));
        t.getFlota().recibirDisparo(1,2);
        t.getFlota().recibirDisparo(3,2);
        assertEquals('x',t.getEstado(2,2));
        t.getFlota().añadirBarco(new Barco(5,2,false,4));
        t.getFlota().añadirBarco(new Barco(6,7,true,4));
        t.getFlota().recibirDisparo(8,7);
        t.dibujar(true);
        System.out.println("");
        t.dibujar(false);
    }

}