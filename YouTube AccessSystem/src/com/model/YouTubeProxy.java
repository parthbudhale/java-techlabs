package com.model;

public class YouTubeProxy implements YouTubeService {

	private RealYoutubeService realYoutubeService = new  RealYoutubeService();
	@Override
	public void watchvideo(String videoName, int userAge)throws Exception{
		// TODO Auto-generated method stub
		if(userAge<18)
		{
			throw new Exception("Cannot watch this content " + videoName);
		}
		realYoutubeService.watchvideo(videoName, userAge);
		
	}

}
