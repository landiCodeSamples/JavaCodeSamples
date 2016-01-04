package gameconsole;

public class CMD3DmouseOn implements Command {
	Device3DMouse dvcMouse;
	
	public CMD3DmouseOn(Device3DMouse dvcMouse){this.dvcMouse = dvcMouse;}
	
	public void execute(){
		dvcMouse.powerON();
		dvcMouse.setSpinDisc(true);
		dvcMouse.setConstantVelocity(true);
		dvcMouse.setStable(true);
	}
	
	public void undo(){
		dvcMouse.powerOFF();
		dvcMouse.setSpinDisc(false);
		dvcMouse.setConstantVelocity(false);
		dvcMouse.setStable(false);
	}
}
