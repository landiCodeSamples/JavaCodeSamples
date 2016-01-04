package gameconsole;

public class ConsoleBox {
	public ConsoleBox(){}
	
	public void onBtnMousePowerONclick(CMD3DmouseOn arg){
		System.out.println("Mouse Execute Power On Functionality: " + "\n");
		arg.execute();
	}
	
	public void onBtnMousePowerOFFclick(CMD3DmouseOff arg){
		System.out.println("Mouse Execute Power Off Functionality: " + "\n");
		arg.execute();
	}
	
	public void onBtnBrainPowerONclick(CMDbrainWaveOn arg){
		System.out.println("Brain Wave Execute Power On Functionality: " + "\n");
		arg.execute();
	}
	
	public void onBtnBrainPowerOFFclick(CMDbrainWaveOff arg){
		System.out.println("Brain Wave Execute Power Off Functionality: " + "\n");
		arg.execute();
	}
	
	public void onBtnFitPowerONclick(CMDfitnessOn arg){
		System.out.println("Fit Device Execute Power On Functionality: " + "\n");
		arg.execute();
	}
	
	public void onBtnFitPowerOFFclick(CMDfitnessOff arg){
		System.out.println("Fit Device Execute Power Off Functionality: " + "\n");
		arg.execute();
	}
}
