package gameconsole;

public class ConsoleBoxTest {
	public static void main(String[] args){
		ConsoleBox cb = new ConsoleBox();
		
		Device3DMouse dvcMouse = new Device3DMouse();
		CMD3DmouseOn cmdMouseON = new CMD3DmouseOn(dvcMouse);
		CMD3DmouseOff cmdMouseOFF = new CMD3DmouseOff(dvcMouse);
		cb.onBtnMousePowerONclick(cmdMouseON);
		cb.onBtnMousePowerOFFclick(cmdMouseOFF);
		
		DeviceBrainWave dvcBrainWave = new DeviceBrainWave();
		CMDbrainWaveOn cmdBrainON = new CMDbrainWaveOn(dvcBrainWave);
		CMDbrainWaveOff cmdBrainOFF = new CMDbrainWaveOff(dvcBrainWave);
		cb.onBtnBrainPowerONclick(cmdBrainON);
		cb.onBtnBrainPowerOFFclick(cmdBrainOFF);
		
		DeviceFitness dvcPF = new DeviceFitness();
		CMDfitnessOn cmdPfON = new CMDfitnessOn(dvcPF);
		CMDfitnessOff cmdPfOFF = new CMDfitnessOff(dvcPF);
		cb.onBtnFitPowerONclick(cmdPfON);
		cb.onBtnFitPowerOFFclick(cmdPfOFF);
	}
}
