package gameconsole;

public class DeviceBrainWave {
	boolean startMagnitron;
	int raiseTempTo;
	
	public void powerON(){System.out.println("Brain Wave ON");}
	
	public void powerOFF(){System.out.println("Brain Wave OFF");}
	
	public void setRaiseTempTo(int raiseTempTo){
		this.raiseTempTo = raiseTempTo;
		System.out.println("Temp has been raised to: " + raiseTempTo);
		System.out.println("----------------------------------");
	}
	
	public void setStartMagnitron(boolean arg){
		this.startMagnitron = arg;
		System.out.println("Start Magnitron: " + startMagnitron);
	}
}
