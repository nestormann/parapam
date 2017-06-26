package pordefecto.parapam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guille T on 6/24/2017.
 */
public class JugadorTest {

    private Jugador testJugador;

    @Before
    public void setUp() throws Exception {
        testJugador = new Jugador();
    }

    @After
    public void tearDown() throws Exception {
        testJugador = null;
    }

    @Test
    public void setDireccionEjecucion() throws Exception {
        for(int i=1;i<=5;i++) {
            testJugador.setDireccionEjecucion(i);
            assertEquals(i, testJugador.getDireccionEjecucion());
        }
    }

    @Test
    public void setIndicador() throws Exception {
        testJugador.setIndicador(true);
        assertEquals(true,testJugador.getIndicador());
        testJugador.setIndicador(false);
        assertEquals(false,testJugador.getIndicador());
    }
}