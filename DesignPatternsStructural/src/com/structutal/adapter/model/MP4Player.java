package com.structutal.adapter.model;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playMP4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("playing a MP4 file:"+ filename);
		
	}

	@Override
	public void playAVI(String filename) {
		// TODO Auto-generated method stub
		System.out.println("playing a AVI file:"+ filename);
		
	}

}
