package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Rectangulo r1, r2;

    @BeforeAll public static void setUp() {
        try
        {
            r1 = new Rectangulo(1, 2);
            r2 = new Rectangulo(3, 4);
        }
        catch (RectanguloException re )
        {
        }
    }

    @Test public void testAncho() {
        assertTrue(r1.getAncho()==1);
    }

    @Test public void testAltura() {
        assertTrue(r2.getAltura()==4);
    }

    @Test public void testArea1() {
        assertTrue(r1.calcularArea()==2);
    }

    @Test public void testArea2() {
        assertTrue(r2.calcularArea()==12);
    }
}