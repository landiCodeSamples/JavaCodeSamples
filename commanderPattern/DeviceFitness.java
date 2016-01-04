package gameconsole;

public class DeviceFitness {
	int warmUpTime;
	boolean ledLightOn;
	
	public void powerON(){System.out.println("PF Device ON");}
	
	public void powerOFF(){System.out.println("PF Device OFF");}
	
	public void setLEDstatus(boolean arg){
		this.ledLightOn = arg;
		System.out.println("LED Light: " + ledLightOn);
		System.out.println("----------------------------------");
	}
	
	public void setWarmUpTime(int warmUpTime){
		this.warmUpTime = warmUpTime;
		System.out.println("Warm Up Time: " + warmUpTime);
	}
}
