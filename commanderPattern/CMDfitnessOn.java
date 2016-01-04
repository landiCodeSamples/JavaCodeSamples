package gameconsole;

public class CMDfitnessOn implements Command {
	DeviceFitness dvcPF;
	
	public CMDfitnessOn(DeviceFitness dvcPF){this.dvcPF = dvcPF;}
	
	public void execute(){
		dvcPF.powerON();
		dvcPF.setWarmUpTime(5);
		dvcPF.setLEDstatus(true);
	}
	
	public void undo(){
		dvcPF.powerOFF();
		dvcPF.setWarmUpTime(0);
		dvcPF.setLEDstatus(false);
	}
}
