package gameconsole;

public class CMD3DmouseOff implements Command {
	Device3DMouse dvcMouse;
	
	public CMD3DmouseOff(Device3DMouse dvcMouse){this.dvcMouse = dvcMouse;}
	
	public void execute(){
		dvcMouse.powerOFF();
		dvcMouse.setSpinDisc(false);
		dvcMouse.setConstantVelocity(false);
		dvcMouse.setStable(false);
	}
	
	public void undo(){
		dvcMouse.powerON();
		dvcMouse.setSpinDisc(true);
		dvcMouse.setConstantVelocity(true);
		dvcMouse.setStable(true);
	}
}
