package com.structutal.adapter.model;

public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer advancedPlayer;
		public MediaAdapter(String fileType)
		{
			if(fileType.equalsIgnoreCase("MP4"))
					{
						advancedPlayer = new MP4Player();
					}
					else if(fileType.equalsIgnoreCase("AVI"))
				
							
							{
								advancedPlayer = new AVIPlayer();
							}
		}
		@Override
		public void play(String fileType, String fileName) {
			// TODO Auto-generated method stub
			if(fileType.equalsIgnoreCase("MP4"))
			{
				advancedPlayer.playMP4(fileName);
			}
			else if(fileType.equalsIgnoreCase("AVI"))
			{
				advancedPlayer.playAVI(fileName);
				
			}
			
			
		}

}
