package clases.test;

import clases.Barco;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarcoTest {
    @Test
    public void Test1(){
        Barco barco = new Barco(1,2,true,4);
        assertEquals(1, barco.getFila());
        assertEquals(2, barco.getColumna());
        assertEquals(4, barco.getTamaño());

        assertEquals(false,barco.estaHundido());
        assertEquals(false,barco.hayBarcp(0,1));
        assertEquals(true,barco.hayBarcp(3,1));
        assertEquals(1,barco.recibirDisparo(2,1));
        assertEquals(0,barco.recibirDisparo(4,5));
    }
    @Test
    public void Test2(){
        Barco barco = new Barco(1,2,true,4);
        assertEquals(1, barco.getFila());
        assertEquals(2, barco.getColumna());
        assertEquals(4, barco.getTamaño());

        assertEquals(false,barco.estaHundido());
        assertEquals(false,barco.hayBarcp(0,1));
        assertEquals(true,barco.hayBarcp(3,1));
        for (int i=1;i<=4;i++){
            if (i!=4){
                assertEquals(1,barco.recibirDisparo(i,2));
            }else{
                assertEquals(2,barco.recibirDisparo(i,2));
            }
        }
        assertEquals(true,barco.estaHundido());
    }
    @Test
    public void Test3(){
        Barco barco = new Barco(1,2,false,4);
        assertEquals(1, barco.getFila());
        assertEquals(2, barco.getColumna());
        assertEquals(4, barco.getTamaño());

        assertEquals(false, barco.estaHundido());
        assertEquals(false,barco.hayBarcp(0,1));
        assertEquals(true,barco.hayBarcp(1,3));

        assertEquals(1,barco.recibirDisparo(1,2));
        assertEquals(0,barco.recibirDisparo(4,5));
    }
    @Test
    public void Test4(){
        Barco barco = new Barco(1,2,false,4);
        assertEquals(1, barco.getFila());
        assertEquals(2, barco.getColumna());
        assertEquals(4, barco.getTamaño());

        assertEquals(false, barco.estaHundido());
        assertEquals(false,barco.hayBarcp(0,1));
        assertEquals(true,barco.hayBarcp(1,3));
        for (int i=1;i<=4;i++){
            if (i!=4){
                assertEquals(1,barco.recibirDisparo(2,i));
            }else{
                assertEquals(2,barco.recibirDisparo(2,i));
            }
        }
        assertEquals(true,barco.estaHundido());
    }
}