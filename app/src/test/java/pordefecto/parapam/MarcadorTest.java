package pordefecto.parapam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guille T on 6/24/2017.
 */
public class MarcadorTest {

    private Marcador testMarcador;

    @Before
    public void setUp() throws Exception {
        testMarcador = Marcador.crearMarcador();
    }

    @After
    public void tearDown() throws Exception {
        testMarcador = null;
    }

    @Test
    public void crearMarcador() throws Exception {
        assertNotNull(testMarcador);
        Marcador singletonTest = Marcador.crearMarcador();
        assertEquals(singletonTest,testMarcador);
    }


    @Test
    public void setPuntajeUsuario() throws Exception {
        int prePuntajeUsuario = testMarcador.getPuntajeUsuario();
        testMarcador.setPuntajeUsuario(false);
        assertEquals(testMarcador.getPuntajeUsuario(),prePuntajeUsuario);
        testMarcador.setPuntajeUsuario(true);
        assertEquals(testMarcador.getPuntajeUsuario(),prePuntajeUsuario+1);
    }

    @Test
    public void setPenalPos() throws Exception {
        int prePenalPos = testMarcador.getPenalPos();
        testMarcador.setPenalPos();
        assertEquals(testMarcador.getPenalPos(),prePenalPos+1);
    }

    @Test
    public void setPuntajeSistema() throws Exception {
        int prePuntajeSistema = testMarcador.getPuntajeSistema();
        testMarcador.setPuntajeSistema(false);
        assertEquals(testMarcador.getPuntajeSistema(),prePuntajeSistema);
        testMarcador.setPuntajeSistema(true);
        assertEquals(testMarcador.getPuntajeSistema(),prePuntajeSistema+1);
    }

}