package com.model;

public class ItalicText implements TextEditorCommand{

    private TextEditor texteditor;
	
	public ItalicText(TextEditor texteditor)
	{
		this.texteditor=texteditor;
	}
	@Override
	public void changestyle() {
		texteditor.italic();
	}

}
