package com.structutal.adapter.test;

import com.structutal.adapter.model.MediaAdapter;

public class AdapterTest {
	public static void main(String[] args) {
		MediaAdapter player = new MediaAdapter("MP4");

		MediaAdapter player2 = new MediaAdapter("AVI");

		player.play("mp4", "myMovie.mp4");

		player2.play("AVi", "video.AVI");

		}

		
		
	}


