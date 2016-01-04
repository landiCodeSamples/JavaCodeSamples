package gameconsole;

public class CMDbrainWaveOff implements Command {
	DeviceBrainWave dvcBrainWave;
	
	public CMDbrainWaveOff(DeviceBrainWave dvcBrainWave){
		this.dvcBrainWave = dvcBrainWave;
	}
	
	public void execute(){
		dvcBrainWave.powerOFF();
		dvcBrainWave.setStartMagnitron(false);
		dvcBrainWave.setRaiseTempTo(0);
	}
	
	public void undo(){
		dvcBrainWave.powerON();
		dvcBrainWave.setStartMagnitron(true);
		dvcBrainWave.setRaiseTempTo(80);
	}
}
