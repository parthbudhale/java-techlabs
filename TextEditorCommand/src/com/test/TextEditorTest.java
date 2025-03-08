package com.test;

import com.model.TextEditor;
import com.model.*;

public class TextEditorTest {

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		
		TextEditorCommand command = new BoldText(textEditor);
		TextEditorCommand command2 = new ItalicText(textEditor);
		TextEditorCommand command3 = new Undo(textEditor);
		TextEditorCommand command4 = new Redo(textEditor);
		
		TextEditorRemoteControl textEditorRemoteControl = new TextEditorRemoteControl();
		textEditorRemoteControl.setCommand(command);
		textEditorRemoteControl.pressButton();
		
		textEditorRemoteControl.setCommand(command2);
		textEditorRemoteControl.pressButton();
		
		textEditorRemoteControl.setCommand(command3);
		textEditorRemoteControl.pressButton();
		
		textEditorRemoteControl.setCommand(command4);
		textEditorRemoteControl.pressButton();

	}

}