package gameconsole;

public class CMDfitnessOff implements Command {
	DeviceFitness dvcPF;
	
	public CMDfitnessOff(DeviceFitness dvcPF){this.dvcPF = dvcPF;}
	
	public void execute(){
		dvcPF.powerOFF();
		dvcPF.setWarmUpTime(0);
		dvcPF.setLEDstatus(false);
	}
	
	public void undo(){
		dvcPF.powerON();
		dvcPF.setWarmUpTime(5);
		dvcPF.setLEDstatus(true);
	}
}
