package clases.test;

import clases.Barco;
import clases.Flota;
import clases.GeneradorFlota;
import clases.Tablero;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneradorFlotaTest {
    @Test
    public void Test1(){
        Tablero tablero = new Tablero(7,7);
        GeneradorFlota generadorFlota = new GeneradorFlota(tablero);

        generadorFlota.rellenarBarcos();

        assertEquals(10,tablero.getFlota().getNumeroBarcosActivos());
        assertEquals(0,tablero.getFlota().getNumeroBarcosHundidos());
        assertEquals(false,tablero.getFlota().todosBarcosHundidos());
        for (int i=0;i<tablero.getTotalFilas();i++){
            for (int j=0;j<tablero.getTotalColumnas();j++){
                tablero.getFlota().recibirDisparo(i,j);
            }
        }
        assertEquals(0,tablero.getFlota().getNumeroBarcosActivos());
        assertEquals(10,tablero.getFlota().getNumeroBarcosHundidos());
        assertEquals(true,tablero.getFlota().todosBarcosHundidos());
    }
}