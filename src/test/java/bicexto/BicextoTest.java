package bicexto;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicextoTest {

	@Test
	public void testAno1400() {
		assert(Bissexto.verificar(1400));
	}
	
	@Test
	public void testAno670() {
		assert(Bissexto.verificar(670));
	}
	
	@Test
	public void testAno2055() {
		assertFalse(Bissexto.verificar(2055));
	}
}