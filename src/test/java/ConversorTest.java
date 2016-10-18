import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import otherclasses.Conversor;

public class ConversorTest {
	Conversor conversor = new Conversor();
	Random rand = new Random();
	
	@Test
	public void testToDegrees() {
		double randDouble = 0.00;
		for (int i = 0; i < 100; i++){
			randDouble = rand.nextDouble()*2*Math.PI;
			assertEquals(Math.toDegrees(randDouble), conversor.toDegrees(randDouble), 0.001);
		}
	}

	@Test
	public void testToRadians() {
		double randDouble = 0.00;
		for (int i = 0; i < 100; i++){
			randDouble = rand.nextDouble()*360;
			assertEquals(Math.toRadians(randDouble), conversor.toRadians(randDouble), 0.001);
		}
	}
}
