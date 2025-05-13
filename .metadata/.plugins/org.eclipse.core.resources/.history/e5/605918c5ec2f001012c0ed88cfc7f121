package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Clases.Maximo;



class TestMaximo {
	
	static int numero1;
    static int numero2;
    static int numero3;

    @BeforeAll
    static void setup() {
        numero1 = 1;
        numero2 = 2;
        numero3 = 3;
    }

    @Test
    void testMaximoDe3EnterosPositivos() throws IllegalAccessException  {
        int numeroEsperado = 3;
        int numeroObtenido = Maximo.MaximoDe3EnterosPositivos(numero1, numero2, numero3);
        assertEquals(numeroEsperado, numeroObtenido);
    }

} 
 