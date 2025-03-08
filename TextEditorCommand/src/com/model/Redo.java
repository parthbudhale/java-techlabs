package com.model;

public class Redo implements TextEditorCommand{
    private TextEditor texteditor;
	
	public Redo(TextEditor texteditor)
	{
		this.texteditor=texteditor;
	}
	@Override
	public void changestyle() {
		texteditor.redo();
	}

}