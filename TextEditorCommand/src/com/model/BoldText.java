package com.model;

public class BoldText implements TextEditorCommand{
	
	private TextEditor texteditor;
	
	public BoldText(TextEditor texteditor)
	{
		this.texteditor=texteditor;
	}
	@Override
	public void changestyle() {
		texteditor.bold();
	}

}