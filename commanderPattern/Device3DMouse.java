package gameconsole;

public class Device3DMouse {
	boolean spinDisc;
	boolean constantVelocity;
	boolean stable;
	
	public void powerON(){System.out.println("3D Mouse ON");}
	
	public void powerOFF(){System.out.println("3D Mouse OFF");}
	
	public void setSpinDisc(boolean arg){
		this.spinDisc = arg;
		System.out.println("Disc is spinning: " + spinDisc);
	}
	
	public void setConstantVelocity(boolean arg){
		this.constantVelocity = arg;
		System.out.println("Constant Velocity: " + constantVelocity);
	}
	
	public void setStable(boolean arg){
		this.stable = arg;
		System.out.println("Is Stable: " + stable);
		System.out.println("----------------------------------");
	}
}
