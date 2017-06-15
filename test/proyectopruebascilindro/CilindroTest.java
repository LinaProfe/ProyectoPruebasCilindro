/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebascilindro;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author libres2017
 */
public class CilindroTest {
    
    public CilindroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRadio method, of class Cilindro.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Cilindro instance = null;
        double expResult = 0.0;
      //  double result = instance.getRadio();
      //  assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getAltura method, of class Cilindro.
     * Compruebo que el método getAltura devuelva la altura correctamente.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        double expResult = 1.0;
        float valorPrueba = 1f;
        Cilindro c = null;
        try {
            c = new Cilindro(valorPrueba,valorPrueba);
        } catch (DatosException de){
            
        } catch (Exception ex) {
            Logger.getLogger(CilindroTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        double result = c.getAltura();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getVolumen method, of class Cilindro.
     * Compruebo que el volumen se calcula correctamente. 
     */
    @Test
    public void testGetVolumen() {
        System.out.println("getVolumen");
        double expResult = 3.141592653589793;
        float valorPrueba = 1f;
        Cilindro c = null;
        try {
            c = new Cilindro(valorPrueba,valorPrueba);
        } catch (DatosException de){
            
        } catch (Exception ex) {
            Logger.getLogger(CilindroTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        double result = c.getVolumen();
        assertEquals(expResult, result,0.00000000000000001);
      
    }

    /**
     * Test of datosCilindro method, of class Cilindro.
     * En este método compruebo el caso de prueba en el que tanto el radio
     * como la altura están dentro del rango adecuado. La prueba será pasada
     * si el objeto es creado.
     */
    @Test
    public void testDatosCilindro1() {
        System.out.println("datosCilindro Pruebra radio y altura OK.");
        float valorPrueba = 500f;
        Cilindro c = null;
        try {
            c = new Cilindro(valorPrueba,valorPrueba);
        } catch (DatosException de){
            
        } catch (Exception ex) {
            Logger.getLogger(CilindroTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertNotNull("Error: Debería haberse creado el objeto",c);
       }
    
    /**
     * Test of datosCilindro method, of class Cilindro.
     * En este método compruebo el caso de prueba en el que el radio está
     * dentro de los valores permitidos pero la altura está fuera del rango
     * permitido. La prueba será exitosa si no se crea el objeto.
     */
    @Test
    public void testDatosCilindro2() {
        System.out.println("datosCilindro Pruebra radio OK y altura FAIL.");
        float radio = 500f;
        float altura = 0f;
        Cilindro c = null;
        try {
            c = new Cilindro(radio,altura);
        } catch (DatosException de){
            assertEquals("Dato altura Erroneo",de.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(CilindroTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertNull("Error: No debería haberse creado el objeto",c);
       }
    /**
     * Test of datosCilindro method, of class Cilindro.
     * Compruebo el método datosCilindro. En este caso pruebo a pasarle un 
     * objeto Cilindro correctamente creado.
     */
    @Test
    public void testDatosCilindro3() {
        System.out.println("Método datosCilindro con objeto Cilindro correcto.");
        float radio = 1f;
        float altura = 1f;
        Cilindro c = null;
        double result = 0.0;
        double expResult = 3.141592653589793;
        try {
            c = new Cilindro(radio,altura);
        } catch (DatosException de){
         
        } catch (Exception ex) {
            Logger.getLogger(CilindroTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result = Cilindro.datosCilindro(c);
        assertEquals(expResult, result,0.00000000000000001);
    }
     /**
     * Test of datosCilindro method, of class Cilindro.
     * Compruebo el método datosCilindro. En este caso pruebo a pasarle un 
     * objeto nulo.
     */
    @Test
    public void testDatosCilindro4() {
        System.out.println("Método datosCilindro con objeto nulo.");
        double result = 0.0;
        double expResult = 0.0;
        Cilindro c = null;
        
        
        try {
            result = Cilindro.datosCilindro(c);
        } catch (NullPointerException npe){
            fail("Método datosCilindro debería lanzar o controlar excepción "
               + " de objeto nulo"+npe.getMessage());
        }
        
    }
}
