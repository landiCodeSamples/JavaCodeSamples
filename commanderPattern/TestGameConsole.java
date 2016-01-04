package gameconsole;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGameConsole {

	@Test
	public void testPowerOnMouseTrue() {
		ConsoleBox cb = new ConsoleBox();
		Device3DMouse dvcMouse = new Device3DMouse();
		CMD3DmouseOn cmdMouseON = new CMD3DmouseOn(dvcMouse);
		cb.onBtnMousePowerONclick(cmdMouseON);
		boolean actual = dvcMouse.spinDisc;
		boolean expected = true;
		assertTrue(actual == expected);
	}
	
	@Test
	public void testPowerOffMouseTrue(){
		ConsoleBox cb = new ConsoleBox();
		Device3DMouse dvcMouse = new Device3DMouse();
		CMD3DmouseOff cmdMouseOFF = new CMD3DmouseOff(dvcMouse);
		cb.onBtnMousePowerOFFclick(cmdMouseOFF);
		boolean actual = dvcMouse.spinDisc;
		boolean expected = false;
		assertTrue(actual == expected);
	}
	
	@Test
	public void testPowerOnMouseFalse() {
		ConsoleBox cb = new ConsoleBox();
		Device3DMouse dvcMouse = new Device3DMouse();
		CMD3DmouseOn cmdMouseON = new CMD3DmouseOn(dvcMouse);
		cb.onBtnMousePowerONclick(cmdMouseON);
		boolean actual = dvcMouse.spinDisc;
		boolean expected = false;
		assertFalse(actual == expected);
	}
	
	@Test
	public void testPowerOffMouseFalse(){
		ConsoleBox cb = new ConsoleBox();
		Device3DMouse dvcMouse = new Device3DMouse();
		CMD3DmouseOff cmdMouseOFF = new CMD3DmouseOff(dvcMouse);
		cb.onBtnMousePowerOFFclick(cmdMouseOFF);
		boolean actual = dvcMouse.spinDisc;
		boolean expected = true;
		assertFalse(actual == expected);
	}
	
	@Test
	public void testPowerOnBrainTrue(){
		ConsoleBox cb = new ConsoleBox();
		DeviceBrainWave dvcBrainWave = new DeviceBrainWave();
		CMDbrainWaveOn cmdBrainON = new CMDbrainWaveOn(dvcBrainWave);
		cb.onBtnBrainPowerONclick(cmdBrainON);
		boolean actual = dvcBrainWave.startMagnitron;
		boolean expected = true;
		assertTrue(actual == expected);
	}

}
