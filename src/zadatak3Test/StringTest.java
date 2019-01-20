package zadatak3Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringTest {

	String s;
	int rezultat;
	String p;
	
	@Before
	public void setUp(){
		s = new String();
	}
	
	@Test
	public void shouldReturnLengthOfString(){
		rezultat = s.duzinaStringa("nesto");
		assertEquals(5, rezultat);
	}
	
	@Test
	public void shouldReturnWordsOnEvenPositions(){
		p = s.parnePozicije("nesto");
		assertEquals("nso", p);
	}
	
	@Test
	public void shouldReturnWordsOnOddPositions(){
		p = s.neparnePozicije("nesto");
		assertEquals("et", p);
	}
	
	@Test
	public void shouldReturnNumberOfUpperCaseCharacters(){
		rezultat = s.upperCase("NeStO");
		assertEquals(3, rezultat);
	}
	
	@Test
	public void shouldReturnNumberOfLowerCaseCharacters(){
		rezultat = s.lowerCase("NeStO");
		assertEquals(2, rezultat);
	}
	
	@Test
	public void shoultReturnSveOsimKaraktera(){
		p = s.ostaliKarakteri("nesto!@#");
		assertEquals("!@#", testStr);
	}
	

}
