package coronaCircular;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoronaTest {

	// Para instanciar en el setUp
	private CoronaCircular coronita;

	@Before
	public void setUp() throws Exception {
		coronita = new CoronaCircular(1, 2);
	}

	@Test
	public void coronaTest() {
		assertEquals(1, coronita.getRadioInterior(), 0.001);
		assertEquals(2, coronita.getRadioExterior(), 0.001);
		assertEquals(9.4247, coronita.getSuperficie(), 0.001);
		assertEquals(18.8495, coronita.getPerimetro(), 0.001);
	}
	
	@Test (expected = Error.class)
	public void radioInteriorNegativoTest() {
		coronita = new CoronaCircular(-4, 6);
	}
	
	@Test (expected = Error.class)
	public void radioExteriorCeroTest() {
		coronita = new CoronaCircular(2, 0);
	}
	
	@Test (expected = Error.class)
	public void radioInteriorCeroTest() {
		coronita = new CoronaCircular(0, 1);
	}
	
	@Test (expected = Error.class)
	public void ambosRadiosNegativoTest() {
		coronita = new CoronaCircular(-4, -5);
	}
	
	@Test (expected = Error.class)
	public void radioInteriorMayorExteriorTest() {
		coronita = new CoronaCircular(4, 2);
	}
	
}

