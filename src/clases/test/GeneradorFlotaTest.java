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
        Flota flota = new Flota();
        for (int i=1;i<=10;i++){
            generadorFlota.rellenarBarcos();
        }
        assertEquals(10,flota.getNumeroBarcosActivos());
        assertEquals(0,flota.getNumeroBarcosHundidos());
        assertEquals(false,flota.todosBarcosHundidos());
        for (int i=0;i<tablero.getTotalFilas();i++){
            for (int j=0;j<tablero.getTotalColumnas();i++){
                flota.recibirDisparo(i,j);
            }
        }
        assertEquals(0,flota.getNumeroBarcosActivos());
        assertEquals(10,flota.getNumeroBarcosHundidos());
        assertEquals(true,flota.todosBarcosHundidos());
    }
}