/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocomercialivan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dam1cd
 */
public class TarxetaFidelizacionTest {
    
    

    /**
     * Test of obterPuntos method, of class TarxetaFidelizacion.
     */
    @Test
    public void testObterPuntosVIP() {
        System.out.println("obterPuntos de un VIP CAIXA BRANCA");
        int valorCompra = 7;
        boolean vip = true;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = true;
        boolean result = instance.obterPuntos(valorCompra, vip);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObterPuntosNoVIP() {
        System.out.println("obterPuntos de un no VIP CAIXA BRANCA");
        int valorCompra = 7;
        boolean vip = false;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        boolean expResult = true;
        boolean result = instance.obterPuntos(valorCompra, vip);
        assertEquals(expResult, result);
    }
    
   
    @Test
    public void testabonarGaraxeCaixaNegra() {
        System.out.println("abonar do Garaxe con Caixa Negra Valor no limite da clase equivalente 1= -30");
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        instance.setPuntos(-30);
        boolean expResult = false;
        boolean result = instance.abonarGaraxe();
        assertEquals(expResult, result);
    }

    @Test
    public void testObterRegaloPROBANDO10() {
        System.out.println("obterRegalo co numPuntosRegalos 10 e 5 puntos");
        int numPuntosRegalo = 10;
        TarxetaFidelizacion instance = new TarxetaFidelizacion();
        instance.setPuntos(5);
        int expResult = -1;
        int result = instance.obterRegalo(numPuntosRegalo);
        assertEquals(expResult, result);
    }

    
    
}
