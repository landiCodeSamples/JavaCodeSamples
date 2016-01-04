package observerFramework;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float minTemp;
	private float maxTemp;
	private float avgTemp;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
		
	}
	
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			if(temperature < minTemp)minTemp = temperature;
			if(temperature > maxTemp)maxTemp = temperature;
			avgTemp = temperature / 2;
			display();
		}
	}
	public void display(){
		System.out.println("Avg/Max/Min temperature = " + minTemp +
				"/" + maxTemp + "/" + avgTemp);
	}
}
