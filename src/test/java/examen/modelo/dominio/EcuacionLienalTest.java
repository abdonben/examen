package examen.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EcuacionLienalTest {

    public void evaluarEcuacionLineal(){
        // define previus values
        double a=5;
        double b=7;

        //init
        Ecuacion ecuacion = new EcuacionLineal(a,b);
        //define values
        double x=1;
        // evaluation
        assertEquals(12d, ecuacion.resolverEcuacion(x));
    }
    
}
