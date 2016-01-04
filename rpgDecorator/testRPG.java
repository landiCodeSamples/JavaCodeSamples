package rpgDecorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testRPG {

	@Test
	public void testGetDescriptionMage() {
		Character m = new Mage();
		String expected = "Mage Character";
		String actual = m.getChDecs();
		assertTrue(expected.equals(actual));
	}
	@Test
	public void testGetDescriptionPriest() {
		Character m = new Priest();
		String expected = "Priest Character";
		String actual = m.getChDecs();
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void testGetDescriptionMageFalse() {
		Character m = new Priest();
		String expected = "Mage Character";
		String actual = m.getChDecs();
		assertFalse(expected.equals(actual));
	}
	
	@Test
	public void testMageExp() {
		Character m = new Mage();
		m.setExp(100);
		int expected = 100;
		int actual = m.getExp();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testPriestExp() {
		Character m = new Priest();
		m.setExp(100);
		int expected = 100;
		int actual = m.getExp();
		assertTrue(expected == actual);
	}

}
