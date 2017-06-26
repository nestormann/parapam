package pordefecto.parapam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

import pordefecto.parapam.Modelo.Referee;


public class RefereeTest {

    private Referee referee;

    @Before
    public void setUp() throws Exception {
        referee = new Referee(null);
    }

    @After
    public void tearDown() throws Exception {
        referee = null;
    }

    @Test
    public void determinarResultadoPartidaEnCurso() throws Exception {
        referee.determinarResultado(1,1,true);
        assertEquals(referee.getMarcador().getPuntajeUsuario(),0);
        assertEquals(referee.getEstado(),EstadoPartida.EN_CURSO);
    }

    @Test
    public void determinarResultadoPartidaFinalizada() throws Exception {
        for(int i=0;i<=5;i++) {
            referee.determinarResultado(0, 0, true);
            referee.determinarResultado(1, 0, false);
        }
        assertEquals(referee.getEstado(),EstadoPartida.FINALIZADA_SISTEMA);
    }

}