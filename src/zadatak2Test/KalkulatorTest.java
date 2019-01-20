package zadatak2Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import zadatak2.Kalkulator;

public class KalkulatorTest {
	
	Kalkulator k;
	
	@Before
	public void setUp() {
		
		k = new Kalkulator ();
	}

	@Test
	public void sabiranjeTest() {

		int rezultat = k.sabiranje(2, 2);
		assertEquals(4, rezultat);
	}

	@Test
	public void oduzimanjeTest() {

		int rezultat = k.oduzimanje(3, 2);
		assertEquals(1, rezultat);
	}

	@Test

	public void mnozenjeTest() {

		int rezultat = k.mnozenje(3, 2);
		assertEquals(6, rezultat);

	}

	@Test

	public void dijeljenjeTest() {

		double rezultat = k.dijeljenje(4, 2);
		assertEquals(2,0, rezultat);

	}

}



