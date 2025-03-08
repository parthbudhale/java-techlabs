package com.test;
import com.model.*;
public class YouTubeProxyTest {

	public static void main(String[] args) {
		
		YouTubeService video = new YouTubeProxy();
		 try
		 { 
			 video.watchvideo("bbb", 20);
			 video.watchvideo("ccc", 25);
			 video.watchvideo("samay raina", 15);
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }

	}
}
