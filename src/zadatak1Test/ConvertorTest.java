package zadatak1Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import zadatak1.Convertor;

public class ConvertorTest {
	
	Convertor convertor;
	double rezultat;
	
	@Before
	public void setUp() {
		convertor = new Convertor();
	}

	@Test
	public void izKilogramaUFunteTest() {
		
		rezultat = convertor.IzKilogrameUFunte(5);
		assertEquals(11,023, rezultat);
	}
	
	@Test
	public void izFuntiUKilogrameTest() {
		
		rezultat = convertor.IzFuntiUKilograme(11.023);
		assertEquals(5,00, rezultat);
		
	}
	
	@Test
	public void izCentimetaraUInceTest() {
		
		rezultat = convertor.izCentimetaraUInce(3);
		assertEquals(1,0, rezultat);
	}
	
	@Test
	public void izInciUCentimetreTest() {
		rezultat = convertor.izInciUCentimetre(1.9685);
		assertEquals(5,00, rezultat);
	}
	
	@Test
	public void izCelzijusaUFarenhTest() {
		
		rezultat = convertor.izCelzijusaUFaran(1);
		assertEquals(33,8, rezultat);
	}
	
	@Test
	public void izFaranhataUCelzijuseTest() {
		
		rezultat = convertor.izFaranhajtaUCelzijuse(40);
		assertEquals(4,4, rezultat);
	}

}
