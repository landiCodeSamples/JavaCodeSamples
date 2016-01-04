package observerFramework;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {
	
	@Test
	public void testGetTemp() {
		WeatherData wd = new WeatherData();
		wd.setMeasurements(80, 65, 30.4f);
		float expected = 80;
		float actual = wd.getTemperature();
		assertTrue(expected == actual);	
	}
	
	@Test
	public void testGetHumid() {
		WeatherData wd = new WeatherData();
		wd.setMeasurements(80, 65, 30.4f);
		float expected = 65;
		float actual = wd.getHumidity();
		assertTrue(expected == actual);	
	}
	
	@Test
	public void testGetPressure() {
		WeatherData wd = new WeatherData();
		wd.setMeasurements(80, 65, 30.4f);
		float expected = 30.4f;
		float actual = wd.getPreasure();
		assertTrue(expected == actual);	
	}
	
	@Test
	public void testGetTempFalse() {
		WeatherData wd = new WeatherData();
		wd.setMeasurements(80, 65, 30.4f);
		float expected = 12121;
		float actual = wd.getPreasure();
		assertFalse(expected == actual);	
	}
	
	@Test
	public void testGetPressureFalse() {
		WeatherData wd = new WeatherData();
		wd.setMeasurements(80, 65, 30.4f);
		float expected = 54545;
		float actual = wd.getPreasure();
		assertFalse(expected == actual);	
	}
	
	

}
