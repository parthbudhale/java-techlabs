package com.model;

public class TextEditorRemoteControl {
private TextEditorCommand command;
	
	public void setCommand(TextEditorCommand command)
	{
		this.command=command;
	}
	public void pressButton()
	{
		command.changestyle();
	}
}