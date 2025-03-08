package com.test;

import com.model.Command;
import com.model.Light;
import com.model.LightOffCommand;
import com.model.LightOnCommand;
import com.model.RemoteControl;
//import com.model.*;

public class CommandTest {
	public static void main(String[] args) {

		Light light = new Light();

		Command lighton = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);

		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(lightOff);
		remote.pressbutton();

	}
}
