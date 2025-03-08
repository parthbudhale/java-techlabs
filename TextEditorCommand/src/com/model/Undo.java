package com.model;

public class Undo implements TextEditorCommand{

    private TextEditor texteditor;
	
	public Undo(TextEditor texteditor)
	{
		this.texteditor=texteditor;
	}
	@Override
	public void changestyle() {
		texteditor.undo();
	}

}
