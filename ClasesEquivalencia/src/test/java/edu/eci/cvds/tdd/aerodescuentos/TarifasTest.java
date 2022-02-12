/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    @Test
    public void c1(){
        try{
            double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(-100,-5,-12);
        }
        catch(Exception e){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void c2(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,35,2);
        Assert.assertEquals(80, result, 0);
    }

    @Test
    public void c3(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,35,77);
        Assert.assertEquals(77, result, 0);
    }

    @Test
    public void c4(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,5,12);
        Assert.assertEquals(95, result, 0);
    }

    @Test
    public void c5(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,5,77);
        Assert.assertEquals(92, result, 0);
    }

    @Test
    public void c6(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,24,22);
        Assert.assertEquals(85, result, 0);
    }

    @Test
    public void c7(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,5,24);
        Assert.assertEquals(100, result, 0);
    }

    @Test
    public void c8(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,21,24);
        Assert.assertEquals(85, result, 0);
    }

    @Test
    public void c9(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,5,17);
        Assert.assertEquals(95, result, 0);
    }

    @Test
    public void c10(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100,5,66);
        Assert.assertEquals(92, result, 0);
    }
}
