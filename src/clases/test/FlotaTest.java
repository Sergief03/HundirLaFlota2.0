package clases.test;

import clases.Barco;
import clases.Flota;
import org.junit.Test;

import static org.junit.Assert.*;
public class FlotaTest {
    @Test
    public void test1(){
        Flota flota = new Flota();
        flota.añadirBarco(new Barco(1,2,false,4));
        flota.añadirBarco(new Barco(11,22,true,3));
        flota.añadirBarco(new Barco(111,222,false,2));

        assertEquals(3,flota.getNumeroBarcos());
        assertEquals(3,flota.getNumeroBarcosActivos());
        assertEquals(0,flota.getNumeroBarcosHundidos());
        assertEquals(false,flota.todosBarcosHundidos());
        assertEquals(4,flota.getBarco(1,2).getTamaño());
        //assertEquals(null,flota.getBarco(9,3));

        for (int i=1;i<=3;i++){
            flota.recibirDisparo((i+10),22);
        }

        assertEquals(2,flota.getNumeroBarcosActivos());

        /*assertEquals(2,flota.getNumeroBarcosActivos());
        assertEquals(1,flota.getNumeroBarcosHundidos());
        assertEquals(false,flota.todosBarcosHundidos());
        for (int i=1;i<=4;i++){
            flota.recibirDisparo(1,(i+1));
        }
        for (int i=1;i<=2;i++){
            flota.recibirDisparo(111,(i+221));
        }
        assertEquals(0,flota.getNumeroBarcosActivos());
        assertEquals(3,flota.getNumeroBarcosHundidos());
        assertEquals(true,flota.todosBarcosHundidos());
*/
    }
}