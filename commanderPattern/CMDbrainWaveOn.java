package gameconsole;

public class CMDbrainWaveOn implements Command {
	DeviceBrainWave dvcBrainWave;
	
	public CMDbrainWaveOn(DeviceBrainWave dvcBrainWave){
		this.dvcBrainWave = dvcBrainWave;
	}
	
	public void execute(){
		dvcBrainWave.powerON();
		dvcBrainWave.setStartMagnitron(true);
		dvcBrainWave.setRaiseTempTo(80);
	}
	
	
	public void undo(){
		dvcBrainWave.powerOFF();
		dvcBrainWave.setStartMagnitron(false);
		dvcBrainWave.setRaiseTempTo(0);
	}
}
