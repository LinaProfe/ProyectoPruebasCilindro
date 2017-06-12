/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebascilindro;

/**
 *
 * @author 
 */
public class Cilindro {
    private float radio;
    private float altura;
    
    public Cilindro(float radio, float altura) throws Exception {
        if (radio <= 0 || radio > 1000)
            throw new DatosException("Dato radio Erroneo");
        if (altura <= 0 || altura > 1000)
            throw new DatosException("Dato altura Erroneo");
        this.radio = radio;
        this.altura = altura;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public double getAltura() {
        return altura;
    }
    
    // calculo del volumen
    public double getVolumen() {
        return altura*Math.pow(radio, 2) * Math.PI;
    }
    
    public static double datosCilindro(Cilindro c) {
        return c.getVolumen();
    }
    
}
